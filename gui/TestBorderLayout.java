import java.awt.*;

public class TestBorderLayout {
	public static void main(String[] agrs) {
		Frame f = new Frame("Test BorderLayout!");
		f.setBounds(500,300,300,300);
		f.setBackground(Color.BLUE);
		f.setVisible(true);
		f.setLayout(new BorderLayout());
		String[] n = new String[5];
		n[0] = BorderLayout.NORTH;
		n[1] = BorderLayout.EAST;
		n[2] = BorderLayout.SOUTH;
		n[3] = BorderLayout.WEST;
		n[4] = BorderLayout.CENTER;
		for(int i = 0; i < 5; i++) {
			f.add(new Button("button"+i),n[i]);
		}
	}
}