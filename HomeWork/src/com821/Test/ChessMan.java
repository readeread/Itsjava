package com821.Test;

public enum ChessMan {
	BLACK("●"),WHITE("○");
	
	/*public static final Chessman BLACK = new Chessman(“●”);
	public static final Chessman WHITE = new Chessman(“○”);
*/
	private String chessman;
	/**
	 * 私有构造器
	 */
	private ChessMan(String chessman) {
		this.chessman = chessman;
	}
	
	
	/**
	 * @return 黑棋或者白棋
	 */
	public String getChessman() {
		return this.chessman;
	}

}
