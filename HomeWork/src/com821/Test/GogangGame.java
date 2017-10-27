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
		//trueΪ��Ϸ����
		boolean isOver = false;
		chessboard.initBoard();
		chessboard.printBoard();
		System.out.println("����������������꣬Ӧ��x,y�ĸ�ʽ���룺");
		//��ȡ���̵�����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputStr = null;
		//br.readLine:ÿ����������һ�����ݰ��س���������������ݱ�br��ȡ��
		try {
			while( (inputStr = br.readLine()) != null ) {
				isOver = false;
				if( !isValid( inputStr ) ) {
					//������Ϸ���Ҫ���������룬�ټ���
					continue;
				}
				
				//�Ѷ�Ӧ������Ԫ�ظ�Ϊ"��"
				String chessman = ChessMan.BLACK.getChessman();
				chessboard.setBoard( posX , posY , chessman );
				//�ж��û��Ƿ�Ӯ��
				if( isWon( posX , posY , chessman ) ) {
					isOver = true;
				} else {   
					//��������ѡ��λ������
					int[] computerPosArr = computerDo();
					chessman = ChessMan.WHITE.getChessman();
					chessboard.setBoard( computerPosArr[0] , computerPosArr[1] , chessman );
					//�жϼ�����Ƿ�Ӯ��
					if( isWon( computerPosArr[0] , computerPosArr[1] , chessman ) ) {
						isOver = true;
					}
				}
				
				//�������ʤ�ߣ�ѯ���û��Ƿ������Ϸ
				if( isOver ) {
					//������������³�ʼ�����̣�������Ϸ
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
					
					//������������˳�����
					break;
				}
				
				chessboard.printBoard();
				System.out.println("����������������꣬Ӧ��x,y�ĸ�ʽ���룺");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public boolean isReplay(ChessMan chessman)
	{
		if(chessman.equals("��"))
		{
			System.out.println("�����ʤ");
		}
		else
		{
			System.out.println("�����ʤ");
		}
		System.out.println("����Y������Ϸ�������˳���Ϸ");
		
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
		//�ж������Ƿ�����
		fors:
		for( int i = 0 ; i < board.length ; i++ ) {
			for( int j = 0 ; j < board.length ; j++ ) {
				if(board[i][j].equals("ʮ")) 
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
		//�������x���꣬����ά�������һά��ֵ
		int posX = (int)(Math.random() * ( chessboard.BOARD_SIZE - 1 ) );
		//�������y���꣬����ά��������ά��ֵ
		int posY = (int)(Math.random() * ( chessboard.BOARD_SIZE - 1 ) );
		String[][] board = chessboard.getBoard();
		//�������е�λ�ò��ǡ�ʮ����ʱ���Ѿ������ӣ������ٴ������µ�����
		//��������ǲ�����
		
		int[] arr=new int[2];

		if( board[posX][posY] != "ʮ" ) {
			chessboard.printBoard();
			System.out.println( "��λ���Ѿ������ӣ����������룺" );
			return arr;
		}
		while( board[posX][posY] != "ʮ" ) {
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
		 ? "��ϲ������Ӯ�ˣ�" : "���ź��������ˣ�";
			System.out.println( message + "����һ�֣�(y/n)" );
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			if( br.readLine().equals("y") ) {
				//��ʼ��һ��
				return true;
			}
			return false;		
		}

	
	public boolean isWon(int x,int y,String chessman)
	{
		//ֱ������X����
		int startX = 0;
		//ֱ�����Y����
		int startY = 0;
		//ֱ�߽���X����
		int endX = chessboard.BOARD_SIZE - 1;
		//ֱ�߽���Y����
		int endY = endX;
		//ͬ��ֱ�������������ۻ���
		int sameCount = 0;
		int temp = 0;		
		//����������СX������Y����
		temp = posX - WIN_COUNT + 1;
		startX = temp < 0 ? 0 : temp;
		temp = posY - WIN_COUNT + 1;
		startY = temp < 0 ? 0 : temp;
		//�����յ�����X������Y����
		temp = posX + WIN_COUNT - 1;
		endX = temp > chessboard.BOARD_SIZE - 1 ? 
			chessboard.BOARD_SIZE - 1 : temp;
		temp = posY + WIN_COUNT - 1;
		endY = temp > chessboard.BOARD_SIZE - 1 ? 
			chessboard.BOARD_SIZE - 1 : temp;
		//�����ҷ��������ͬ�������ӵ���Ŀ
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
			System.out.println("����(����,����)�ĸ�ʽ���룺");
			return false;
		}
		
		//���������ֵ�Ƿ��ڷ�Χ֮��
		if( posX < 0 || posX >= chessboard.BOARD_SIZE || posY < 0 
			|| posY >= chessboard.BOARD_SIZE ) 
		{
			chessboard.printBoard();
			System.out.println( "X��Y����ֻ�ܴ��ڵ���1,��С�ڵ���" 
				+ chessboard.BOARD_SIZE + ",���������룺" );
			return false;
		}

		//��������λ���Ƿ��Ѿ�������
		String[][] board = chessboard.getBoard();
		if( board[posX][posY] != "ʮ" ) {
			chessboard.printBoard();
			System.out.println( "��λ���Ѿ������ӣ����������룺" );
			return false;
		}
		return true;
	}
	
 	public boolean input()
	{
		//��ȡ���̵�����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputStr = null;
		//br.readLine:ÿ����������һ�����ݰ��س���������������ݱ�br��ȡ��
		try {
			while( (inputStr = br.readLine()) != null ) {
				/**
			      * �����������
			      */
				
				//���û�������ַ����Զ���(,)��Ϊ�ָ����ָ��������ַ���
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}
}
