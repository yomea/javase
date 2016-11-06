import java.awt.*;

public class TestFlowLayout {
	public static void main(String[] agrs) {
		Frame f = new Frame("Test flowLayout!");
		f.setLayout(new FlowLayout(FlowLayout.CENTER,20,40));
		f.setSize(300,400); 
		f.setLocation(500,300);
		f.setBackground(new Color(233,123,123));
		for(int i = 0; i < 7; i++) {
			f.add(new Button("button"+i));
		}
		f.setVisible(true);
	}
}