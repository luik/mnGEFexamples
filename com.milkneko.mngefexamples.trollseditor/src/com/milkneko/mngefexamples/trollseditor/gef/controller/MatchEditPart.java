package com.milkneko.mngefexamples.trollseditor.gef.controller;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

import com.milkneko.mngefexamples.trollseditor.gef.model.Match;
import com.milkneko.mngefexamples.trollseditor.gef.view.MatchFigure;

public class MatchEditPart extends AbstractGraphicalEditPart {

	@Override
	protected IFigure createFigure() {
		IFigure figure = new MatchFigure();
		return figure;
	}

	@Override
	protected void createEditPolicies() {
		// TODO Auto-generated method stub
	}
	
	@Override
	protected List<?> getModelChildren() {
		Match match = (Match) getModel();
		
		List<Object> list = new ArrayList<>();
		list.add(match.getConveyorBelt());
		list.add(match.getBoard());
		return list;
	}

}
