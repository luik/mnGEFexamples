package com.milkneko.mngefexamples.trollseditor.gef.model;

import java.util.ArrayList;
import java.util.List;

public class ConveyorBelt {
	private List<ConveyorBeltSymbolEntry> conveyorBeltSymbolEntries;
	
	public ConveyorBelt() {
		conveyorBeltSymbolEntries = new ArrayList<>();
	}
	
	public void addConveyorBeltSymbolEntry(ConveyorBeltSymbolEntry conveyorBeltSymbolEntry){
		conveyorBeltSymbolEntries.add(conveyorBeltSymbolEntry.getIndex(), conveyorBeltSymbolEntry);
	}
	
	public void removeConveyorBeltSymbolEntry(int index){
		conveyorBeltSymbolEntries.remove(index);
	}
	
	public ConveyorBeltSymbolEntry getConveyorBeltSymbolEntry(int index){
		return conveyorBeltSymbolEntries.get(index);
	}
	
	public List<ConveyorBeltSymbolEntry> getConveyorBeltSymbolEntries(){
		return conveyorBeltSymbolEntries;
	}
}
