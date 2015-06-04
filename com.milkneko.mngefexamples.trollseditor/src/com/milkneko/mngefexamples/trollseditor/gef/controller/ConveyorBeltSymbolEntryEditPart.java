package com.milkneko.mngefexamples.trollseditor.gef.controller;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

import com.milkneko.mngefexamples.trollseditor.gef.model.ConveyorBeltSymbolEntry;
import com.milkneko.mngefexamples.trollseditor.gef.view.ConveyorBeltSymbolEntryFigure;

public class ConveyorBeltSymbolEntryEditPart extends AbstractGraphicalEditPart {
	private static int WIDTH = 25;
	private static int HEIGHT = 25;
	
	
	@Override
	protected IFigure createFigure() {
		ConveyorBeltSymbolEntry conveyorBeltSymbolEntry = (ConveyorBeltSymbolEntry) getModel();
		
		ConveyorBeltSymbolEntryFigure figure = new ConveyorBeltSymbolEntryFigure();
		figure.setLayout(new Rectangle(conveyorBeltSymbolEntry.getIndex()*WIDTH, 0, WIDTH, HEIGHT));
		figure.setCharID(conveyorBeltSymbolEntry.getSymbol().getCharacterID());
		
		return figure;
	}

	@Override
	protected void createEditPolicies() {
		// TODO Auto-generated method stub

	}

}
