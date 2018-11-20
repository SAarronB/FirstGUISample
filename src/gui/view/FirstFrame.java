package gui.view;

//----------------------------IMPORTS-----------------------------
import javax.swing.JFrame;
import gui.controller.GUIController;
//----------------------------IMPORTS-----------------------------


public class FirstFrame extends JFrame{
	
//------------------------------CALLS-------------------------------
	private GUIController appController;
	private FirstPanel appPanel;
//------------------------------CALLS-------------------------------
	
//--------------------------SETTING FRAME---------------------------
	public FirstFrame(GUIController appController) {
//FIRST LINE OF A CONSTRUCTOR WITH A EXTENDS NEEDS TO BE SUPER();
		super();
		this.appPanel = new FirstPanel(appController);
		this.appController = appController;
		setupFrame();
	}
//--------------------------SETTING FRAME---------------------------

	
//--------------------||TELLS FRAME HOW TO LOOK||-------------------
	private void setupFrame() {
		this.setContentPane(appPanel);
		this.setSize(800, 800);
		this.setTitle("Le GUI");
		this.setResizable(true);
		
		//THE LAST LINE MUST BE SETVISIBLE TRUE
		this.setVisible(true);
	}
//--------------------||TELLS FRAME HOW TO LOOK||-------------------
}
