import doodlepad.*;
import java.util.ArrayList;

public class Main {
	//variables
	//method
	public static void main(String[] args){
		Pad pad = new Pad("Stand", 600, 600);
		RoundRect r1 = new RoundRect(10, 10, 560, 550, 30, 30);
		//background
		//banner
		Arc h1 = new Arc(10, 150, 560, 340, 0, 180);
		h1.setFilled(false);
		Arc h2 = new Arc(10, 110, 560, 340, 0, 180);
		h2.setFilled(false);
		
		//grass
		Line l25 = new Line(10, 500, 100, 500);
		Line l26 = new Line(520, 500, 570, 500);
		//stand structure
		Image im = new Image("lemonadeName.jpg", 200, 280, 180, 115);
		Line l1 = new Line(100, 300, 100, 560);
		Line l2 = new Line(500, 300, 500, 560);
		Line l3 = new Line(100, 300, 500, 300);
		Line l4 = new Line(100, 370, 500, 370);
		Line l5 = new Line(100, 490, 500, 490);
		//stand decoration
		for(int i =0; i<10; i++){
			new Line(100+40*i, 490, 100 +40*i, 560);
		}	
		//3d implementation 
		Line l9 = new Line(100, 490, 120, 460);
		Line l10 = new Line(500, 490, 520, 460);
		Line l11 = new Line(120, 460, 350, 460);
		Line l32 = new Line(430, 460, 520, 460);
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
        
        //ice
        Rectangle ib1 = new Rectangle(350, 440, 70, 40);
        Line l27 = new Line(350,440,360,425);
        Line l28 = new Line(420,440,430,425);
        Line l29 = new Line(420,480,430,465);
        Line l30 = new Line(360,425,430,425);
        Line l31 = new Line(430,425,430,465);
        
        
        
        //sugar
        int xS = 180;
        int yS = 640;
        double f = .6;
        ArrayList<Point> sugarB = new ArrayList<>();
        ArrayList<Point> sugarS = new ArrayList<>();
        ArrayList<Point> sugarT = new ArrayList<>();
        sugarB.add( new Point( 50.0+xS, f*(150.0+yS) ));
        sugarB.add( new Point( 100.0+xS,  f*(50.0+yS)) );
        sugarB.add( new Point( 150.0+xS, f*(150.0+yS)) );
        sugarS.add( new Point(  150.0+xS, f*(150.0+yS)) );
        sugarS.add( new Point(  160.0+xS, f*(135.0+yS)) );
        sugarS.add( new Point( 110.0+xS,  f*(35.0+yS)) );
        sugarS.add( new Point( 100.0+xS, f*(50.0+yS)) );
        sugarT.add( new Point( 100.0+xS, f*(50.0+yS)) );
        sugarT.add( new Point( 100.0+xS, f*(20.0+yS)) );
        sugarT.add( new Point( 110.0+xS, f*(5.0+yS)) );
        sugarT.add( new Point( 110.0+xS, f*(35.0+yS)) );
        
        

        
        // Pass Point List to Polygon constructor
        Polygon s1 = new Polygon(sugarB);
        Polygon s2 = new Polygon(sugarS);
        Polygon s3 = new Polygon(sugarT);
        
        //lemon
        Oval lemon1 = new Oval(430, 450, 50, 35);
        Oval lemon2 = new Oval(400, 440, 50, 35);
        lemon1.setFillColor(255, 255, 0);
        lemon2.setFillColor(255, 255, 0);





		
       
	
	}




}
