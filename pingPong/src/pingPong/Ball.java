package pingPong;
import java.awt.Color;
	   
public class Ball extends Sprite {
    private static final int BALL_WIDTH = 25;
    private static final int BALL_HEIGHT = 25;
    private static final Color BALL_COLOUR = Color.WHITE;

    public Ball(int panelWidth, int panelHeight) {
       setWidth(BALL_WIDTH);
       setHeight(BALL_HEIGHT);
       setColour(BALL_COLOUR);
       setInitialPosition(Pong.WINDOW_WIDTH / 2 - (getWidth() - 5), Pong.WINDOW_HEIGHT /2 - (getHeight() + 5));
       resetToInitialPosition();
   }

}




