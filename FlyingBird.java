// FlyingBird.java
import doodlepad.*;

public class FlyingBird {

    public static void main(String[] args) {
        // Create a Pad and a Sprite
        Pad pad = new Pad(300, 300);
        Sprite sprite = new Sprite("FlyingBird.png", 50, 50, 190, 5);
        
        // Set Pad timer with a Java lambda function that advances sprite
        pad.setTickHandler( (Pad p, long when) -> { sprite.advance(); } );
        pad.setTickRate(10);
        pad.startTimer();
    }
}
