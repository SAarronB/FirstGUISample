package gui.view;

import gui.controller.GUIController;
import javax.swing.*;

//ALL WORK FOR GUI IS IN THIS FILE!!!

public class FirstPanel extends JPanel{
	
	private GUIController appController;
	private JButton myButton;
	private JLabel myLabel;
	private SpringLayout appLayout;
	
	public FirstPanel(GUIController appController) {
		super();
		this.appController = appController;
		myButton = new JButton("BUZZ BUZZZZ!!!");
		myLabel = new JLabel("Words 4 U");
		appLayout = new SpringLayout();
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	private void setupListeners()
	{
		// ADD YOUR LISTENERS

		
	}
	private void setupLayout()
	{
		// TODO Auto-generated method stub
		appLayout.putConstraint(SpringLayout.NORTH, myLabel, 74, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.EAST, myLabel, -86, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.WEST, myLabel, 174, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, myLabel, -134, SpringLayout.SOUTH, this);
	}
	private void setupPanel()
	{
		//GET THINGS UP AND RUNNING
		this.setLayout(appLayout);
		this.add(myButton);
		this.add(myLabel);
	}
}