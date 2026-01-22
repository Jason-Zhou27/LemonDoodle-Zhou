# LemonDoodle-Zhou

Notes on using DoodlePad:

- download doodlepad library (doodlepad.jar)
- put doodlepad.jar in same folder as the program
- import library in the java files

Running and Compiling
- compile using javac -cp doodlepad.jar Main.java
- run using java -cp .;doodlepad.jar Main (Windows)
		- however, sometimes compiling must require
			javac -cp doodlepad.jar "%f"
			and running must require
			java -cp doodlepad.jar "%f"
			
Inserting Drawings:
- steps:
	create pad with dimensions
		use format: Pad pad = new Pad("name", dimx, dimy);
	outline with lines
		use format: Line l1 = new Line(posx, posy, dimx, dimy);
	create border with round rectangle
		use format: RoundRect r1 = new RoundRect(posx, posy, dimx, dimy, radCorner, radCorner);
	insert online images
		bring image to same folder (ideally, jpeg or png)
		use format: Image im = new Image("imageName.fileExtension", posx, posy, dimx, dimy);
		
- can create lines/shapes in repeat by using call to constructor in a loop (see decoration section)
	
