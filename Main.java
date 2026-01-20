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
		Line l6 = new Line(250, 225, 250, 300);
		Line l7 = new Line(350, 225, 350, 300);
		Line l8 = new Line(250, 225, 350, 225);

		ArrayList<Point> cupBody = new ArrayList<>();
        cupBody.add( new Point(  200.0, 440.0) );
        cupBody.add( new Point( 250.0,  440.0) );
        cupBody.add( new Point( 240.0,  480.0) );
        cupBody.add( new Point( 210.0, 480.0) );
        
        // Pass Point List to Polygon constructor
        Polygon p1 = new Polygon(cupBody);
        Oval o1 = new Oval(200, 420, 50, 30);
        Oval o2 = new Oval(210, 470, 30, 20);

		
       
	
	}




}
