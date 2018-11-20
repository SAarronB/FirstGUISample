package gui.view;

import javax.swing.JFrame;
import gui.controller.GUIController;

public class FirstFrame extends JFrame{
	private GUIController appController;
	private FirstPanel appPanel;
	public FirstFrame(GUIController appController) {
//FIRST LINE OF A CONSTRUCTOR WITH A EXTENDS NEEDS TO BE SUPER();
		super();

		this.appPanel = new FirstPanel(appController);
		this.appController = appController;
		setupFrame();
	}
	
	private void setupFrame() {
		this.setContentPane(appPanel);
		this.setSize(800, 800);
		this.setTitle("Le GUI");
		this.setResizable(true);
//THE LAST LINE MUST BE SETVISIBLE TRUE
		this.setVisible(true);
	}
}
