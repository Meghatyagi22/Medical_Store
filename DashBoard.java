package medicalstore;


import java.awt.BorderLayout;

import java.awt.Font;
import java.awt.Insets;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class DashBoard extends JPanel {
	
	JLabel lbHeading;
	
	JPanel headingPanel;
	
	Frame parentFrame;
	DashBoard(Frame parentFrame){
		this.parentFrame = parentFrame;
		this.setLayout(new BorderLayout());
		
		// Create a dash board
		lbHeading = new JLabel("Welcome to Medical Store Management System");
		lbHeading.setFont(new Font("cambria", Font.BOLD, 30));
		lbHeading.setBorder(new EmptyBorder(new Insets(40, 0, 20, 0)));
		JPanel temp = new JPanel();
		temp.add(lbHeading);
		
		headingPanel = new JPanel(new BorderLayout());
		headingPanel.add(temp, BorderLayout.CENTER);

	}
		public DashBoard() {
	}
		public static void main(String args[])
		{
		      DashBoard b = new DashBoard();
		}

}
