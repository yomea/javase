import java.awt.*;

public class FrameWithPanel {
	public static void main(String[] agrs) {
		MyFrame f1 = new MyFrame("Frame with Panel",500,300,500,500,Color.blue);
	}
}

class MyFrame extends Frame {
	MyFrame(String s,int x, int y, int width, int height,Color c){
		setLayout(null);
		Panel p = new Panel(null);
		p.setBounds(width/4,height/4,width/2,height/2);
		p.setBackground(Color.black);
		add(p);
		setBackground(c);
		setBounds(x,y,width,height);
		setVisible(true);
	}
}
