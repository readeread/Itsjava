package com821.Test;

public enum ChessMan {
	BLACK("��"),WHITE("��");
	
	/*public static final Chessman BLACK = new Chessman(����);
	public static final Chessman WHITE = new Chessman(����);
*/
	private String chessman;
	/**
	 * ˽�й�����
	 */
	private ChessMan(String chessman) {
		this.chessman = chessman;
	}
	
	
	/**
	 * @return ������߰���
	 */
	public String getChessman() {
		return this.chessman;
	}

}
