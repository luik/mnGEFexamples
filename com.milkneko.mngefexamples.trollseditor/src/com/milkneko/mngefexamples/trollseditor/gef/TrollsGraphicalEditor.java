package com.milkneko.mngefexamples.trollseditor.gef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.gef.ui.parts.GraphicalEditor;
import org.eclipse.ui.part.FileEditorInput;

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
		try{
			setPartName(((FileEditorInput) getEditorInput()).getFile().getName());
			InputStream inputStream = ((FileEditorInput) getEditorInput()).getFile().getContents();
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
			
			Match match = new Match();
			
			String line;
			while((line = bufferedReader.readLine()) != null)
			{
				if(line.indexOf("RigConveyorBelt_Symbols=") == 0){
					String conveyorBeltSymbols = line.replace("RigConveyorBelt_Symbols=", "");
					for(int i=0; i < conveyorBeltSymbols.length(); i++)
					{
						ConveyorBeltSymbolEntry conveyorBeltSymbolEntry = new ConveyorBeltSymbolEntry();
						conveyorBeltSymbolEntry.setIndex(i);
						conveyorBeltSymbolEntry.setSymbol(match.getSymbolWithChar(conveyorBeltSymbols.charAt(i)));
						match.getConveyorBelt().addConveyorBeltSymbolEntry(conveyorBeltSymbolEntry);
					}
				}
				if(line.indexOf("RigBoardRow_") == 0){
					String rowEntry = line.replace("RigBoardRow_", "");
					String[] tokens = rowEntry.split("=");
					int row = Integer.parseInt(tokens[0]);
					
					for(int i=0; i < tokens[1].length(); i++)
					{
						BoardSymbolEntry boardSymbolEntry = new BoardSymbolEntry();
						boardSymbolEntry.setRow(row);
						boardSymbolEntry.setColumn(i);
						
						boardSymbolEntry.setSymbol(match.getSymbolWithChar(tokens[1].charAt(i)));
						match.getBoard().addBoardSymbolEntry(boardSymbolEntry);
					}
				}
			}
			
			GraphicalViewer viewer = getGraphicalViewer();
			viewer.setContents(match);
		}
		catch (CoreException | IOException e) {
			e.printStackTrace();
	 	}
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
}
