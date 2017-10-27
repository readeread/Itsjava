package com821.Test;

public class ChessBoard {
	int BOARD_SIZE=13;
	String[][] board;
	
	public void initBoard() {
		//��ʼ����������
		board = new String[BOARD_SIZE][BOARD_SIZE];
		//��ÿ��Ԫ�ظ�ֵΪ��ʮ�������ڿ���̨�������
		for( int i = 0 ; i < BOARD_SIZE ; i++ ) {
			for( int j = 0 ; j < BOARD_SIZE ; j++ ) {
				board[i][j] = "ʮ";
			}
		}
	}
	
	public void printBoard() {
		//��ӡÿ������Ԫ��
		for( int i = 0 ; i < BOARD_SIZE ; i++ ) {
				for( int j = 0 ; j < BOARD_SIZE ; j++ ) {
					//��ӡ�󲻻���
					System.out.print( board[i][j] +"  ");
				}
				//ÿ��ӡ��һ������Ԫ�ؾͻ���һ��
				System.out.print("\n");
		}
	}
	
	/**
	* ��������
	* @return ��������
	*/
	public String[][] getBoard() {
		return this.board;
	}
	
	public void setBoard(int posX, int posY, String chessman) {
		board[posX][posY]=chessman;
	}



}

