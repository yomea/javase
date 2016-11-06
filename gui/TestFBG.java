import java.awt.*;

public class TestFBG {
	public static void main(String[] agrs) {
		Frame f = new Frame("Test FBG");
		Panel p1 =new Panel();
		Panel p2 =new Panel();
		Panel p3 =new Panel();
		Panel p4 =new Panel();
		f.setLayout(new GridLayout(2,1));
		p1.setLayout(new BorderLayout());
		p2.setLayout(new GridLayout(2,1));
		p3.setLayout(new BorderLayout());
		Button[] b = new Button[10];
		for(int i = 0; i < 10; i++) {
			b[i] = new Button("Button");
		}
		f.add(p1,BorderLayout.NORTH);
		f.add(p3,BorderLayout.SOUTH);
		p1.add(b[0],BorderLayout.WEST);
		p1.add(b[1],BorderLayout.EAST);
		p1.add(p2,BorderLayout.CENTER);
		p3.add(b[2],BorderLayout.WEST);
		p3.add(b[3],BorderLayout.EAST);
		p3.add(p4,BorderLayout.CENTER);
		p2.add(b[4],BorderLayout.NORTH);
		p2.add(b[5],BorderLayout.SOUTH);
		p4.setLayout(new GridLayout(2,2));
		p4.add(b[6]);
		p4.add(b[7]);
		p4.add(b[8]);
		p4.add(b[9]);
		p1.setSize(500,250);
		p3.setSize(500,250);
		f.setBounds(500,300,500,500);
		f.setVisible(true);
	}
}