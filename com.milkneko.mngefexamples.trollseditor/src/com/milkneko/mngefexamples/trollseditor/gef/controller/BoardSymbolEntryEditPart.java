package com.milkneko.mngefexamples.trollseditor.gef.controller;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

import com.milkneko.mngefexamples.trollseditor.gef.model.BoardSymbolEntry;
import com.milkneko.mngefexamples.trollseditor.gef.view.BoardSymbolEntryFigure;

public class BoardSymbolEntryEditPart extends AbstractGraphicalEditPart {

	private static int WIDTH = 26;
	private static int HEIGHT = 26;
	
	@Override
	protected IFigure createFigure() {
		BoardSymbolEntry boardSymbolEntry = (BoardSymbolEntry) getModel();
		
		BoardSymbolEntryFigure figure = new BoardSymbolEntryFigure();
		
		figure.setLayout(new Rectangle(boardSymbolEntry.getColumn()*WIDTH, boardSymbolEntry.getRow()*HEIGHT, WIDTH, HEIGHT));
		
		figure.setCharID(boardSymbolEntry.getSymbol().getCharacterID());
		figure.setIndex(boardSymbolEntry.getSymbol().getIndex());
		
		return figure;
	}

	@Override
	protected void createEditPolicies() {
		// TODO Auto-generated method stub
	}

}
