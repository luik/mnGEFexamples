package com.milkneko.mngefexamples.trollseditor.gef.model;

public class BoardSymbolEntry {
	private int row = 0;
	private int column = 0;
	private int trollID = -1;
	private Symbol symbol;
	
	public int getRow() {
		return row;
	}
	
	public void setRow(int row) {
		this.row = row;
	}
	
	public int getColumn() {
		return column;
	}
	
	public void setColumn(int column) {
		this.column = column;
	}
	
	public int getTrollID() {
		return trollID;
	}
	
	public void setTrollID(int trollID) {
		this.trollID = trollID;
	}

	public Symbol getSymbol() {
		return symbol;
	}

	public void setSymbol(Symbol symbol) {
		this.symbol = symbol;
	}
	
}
