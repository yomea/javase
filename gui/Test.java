import java.awt.*;

public class Test {
	public static void main(String[] agrs) {
		Frame f = new Frame("Test BorderLayout!");
		f.setBounds(500,300,300,300);
		f.setBackground(Color.BLUE);
		f.setVisible(true);
		f.setLayout(new BorderLayout());
		f.add(new Button("0"),BorderLayout.NORTH);
		f.add(new Button("1"),BorderLayout.SOUTH);
		
		
	}
}