package com.milkneko.mngefexamples.trollseditor.gef.model;

import java.util.ArrayList;
import java.util.List;

public class Match {
	private char[] symbolsIDS;
	
	private ConveyorBelt conveyorBelt;
	private List<Symbol> symbols;
	private Board board;
	
	public Match() {
		conveyorBelt = new ConveyorBelt();
		board = new Board();
		symbols = new ArrayList<>();
		
		//initialization;  translate to another more convenient place
		symbolsIDS = new char['9' - '0' + 'Z' - 'A'];
		
		int i;
		for(i=0; i < '9' - '0'; i++){
			symbolsIDS[i] = (char)('0' + i);
			Symbol symbol = new Symbol();
			symbol.setCharacterID(symbolsIDS[i]);
			symbols.add(i, symbol);
		}
		for(int j=0; j < 'Z' - 'A'; j++){
			symbolsIDS[i + j] = (char)('A' + j);
			Symbol symbol = new Symbol();
			symbol.setCharacterID(symbolsIDS[i + j]);
			symbols.add(i + j, symbol);
		}
	}
	
	public ConveyorBelt getConveyorBelt(){
		return conveyorBelt;
	}
	
	public Board getBoard(){
		return board;
	}
	
	public Symbol getSymbolWithIndex(int index){
		return symbols.get(index);
	}
}
