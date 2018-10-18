import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*; 

public class Calc {

	public void createCalc()
	{
		Frame F = new Frame(); 
		F.setVisible(true); 
		F.setSize(600,600);
		
		Panel top = new Panel();
		top.setBackground(Color.PINK);
		top.setSize(300,200);
		
		TextField result = new TextField(); 
		result.setSize(100, 80);
		top.add(result); 

		Panel center = new Panel();
		center.setBackground(Color.blue);
		
		FlowLayout flow = new FlowLayout(); 
//		F.setLayout(flow);
//		
		top.setLayout(flow);
		
		GridLayout grid = new GridLayout(4,4); 
		center.setLayout(grid);
		
		F.add(top, BorderLayout.NORTH);
		F.add(center, BorderLayout.CENTER);
		
		Button B0 = new Button("0");
		Button B1 = new Button("1");
		Button B2 = new Button("2");
		Button B3 = new Button("3");
		Button B4 = new Button("4");
		Button B5 = new Button("5");
		Button B6 = new Button("6");
		Button B7 = new Button("7");
		Button B8 = new Button("8");
		Button B9 = new Button("9");
		Button equal = new Button("=");
		Button add = new Button("+");
		Button multiply = new Button("*");
		Button divide = new Button("/");
		Button subtract = new Button("-");
		Button C = new Button("Clear");
		
		center.add(B0);
		center.add(B1);
		center.add(B2);
		center.add(add);
		
		center.add(B3);
		center.add(B4);
		center.add(B5);
		center.add(multiply);
		
		center.add(B6);
		center.add(B7);
		center.add(B8);
		center.add(divide);
		
		center.add(B9);
		center.add(equal);	
		center.add(C);
		center.add(subtract);
		
		
//		int num1;
//		int num2; 
//		
//		B0.addActionListener(new ActionListener() {
//			int clicked = 0;
//			public void actionPerformed(ActionEvent click)
//			{
//				
//				clicked++;
//				
//				if(clicked == 1)
//				{
//					num1 = 0;
//				}
//				
//				if(clicked == 2)
//				{
//					num2 = 0;
//				}
//				
//			}
//	});
	}
}
