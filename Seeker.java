// Seeker.java
// Continually move a green bug to follow a moving mouse
import doodlepad.*;

public class Seeker {

    // The mouse-seeking bug Shape
    private static Oval bug;

    // The coordinates being sought by the bug
    private static double targetX, targetY;

    public static void main(String[] args) {
        // Create a new Pad object
        Pad pad = new Pad("Mouse Seeker", 400, 400);

        // Create the green bug Shape that seeks the mouse
        bug = new Oval(0, 0, 10, 10);
        bug.setFillColor(0, 255, 0);

        // Handle the Pad mouseMoved event
        pad.setMouseMovedHandler( Seeker::onMouseMoved );

        // Set up and start the Pad timer
        pad.setTickRate(30);
        pad.setTickHandler( Seeker::moveBug );
        pad.startTimer();
    }

    // Set a new target location for the bug every time the mouse is moved
    public static void onMouseMoved(Pad pad, double x, double y, int button) {
        targetX = x;
        targetY = y;
    }

    // Move the bug part-way toward the target mouse location
    public static void moveBug(Pad pad, long when) {
        // Get the current bug location
        double currX = bug.getX();
        double currY = bug.getY();
        // Compute a new location closer to the mouse
        double newX  = currX + 0.1*(targetX - currX);
        double newY  = currY + 0.1*(targetY - currY);
        // Update the bug location
        bug.setX( newX );
        bug.setY( newY );
    }
}
