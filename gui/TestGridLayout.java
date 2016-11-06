import java.awt.*;

public class TestGridLayout {
	public static void main(String[] agrs) {
		Frame f = new Frame();
		f.setLayout(new GridLayout(3,4));
		for(int i = 0; i < 12; i++) {
			f.add(new Button("button"+i));
		}
		f.pack();
		f.setVisible(true);
	}
}