package com.milkneko.mngefexamples.trollseditor.gef;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

import com.milkneko.mngefexamples.trollseditor.gef.controller.BoardEditPart;
import com.milkneko.mngefexamples.trollseditor.gef.controller.BoardSymbolEntryEditPart;
import com.milkneko.mngefexamples.trollseditor.gef.controller.ConveyorBeltEditPar;
import com.milkneko.mngefexamples.trollseditor.gef.controller.ConveyorBeltSymbolEntryEditPart;
import com.milkneko.mngefexamples.trollseditor.gef.controller.MatchEditPart;
import com.milkneko.mngefexamples.trollseditor.gef.model.Board;
import com.milkneko.mngefexamples.trollseditor.gef.model.BoardSymbolEntry;
import com.milkneko.mngefexamples.trollseditor.gef.model.ConveyorBelt;
import com.milkneko.mngefexamples.trollseditor.gef.model.ConveyorBeltSymbolEntry;
import com.milkneko.mngefexamples.trollseditor.gef.model.Match;

public class TrollsEditorEditPartFactory implements EditPartFactory {

	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		AbstractGraphicalEditPart part = null;
		
		if(model instanceof Board){
			part = new BoardEditPart();
		}
		else if(model instanceof BoardSymbolEntry){
			part = new BoardSymbolEntryEditPart();
		}
		else if(model instanceof ConveyorBelt){
			part = new ConveyorBeltEditPar();
		}
		else if(model instanceof ConveyorBeltSymbolEntry){
			part = new ConveyorBeltSymbolEntryEditPart();
		}
		else if(model instanceof Match){
			part = new MatchEditPart();
		}
		
		part.setModel(model);
		
		return part;
	}

}
