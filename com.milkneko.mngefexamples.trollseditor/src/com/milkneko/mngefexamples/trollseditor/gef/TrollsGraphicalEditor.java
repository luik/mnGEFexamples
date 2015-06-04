package com.milkneko.mngefexamples.trollseditor.gef;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.gef.ui.parts.GraphicalEditor;

import com.milkneko.mngefexamples.trollseditor.gef.model.BoardSymbolEntry;
import com.milkneko.mngefexamples.trollseditor.gef.model.ConveyorBeltSymbolEntry;
import com.milkneko.mngefexamples.trollseditor.gef.model.Match;

public class TrollsGraphicalEditor extends GraphicalEditor {
	public static final String ID = "com.milkneko.mngefexamples.trollseditor";
	
	public TrollsGraphicalEditor() {
		setEditDomain(new DefaultEditDomain(this));
	}
	
	@Override
	protected void initializeGraphicalViewer() {
		GraphicalViewer viewer = getGraphicalViewer();
		viewer.setContents(createMatch());
	}

	@Override
	public void doSave(IProgressMonitor monitor) {
		// TODO Auto-generated method stub
	}
	
	@Override
	protected void configureGraphicalViewer() {
		super.configureGraphicalViewer();
		
		GraphicalViewer viewer = getGraphicalViewer();
		viewer.setEditPartFactory(new TrollsEditorEditPartFactory());
	}
	
	private Match createMatch(){
		Match match = new Match();
		
		ConveyorBeltSymbolEntry conveyorBeltSymbolEntry = new ConveyorBeltSymbolEntry();
		conveyorBeltSymbolEntry.setIndex(0);
		conveyorBeltSymbolEntry.setSymbol(match.getSymbolWithIndex(10));
		match.getConveyorBelt().addConveyorBeltSymbolEntry(conveyorBeltSymbolEntry);
		
		conveyorBeltSymbolEntry = new ConveyorBeltSymbolEntry();
		conveyorBeltSymbolEntry.setIndex(1);
		conveyorBeltSymbolEntry.setSymbol(match.getSymbolWithIndex(11));
		match.getConveyorBelt().addConveyorBeltSymbolEntry(conveyorBeltSymbolEntry);
		
		BoardSymbolEntry boardSymbolEntry = new BoardSymbolEntry();
		boardSymbolEntry.setRow(0);
		boardSymbolEntry.setColumn(0);
		boardSymbolEntry.setSymbol(match.getSymbolWithIndex(1));
		match.getBoard().addBoardSymbolEntry(boardSymbolEntry);
		
		boardSymbolEntry = new BoardSymbolEntry();
		boardSymbolEntry.setRow(0);
		boardSymbolEntry.setColumn(1);
		boardSymbolEntry.setSymbol(match.getSymbolWithIndex(2));
		match.getBoard().addBoardSymbolEntry(boardSymbolEntry);
		
		boardSymbolEntry = new BoardSymbolEntry();
		boardSymbolEntry.setRow(1);
		boardSymbolEntry.setColumn(0);
		boardSymbolEntry.setSymbol(match.getSymbolWithIndex(3));
		match.getBoard().addBoardSymbolEntry(boardSymbolEntry);
		
		boardSymbolEntry = new BoardSymbolEntry();
		boardSymbolEntry.setRow(1);
		boardSymbolEntry.setColumn(1);
		boardSymbolEntry.setSymbol(match.getSymbolWithIndex(4));
		match.getBoard().addBoardSymbolEntry(boardSymbolEntry);
		
		return match;
	}

}
