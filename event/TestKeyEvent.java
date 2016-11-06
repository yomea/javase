import java.awt.*;
import java.awt.event.*;

public class TestKeyEvent {
	public static void main(String[] agrs) {
		Frame f = new Frame("Test KeyEvent!");
		TextField tf = new TextField(10);
		
		f.add(tf);
		f.setVisible(true);
		f.pack();
		tf.addKeyListener(new KeyAdapter(){
			public void keyPressed(KeyEvent e) {
				TextField tf = (TextField)e.getSource();
				tf.setText("you will don't delete me! haha...");
			}
		});
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
				
			}
		});
	}
}

