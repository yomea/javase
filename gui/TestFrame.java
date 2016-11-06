import java.awt.*;
public class TestFrame {
	public static void main(String[] agrs) {
		Frame f = new Frame("helloWorld");
		f.setBounds(500,300,300,300);
		f.setVisible(true);
		f.setResizable(false);
		f.setBackground(Color.blue);
	}
}