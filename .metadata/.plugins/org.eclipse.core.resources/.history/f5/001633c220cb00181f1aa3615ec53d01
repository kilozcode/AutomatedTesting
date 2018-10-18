package formValidation;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.TextField;

public class MainRunnerForm {

	 
	
		public static void main(String args[])
		{
			Frame homePage = new Frame("Home Page");
			homePage.setAlwaysOnTop(true);
			homePage.setVisible(true);
			
			Frame logInPage = new Frame("Log In Page"); 
			logInPage.setVisible(true); 
			
			Frame signUpPage = new Frame("Sign Up Page");
			signUpPage.setVisible(true);
			
			// hello friend
						
			Button b1 = new Button("LogIn"); 
			Button b2 = new Button("SignUp");
			Button b3 = new Button("Main");
			
			b1.setBackground(Color.pink);
			b3.setBackground(Color.green);
			b2.setBackground(Color.ORANGE);
		
			TextField logInBox = new TextField(); 
			homePage.add(logInBox, BorderLayout.NORTH);
			logInBox.setVisible(true);
			
			logInPage.add(b1, BorderLayout.NORTH);
			signUpPage.add(b2, BorderLayout.EAST); 
			homePage.add(b3, BorderLayout.CENTER); 
			
			FormCreation F = new FormCreation(logInBox); 
			b3.addActionListener(F);
			
			
//			
//			
//			//FormCreation FF = new FormCreation();
//			ButtonB B = new ButtonB(); 
//			logInBox.addActionListener(B);
//			homePage.add(logInBox);
			//logInBox.setText("HELLO WORLD");
			
			
			//			TextField logInBox = new TextField(); 
//			logInBox.setVisible(true);
//			homePage.add(logInBox, BorderLayout.NORTH);
			//logInBox.addActionListener(F);
			
			
			
			
		}

		
}
