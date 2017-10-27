package com821.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GogangGame {
	int posX;
	int posY;
	final int WIN_COUNT=5;
	ChessBoard chessboard;

	public static void main(String[] args) {
		GogangGame go=new GogangGame();
		go.start();
	}
	
	public void start() {
		chessboard=new ChessBoard();
		//true为游戏结束
		boolean isOver = false;
		chessboard.initBoard();
		chessboard.printBoard();
		System.out.println("请输入您下棋的坐标，应以x,y的格式输入：");
		//获取键盘的输入
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputStr = null;
		//br.readLine:每当键盘输入一行内容按回车键，则输入的内容被br读取到
		try {
			while( (inputStr = br.readLine()) != null ) {
				isOver = false;
				if( !isValid( inputStr ) ) {
					//如果不合法，要求重新输入，再继续
					continue;
				}
				
				//把对应的数组元素赋为"●"
				String chessman = ChessMan.BLACK.getChessman();
				chessboard.setBoard( posX , posY , chessman );
				//判断用户是否赢了
				if( isWon( posX , posY , chessman ) ) {
					isOver = true;
				} else {   
					//计算机随机选择位置坐标
					int[] computerPosArr = computerDo();
					chessman = ChessMan.WHITE.getChessman();
					chessboard.setBoard( computerPosArr[0] , computerPosArr[1] , chessman );
					//判断计算机是否赢了
					if( isWon( computerPosArr[0] , computerPosArr[1] , chessman ) ) {
						isOver = true;
					}
				}
				
				//如果产生胜者，询问用户是否继续游戏
				if( isOver ) {
					//如果继续，重新初始化棋盘，继续游戏
					try {
						if( isReplay( chessman ) ) {
							chessboard.initBoard();
							chessboard.printBoard();
							continue;
						}
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					//如果不继续，退出程序
					break;
				}
				
				chessboard.printBoard();
				System.out.println("请输入您下棋的坐标，应以x,y的格式输入：");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public boolean isReplay(ChessMan chessman)
	{
		if(chessman.equals("●"))
		{
			System.out.println("黑棋获胜");
		}
		else
		{
			System.out.println("白旗获胜");
		}
		System.out.println("输入Y继续游戏，或者退出游戏");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputStr=null;
		try {
			while( (inputStr = br.readLine()) != null ) 
			{
				break;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(inputStr.equals("Y")||inputStr.equals("y"))
			return true;
		else return false;
				
	}
	
	public boolean isFull()
	{
		boolean mark=false;
		String[][] board = chessboard.getBoard();
		//判断棋盘是否满了
		fors:
		for( int i = 0 ; i < board.length ; i++ ) {
			for( int j = 0 ; j < board.length ; j++ ) {
				if(board[i][j].equals("十")) 
				{
					mark=true;
					break fors;					
				}
			}
		}
		if(mark)
		{
			return false;
		}
		return true;
	}
	
	public int[] computerDo()
	{
		//随机生成x坐标，即二维数组具体一维的值
		int posX = (int)(Math.random() * ( chessboard.BOARD_SIZE - 1 ) );
		//随机生成y坐标，即二维数组具体二维的值
		int posY = (int)(Math.random() * ( chessboard.BOARD_SIZE - 1 ) );
		String[][] board = chessboard.getBoard();
		//当棋盘中的位置不是“十”的时候（已经有棋子），则再次生成新的坐标
		//检查棋盘是不是满
		
		int[] arr=new int[2];

		if( board[posX][posY] != "十" ) {
			chessboard.printBoard();
			System.out.println( "此位置已经有棋子，请重新输入：" );
			return arr;
		}
		while( board[posX][posY] != "十" ) {
			posX = (int)(Math.random() * ( chessboard.BOARD_SIZE - 1 ) );
			posY = (int)(Math.random() * ( chessboard.BOARD_SIZE - 1 ));		
		}
		arr[0]=posX;arr[1]=posY;
		return arr;
	}
	
	public boolean isReplay( String chessman ) 
			throws Exception {
			chessboard.printBoard();
			String message = chessman.equals(ChessMan.BLACK.getChessman())
		 ? "恭喜您，您赢了，" : "很遗憾，您输了，";
			System.out.println( message + "再下一局？(y/n)" );
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			if( br.readLine().equals("y") ) {
				//开始新一局
				return true;
			}
			return false;		
		}

	
	public boolean isWon(int x,int y,String chessman)
	{
		//直线起点的X坐标
		int startX = 0;
		//直线起点Y坐标
		int startY = 0;
		//直线结束X坐标
		int endX = chessboard.BOARD_SIZE - 1;
		//直线结束Y坐标
		int endY = endX;
		//同条直线上相邻棋子累积数
		int sameCount = 0;
		int temp = 0;		
		//计算起点的最小X坐标与Y坐标
		temp = posX - WIN_COUNT + 1;
		startX = temp < 0 ? 0 : temp;
		temp = posY - WIN_COUNT + 1;
		startY = temp < 0 ? 0 : temp;
		//计算终点的最大X坐标与Y坐标
		temp = posX + WIN_COUNT - 1;
		endX = temp > chessboard.BOARD_SIZE - 1 ? 
			chessboard.BOARD_SIZE - 1 : temp;
		temp = posY + WIN_COUNT - 1;
		endY = temp > chessboard.BOARD_SIZE - 1 ? 
			chessboard.BOARD_SIZE - 1 : temp;
		//从左到右方向计算相同相邻棋子的数目
		String[][] board = chessboard.getBoard();
		for( int i = startY; i < endY; i++) {
			if( board[posX][i] == "" && board[posX][i+1] == "" ) {
				sameCount++;
			} else if( sameCount != WIN_COUNT - 1 ) {
				sameCount = 0;
			}
		}

		return true;
	}
	
	public boolean isValid(String inputStr)
	{
		String[] posStrArr = inputStr.split(",");
		try {
			posX = Integer.parseInt( posStrArr[0] ) - 1;
			posY = Integer.parseInt( posStrArr[1] ) - 1;				
		} catch (NumberFormatException e) {
			chessboard.printBoard();
			System.out.println("请以(数字,数字)的格式输入：");
			return false;
		}
		
		//检查输入数值是否在范围之内
		if( posX < 0 || posX >= chessboard.BOARD_SIZE || posY < 0 
			|| posY >= chessboard.BOARD_SIZE ) 
		{
			chessboard.printBoard();
			System.out.println( "X与Y坐标只能大于等于1,与小于等于" 
				+ chessboard.BOARD_SIZE + ",请重新输入：" );
			return false;
		}

		//检查输入的位置是否已经有棋子
		String[][] board = chessboard.getBoard();
		if( board[posX][posY] != "十" ) {
			chessboard.printBoard();
			System.out.println( "此位置已经有棋子，请重新输入：" );
			return false;
		}
		return true;
	}
	
 	public boolean input()
	{
		//获取键盘的输入
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputStr = null;
		//br.readLine:每当键盘输入一行内容按回车键，则输入的内容被br读取到
		try {
			while( (inputStr = br.readLine()) != null ) {
				/**
			      * 处理键盘输入
			      */
				
				//将用户输入的字符串以逗号(,)作为分隔，分隔成两个字符串
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}
}
