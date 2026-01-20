import doodlepad.*;
import java.util.ArrayList;

public class Main {
	//variables
	//method
	public static void main(String[] args){
		//stand structure
		Pad pad = new Pad("Stand", 600, 600);
		RoundRect r1 = new RoundRect(10, 10, 560, 550, 30, 30);
		Image im = new Image("lemonadeName.jpg", 200, 280, 180, 115);
		Line l1 = new Line(100, 300, 100, 560);
		Line l2 = new Line(500, 300, 500, 560);
		Line l3 = new Line(100, 300, 500, 300);
		Line l4 = new Line(100, 370, 500, 370);
		Line l5 = new Line(100, 490, 500, 490);
			//3d implementation 
		Line l9 = new Line(100, 490, 120, 460);
		Line l10 = new Line(500, 490, 520, 460);
		Line l11 = new Line(120, 460, 520, 460);
		Line l12 = new Line(500, 560, 520, 530);
		Line l13 = new Line(520, 530, 520, 460);
		Line l14 = new Line(520, 350, 520, 280);
		Line l15 = new Line(500, 370, 520, 350);
		Line l16 = new Line(500, 300, 520, 280);
		Line l17 = new Line(120, 280, 250, 280);
		Line l22 = new Line(350, 280, 520, 280);
		Line l18 = new Line(100, 300, 120, 280);
		Line l19 = new Line(250, 225, 250, 300);
		Line l20 = new Line(350, 225, 350, 300);
		Line l21 = new Line(250, 225, 350, 225);
		Line l23 = new Line(520, 280, 520, 490);
		Line l24 = new Line(120, 370, 120, 460);
			//grass line
		
		
		//cups

		ArrayList<Point> cupBody1 = new ArrayList<>();
        cupBody1.add( new Point( 150.0, 440.0) );
        cupBody1.add( new Point( 200.0,  440.0) );
        cupBody1.add( new Point( 190.0,  480.0) );
        cupBody1.add( new Point( 160.0, 480.0) );
        
        // Pass Point List to Polygon constructor
        Polygon p2 = new Polygon(cupBody1);
        Oval o1 = new Oval(150, 420, 50, 30);
        Oval o2 = new Oval(160, 470, 30, 20);
        
        ArrayList<Point> cupBody2 = new ArrayList<>();
        cupBody2.add( new Point( 135.0, 440.0) );
        cupBody2.add( new Point( 185.0,  440.0) );
        cupBody2.add( new Point( 175.0,  480.0) );
        cupBody2.add( new Point( 145.0, 480.0) );
        
        // Pass Point List to Polygon constructor
        Polygon p1 = new Polygon(cupBody2);
        Oval o3 = new Oval(135, 420, 50, 30);
        Oval o4 = new Oval(145, 470, 30, 20);

		
       
	
	}




}
