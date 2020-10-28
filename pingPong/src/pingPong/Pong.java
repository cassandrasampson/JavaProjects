package pingPong;
import javax.swing.JFrame;

public class Pong extends JFrame {
		
		private final static String WINDOW_TITLE = "Pong";
		public final static int WINDOW_WIDTH = 800;
		public final static int WINDOW_HEIGHT = 600;
		
		public Pong()
		{
			setTitle(WINDOW_TITLE);
			setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
			setResizable(false);
            add(new PongPanel());  
			setVisible(true);        
			setDefaultCloseOperation(EXIT_ON_CLOSE);	

		}
		
		public static void main(String[] args)	{
			new Pong();
		}		
}


