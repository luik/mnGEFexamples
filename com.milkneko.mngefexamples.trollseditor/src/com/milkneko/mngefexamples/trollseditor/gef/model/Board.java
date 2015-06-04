package com.milkneko.mngefexamples.trollseditor.gef.model;

import java.util.ArrayList;
import java.util.List;

public class Board {
	private List<BoardSymbolEntry> boardSymbolEntries;
	
	public Board() {
		boardSymbolEntries = new ArrayList<>();
	}
	
	public boolean addBoardSymbolEntry(BoardSymbolEntry boardSymbolEntry)
	{
		for (BoardSymbolEntry symbol : getBoardSymbolEntries()) {
			if(symbol.getColumn() == boardSymbolEntry.getColumn() && symbol.getRow() == boardSymbolEntry.getRow())
			{
				return false;
			}
		}
		
		getBoardSymbolEntries().add(boardSymbolEntry);
		return true;
	}
	
	public void removeBoardSymbolEntry(int row, int column){
		
		BoardSymbolEntry entryToRemove = null;
		
		for (BoardSymbolEntry symbol : getBoardSymbolEntries()) {
			if(symbol.getColumn() == column && symbol.getRow() == row)
			{
				entryToRemove = symbol;
			}
		}
		
		if(entryToRemove != null)
		{
			getBoardSymbolEntries().remove(entryToRemove);
		}
	}

	public List<BoardSymbolEntry> getBoardSymbolEntries() {
		return boardSymbolEntries;
	}

	
}
