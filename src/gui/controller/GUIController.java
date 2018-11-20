package gui.controller;

import gui.model.Bee;
import gui.view.FirstFrame;

public class GUIController{
	private Bee myBee;
	private FirstFrame appFrame;
	public GUIController() {
//MODEL FIRST THEN VIEW OR APP WILL CRASH
		myBee = new Bee();
		appFrame = new FirstFrame(this);
	}
	
	public void start() {
		
	}
	
}
