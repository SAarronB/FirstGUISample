package gui.controller;

//----------------------------IMPORTS-----------------------------
import gui.model.Bee;
import gui.view.FirstFrame;
//----------------------------IMPORTS-----------------------------

public class GUIController{
	
//----------------------------CALLS-------------------------------
	private Bee myBee;
	private FirstFrame appFrame;
//----------------------------CALLS-------------------------------
	
//---------------------SETING UP FRAME AND METHOD-----------------
	public GUIController() {
//MODEL FIRST THEN VIEW OR APP WILL CRASH
		myBee = new Bee();
		appFrame = new FirstFrame(this);
	}
//---------------------SETING UP FRAME AND METHOD------------------
	
//------------------------PROGRAM STARTS HERE-----------------------
	public void start() {
		
	}
//------------------------PROGRAM STARTS HERE-----------------------
}
