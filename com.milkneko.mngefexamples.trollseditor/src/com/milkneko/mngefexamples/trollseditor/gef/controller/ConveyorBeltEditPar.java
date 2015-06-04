package com.milkneko.mngefexamples.trollseditor.gef.controller;

import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

import com.milkneko.mngefexamples.trollseditor.gef.model.ConveyorBelt;
import com.milkneko.mngefexamples.trollseditor.gef.view.ConveyorBeltFigure;

public class ConveyorBeltEditPar extends AbstractGraphicalEditPart {

	@Override
	protected IFigure createFigure() {
		IFigure figure = new ConveyorBeltFigure();	
		figure.setBounds(new Rectangle(0, 0, 500, 500));
		
		return figure;
	}

	@Override
	protected void createEditPolicies() {
		// TODO Auto-generated method stub
	}
	
	protected List<?> getModelChildren() {
		ConveyorBelt conveyorBelt = (ConveyorBelt) getModel();
		
		return conveyorBelt.getConveyorBeltSymbolEntries();
	}

}
