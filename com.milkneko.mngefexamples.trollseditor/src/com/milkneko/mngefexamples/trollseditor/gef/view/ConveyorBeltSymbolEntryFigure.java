package com.milkneko.mngefexamples.trollseditor.gef.view;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Rectangle;

public class ConveyorBeltSymbolEntryFigure extends Figure {
	private Label charIDLabel;
	private Rectangle layout;
	
	public ConveyorBeltSymbolEntryFigure(){
		charIDLabel = new Label();
		
		XYLayout layout = new XYLayout();
		setLayoutManager(layout);
		
		charIDLabel.setForegroundColor(ColorConstants.black);
		add(charIDLabel);

		setConstraint(charIDLabel, new Rectangle(5, 5, -1, -1));
		
		setBorder(new LineBorder(1));
		setOpaque(true);
		
		addPropertyChangeListener("parent", new PropertyChangeListener() {
			@Override
			public void propertyChange(PropertyChangeEvent evt) {
				updateLayout();
			}
		});
	}
	
	public void setCharID(char charID){
		charIDLabel.setText(String.valueOf(charID));
	}
	
	public void setLayout(Rectangle rect) {
		layout = rect;
		updateLayout();
	}
	
	private void updateLayout(){
		if(getParent() != null && layout != null)
		{
			getParent().setConstraint(this, layout);
		}
	}
}
