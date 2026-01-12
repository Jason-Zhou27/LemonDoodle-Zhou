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
