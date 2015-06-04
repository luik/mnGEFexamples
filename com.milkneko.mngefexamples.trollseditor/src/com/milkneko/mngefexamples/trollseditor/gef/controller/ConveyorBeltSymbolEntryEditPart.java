package com.milkneko.mngefexamples.trollseditor.gef.controller;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

import com.milkneko.mngefexamples.trollseditor.gef.model.ConveyorBeltSymbolEntry;
import com.milkneko.mngefexamples.trollseditor.gef.view.ConveyorBeltSymbolEntryFigure;

public class ConveyorBeltSymbolEntryEditPart extends AbstractGraphicalEditPart {
	private static int WIDTH = 26;
	private static int HEIGHT = 26;
	
	
	@Override
	protected IFigure createFigure() {
		ConveyorBeltSymbolEntry conveyorBeltSymbolEntry = (ConveyorBeltSymbolEntry) getModel();
		
		ConveyorBeltSymbolEntryFigure figure = new ConveyorBeltSymbolEntryFigure();
		figure.setLayout(new Rectangle(conveyorBeltSymbolEntry.getIndex()%10*WIDTH, conveyorBeltSymbolEntry.getIndex()/10*HEIGHT, WIDTH, HEIGHT));
		figure.setCharID(conveyorBeltSymbolEntry.getSymbol().getCharacterID());
		figure.setIndex(conveyorBeltSymbolEntry.getSymbol().getIndex());
		
		return figure;
	}

	@Override
	protected void createEditPolicies() {
		// TODO Auto-generated method stub

	}

}
