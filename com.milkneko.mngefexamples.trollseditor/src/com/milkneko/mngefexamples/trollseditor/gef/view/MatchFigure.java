package com.milkneko.mngefexamples.trollseditor.gef.view;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Rectangle;

public class MatchFigure extends Figure {
	public MatchFigure() {
		XYLayout layout = new XYLayout();
		setLayoutManager(layout);
	}
	
	public void setLayout(Rectangle rect) {
		setBounds(rect);
	}
}
