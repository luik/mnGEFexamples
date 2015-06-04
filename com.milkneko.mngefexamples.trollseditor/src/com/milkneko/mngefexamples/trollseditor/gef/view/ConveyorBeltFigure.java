package com.milkneko.mngefexamples.trollseditor.gef.view;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Rectangle;

public class ConveyorBeltFigure extends Figure {
	public ConveyorBeltFigure() {
		XYLayout layout = new XYLayout();
		setLayoutManager(layout);
	}
	
	public void setLayout(Rectangle rect) {
		getParent().setConstraint(this, rect);
	}
}
