import java.awt.*;
import javax.swing.*;

public class Main{

	public static void main(String[] args) {
		gameFrame();
		
	}
	
	public static void gameFrame() {
		//Set new Game Frame
		JFrame gameFrame = new JFrame("Pong");
		gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Frame Dimension
		gameFrame.setSize(1000,650);
		gameFrame.setResizable(false);
		
		// Frame Design
		gameFrame.getContentPane().setBackground(Color.DARK_GRAY);
		
		// Frame Visibility
		gameFrame.setVisible(true);
	}

}
