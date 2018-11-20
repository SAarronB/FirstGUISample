package gui.view;

//----------------------------||IMPORTS||-----------------------------
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import gui.controller.GUIController;
//----------------------------||IMPORTS||-----------------------------

//ALL WORK FOR GUI IS IN THIS FILE!!!

public class FirstPanel extends JPanel{

//----------------------------||CALLS||-------------------------------
	private GUIController appController;
	private JButton myButton;
	private JLabel myLabel;
	private SpringLayout appLayout;
//----------------------------||CALLS||-------------------------------
	
	
//---------------------||MAKES CONTENT IN PANEL||---------------------
	public FirstPanel(GUIController appController) {
		//SUPER MUST BE THE FIRST THING IN A CONSTRUCTOR IF THE CLASS HAS AN EXTENDS
		super();
		this.appController = appController;
		myButton = new JButton("BUZZ BUZZZZ!!!");
		myLabel = new JLabel("Words 4 U");
		appLayout = new SpringLayout();
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
//---------------------||MAKES CONTENT IN PANEL||---------------------


//---------------------||SETS CONTENT ON SCREEN||---------------------
	private void setupLayout(){
		// SETS LOCATION
		appLayout.putConstraint(SpringLayout.NORTH, myLabel, 74, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.EAST, myLabel, -86, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.WEST, myLabel, 174, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, myLabel, -134, SpringLayout.SOUTH, this);
	}
//---------------------||SETS CONTENT ON SCREEN||---------------------
	
	
//--------------------------||MAKES COLOR||----------------------------
	private void changeColor() {
		int red = (int)(Math.random() * 256);
		int blue = (int)(Math.random() * 256);
		int green = (int)(Math.random() * 256);
		this.setBackground(new Color(red, green, blue));
	}
//--------------------------||MAKES COLOR||----------------------------
	

//--------------------------||EVENT LISTENERS||------------------------
	private void setupListeners(){
		// ADD YOUR LISTENERS
		myButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent mouseClick) {
				changeColor();
			}
		});		
	}
//--------------------------||EVENT LISTENERS||------------------------
	
	
//------------------||SETSUP LAYOUT BUTTON AND LABEL||------------------
	private void setupPanel()
	{
		//GET THINGS UP AND RUNNING
		this.setLayout(appLayout);
		this.add(myButton);
		this.add(myLabel);
	}
//------------------||SETSUP LAYOUT BUTTON AND LABEL||------------------
}