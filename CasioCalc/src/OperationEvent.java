import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*; 


public class OperationEvent implements ActionListener{

	int clicked = 0;
	int num1;
	int num2; 
	
	Button b; 
	Button c;
	Button d;
	Button e; 
	Button f;
	Button g;
	Button h;
	Button i;
	Button j; 
	Button k;
	Button l;
	Button a; 
	Button m;
	Button n; 
	Button p;
	Button q; 
	TextField t;
	
	Button[] buttons = {b, c, d, f, g, h, j, k , l, m, n };
	Button[] symbol = {e, i, a, p, q};
	
	public void actionPerformed(ActionEvent create)
	{
		clicked ++; 
			
		if(clicked == 1)
		{
			for(i = 0; i <= buttons.length; i++)
			{
				Button btn = (Button)create.getSource();
				String titleBtn = btn.getLabel();
				
				if(titleBtn.equals())
				{
					
				}
			}
			 
		}
		
		if (clicked == 3)
		{
			num 2 =
		}
		
		if()
	}
	
	public OperationEvent(Button A,Button B, Button C, Button D, Button E, Button F, Button G, Button H, Button I, Button J, Button K, Button L, Button M, Button N, Button O, Button P, TextField T)
	{
		b = A;
		c = B;
		d = C; 
		e = D;
		f = E; 
		g = F;
		h = G;
		i = H;
		j = I;
		k = J;
		l = K;
		a = L;
		m = M;
		n = N;
		p = O;
		q = P;
		t = T;
	}
}
