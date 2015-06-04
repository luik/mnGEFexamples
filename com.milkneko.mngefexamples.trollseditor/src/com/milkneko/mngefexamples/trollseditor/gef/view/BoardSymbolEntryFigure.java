package com.milkneko.mngefexamples.trollseditor.gef.view;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.ImageFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Rectangle;

import com.milkneko.mngefexamples.trollseditor.SymbolsImagesProvider;

public class BoardSymbolEntryFigure extends Figure {
	private Label charIDLabel;
	private Label charIDbackgroundLabel;
	private Rectangle layout;
	private ImageFigure symbolFigure;
	
	public BoardSymbolEntryFigure() {
		symbolFigure = new ImageFigure();
		add(symbolFigure);
		
		XYLayout layout = new XYLayout();
		setLayoutManager(layout);
		
		charIDbackgroundLabel = new Label();
		charIDbackgroundLabel.setForegroundColor(ColorConstants.white);
		add(charIDbackgroundLabel);
		
		setConstraint(charIDbackgroundLabel, new Rectangle(3, 3, -1, -1));
		
		charIDLabel = new Label();
		charIDLabel.setForegroundColor(ColorConstants.black);
		add(charIDLabel);
		
		setConstraint(charIDLabel, new Rectangle(2, 2, -1, -1));
		
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
		charIDbackgroundLabel.setText(String.valueOf(charID));
	}
	
	public void setIndex(int index){
		symbolFigure.setImage(SymbolsImagesProvider.getImageOfSymbol(index));
		setConstraint(symbolFigure, new Rectangle(0, 0, -1, -1));
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
