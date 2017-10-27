package com821.Test;

public class ChessBoard {
	int BOARD_SIZE=13;
	String[][] board;
	
	public void initBoard() {
		//初始化棋盘数组
		board = new String[BOARD_SIZE][BOARD_SIZE];
		//把每个元素赋值为“十”，用于控制台输出棋盘
		for( int i = 0 ; i < BOARD_SIZE ; i++ ) {
			for( int j = 0 ; j < BOARD_SIZE ; j++ ) {
				board[i][j] = "十";
			}
		}
	}
	
	public void printBoard() {
		//打印每个数组元素
		for( int i = 0 ; i < BOARD_SIZE ; i++ ) {
				for( int j = 0 ; j < BOARD_SIZE ; j++ ) {
					//打印后不换行
					System.out.print( board[i][j] +"  ");
				}
				//每打印完一行数组元素就换行一次
				System.out.print("\n");
		}
	}
	
	/**
	* 返回棋盘
	* @return 返回棋盘
	*/
	public String[][] getBoard() {
		return this.board;
	}
	
	public void setBoard(int posX, int posY, String chessman) {
		board[posX][posY]=chessman;
	}



}

