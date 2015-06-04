package com.milkneko.mngefexamples.trollseditor.gef.controller;

import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

import com.milkneko.mngefexamples.trollseditor.gef.model.Board;
import com.milkneko.mngefexamples.trollseditor.gef.view.BoardFigure;

public class BoardEditPart extends AbstractGraphicalEditPart {

	@Override
	protected IFigure createFigure() {
		BoardFigure figure = new BoardFigure();
		figure.setBounds(new Rectangle(0, 75, 500, 500));
		
		return figure;
	}

	@Override
	protected void createEditPolicies() {
		// TODO Auto-generated method stub
	}
	
	protected List<?> getModelChildren() {
		Board board = (Board) getModel();
		
		return board.getBoardSymbolEntries();
	}

}
