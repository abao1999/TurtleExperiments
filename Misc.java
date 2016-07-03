package Turtle1;
import javax.swing.JOptionPane;

public class Misc extends TurtleGraphicsWindow	{
	public Misc()	{
		super(900,900);
	}
	private void square(int edgeLength)	{
		for (int i = 1; i<=4; i++)	{
			forward(edgeLength);
			right(90);
		}
	}
	private void pentagon(int edgeLength)	{
		for (int i = 1; i<=5; i++)	{
			forward(edgeLength);
			right(108); //change to 120;
		}
	}
	private void circle(int radius)	{
		for (int i = 1; i<= 120; i++)	{
			forward(radius);
			right((int)Math.PI);
		}
	}
	private void badTorus(int radius)	{
		for (int i = 1; i<=200; i++)	{
			left(radius/2); //maybe take this out
			back(radius/2); //maybe take this out
			forward(radius);
			right(3);
			for (int j = 1; j<=100; j++)	{
				forward(10); //controls size of torus...3 is pretty cool
				right(3); //only 3 works, basically zoom
			}
		}
	}
	private void torus(int radius)	{ //radius should be 10 or smaller
		for (int i = 1; i<=60; i++)	{
			circle(radius);
			right(6); //try changing this to 10
			forward(6);
		}
	}
	private void triangle(int edgeLength)	{
		for (int i = 1; i<3; i++)	{
			forward(edgeLength);
			right(60);
		}
	}
	private void wheel(int edgeLength, int radius, int angle)	{ //try 80 100 80, pretty cool or 150, 2, 70
		for (int i = 1; i<=100; i++)	{
		    circle(radius);
		    /** add this to create buzzsaw triangle(edgeLength/2); */
			square(edgeLength);
			pentagon(edgeLength);
			right(angle);
		}
	}
	private void octagonalSpiral(int radius)	{
		for (int i = 0; i<1000; i++)	{
			forward(i);
			right(45);	
		}
	}
	private void hexagon(int radius)	{
		for (int i = 0; i<3; i++)	{
			triangle(radius/2);
		}
	}
	private void flower(int length)	{ //make radius 100

		for (int i = 0; i<10; i++)	{
			hexagon(100);
			left(45);
			triangle(length/2);
		}
	}
	private void flower2(int length)	{ //make radius = 30 or 20
		for (int i = 0; i<12; i++)	{
			hexagon(40);
			left(30);
			forward(length/4);
		}
	}
	private void coolShape1(int length)	{
		for (int i = 12; i>0; i--)	{
			right(30);
			forward(length);
			left(30);
			forward(length);
			right(30);
			back(length);
			}
	}
	private void ninjaStar(int length)	{
		for (int i = length; i>0; i--)	{
			forward(length);
			left(30);
			back(length);
			right(90);
			forward(length);
		}
	}
	private void dodecagon(int sideLength)	{
		for (int i = 12; i>0; i--)	{
			forward(sideLength);
			left(30);
			forward(sideLength);
			back(sideLength);
			}
	}
	private void hexaspiral(int length)	{
		for (int i = 1; i<length; i++)	{
			forward(i);
			right(300);	
		}
	}
	private void star(int length)	{
		for (int i = 1; i<length; i++)	{
			forward(i);
			right(200);	
		}
	}
	private void playButton(int length)	{
		for (int i = 1; i<length; i++)	{
			forward(i);
			right(120);	
		}
	}
	private void spiral(int length)	{
		for (int i = 1; i<length; i++)	{
			forward(i);
			right(10);	
		}
	}
	private void squiral(int length)	{
		for (int i = 1; i<=length; i++)	{
		forward(i);
		right(90);
		forward(i);
		//add right(90) here to paint entire screen
		}
	}
	private void VonKochCurve(int n, int size)	{
		  KochCurve(n,size);
		  left(-120);
	      KochCurve(n, size);
	      left(-120);
	      KochCurve(n, size);
	}
	 private void KochCurve(int n, int size) {
		 double third = size/3;
	        if (n == 0) {
	            forward(size);
	        }
	        else {
	            KochCurve(n-1, (int)third);
	            left(60);
	            KochCurve(n-1, (int)third);
	            left(-120);
	            KochCurve(n-1, (int)third);
	            left(60);
	            KochCurve(n-1, (int)third);
	        }
	 }
	 private void tree(int instance, int branchLength)	{ //10, 90
		 //instance limits the recursion, so it doesn't go on forever
			while(branchLength<=0) branchLength = 0;
			if (instance==1)	{
				forward(branchLength);
			}
			else	{
				forward(branchLength);
				left(20);
				tree(instance-1, branchLength-6);
				right(40);
				tree(instance-1, branchLength-6);
				left(20);
			}
			back(branchLength);
	}
	private void fern(double size)	{
		if (size>1)	{
			forward(size);
			right(5);
			fern((size*0.8));
			left(5);
			back(size*0.05);
			left(40);
			fern((size*0.45));
			right(40);
			back((size*0.2));
			right(35);
			fern((size*0.4));
			left(35);
			back((size*0.75));
		}
	}
	private void multifern(double size)	{
		fern(size);
		right(60);
		fern(size*3/4);
		right(60);
		fern(size*1/2);
		right(60);
		fern(size*1/4);
		right(60);
		fern(size*1/2);
		right(60);
		fern(size*3/4);
	}
	
	public static void main(String[] args)	{
		Misc me = new Misc();
		me.home();
		me.setpencolor(LIME);
		me.penup();
		char choice = (JOptionPane.showInputDialog("====================Anthony Bao's Turtle Graphics Drawer!!!====================="
				+ "\n Please enter the letter corresponding to your choice:"
		  		+ "\n A: Draw a Fern"
		  		+ "\n B: Draw a Tree"
		  		+ "\n C: Draw a Koch Snowflake"
			    + "\n D: Draw a Wheel"
		  		+ "\n E: Draw a Torus"
			    + "\n F: Draw a Ninja Star"
		  		+ "\n G: Draw a Spiral"
			    + "\n H: Draw a Squiral"
		  		+ "\n I: Draw a Hexaspiral"
			    + "\n J: Draw a Star")).toLowerCase().charAt(0);			
			if (choice=='a') {	 
				me.setxy(-50, -150);
				me.pendown();
				me.multifern(120);
			}
			else if (choice=='b')	{ 
				me.setxy(0, -300);
				me.pendown();
				me.tree(10,90);
			}
			else if (choice=='c') {
				me.setxy(-210, -365);
				me.pendown();
				me.VonKochCurve(5,800);
			}
			else if (choice=='d')	{	
				me.setxy(-25, -100);
				me.pendown();
				me.wheel(150, 2, 70);
			}
			else if (choice=='e')	{	
				me.setxy(-60, 0);
				me.pendown();
				me.torus(10);
			}
			else if (choice== 'f') {
				me.setxy(0, 0);
				me.pendown();
				me.ninjaStar(100);
			}
			else if (choice== 'g') {
				me.setxy(0, 0);
				me.pendown();
				me.spiral(450);
			}
			else if (choice== 'h') {
				me.setxy(0, 0);
				me.pendown();
				me.squiral(450);
			}
			else if (choice== 'i') {
				me.setxy(0, 0);
				me.pendown();
				me.hexaspiral(400);
			}
			else if (choice== 'j') {
				me.setxy(0, 0);
				me.pendown();
				me.star(450);
			}
		me.hideturtle();
	}
}
