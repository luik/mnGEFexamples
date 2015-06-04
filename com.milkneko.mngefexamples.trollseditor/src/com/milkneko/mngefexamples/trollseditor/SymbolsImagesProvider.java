package com.milkneko.mngefexamples.trollseditor;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.eclipse.swt.graphics.Image;


public class SymbolsImagesProvider {
	private static int SYMBOLS = 20;
	
	public static Image[] symbolsImages = null;
	
	public static Image getImageOfSymbol(int index){
		if(symbolsImages == null){
			try{
				symbolsImages = new Image[SYMBOLS];
				
				for(int i=0; i<SYMBOLS; i++){
					URL url = new URL("platform:/plugin/com.milkneko.mngefexamples.trollseditor/symbols/" + (i + 1) + ".png" );
				    InputStream inputStream = url.openConnection().getInputStream();
					symbolsImages[i] = new Image(null, inputStream);
				}
			}
			catch(IOException e){
				e.printStackTrace();
			}
		}
		
		return symbolsImages[index];
	}
}
