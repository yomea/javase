import java.awt.*;

public class TestGraphics {
	public static void main(String[] agrs) {
		new Myfa().hd();
	}
}

class Myfa extends Frame {
	public void hd() {
		setBounds(500,300,300,300);
		setVisible(true);
		
	}
	
	public void paint(Graphics g) {
		Color c = g.getColor();
		g.setColor(Color.RED);
		g.fillOval(50,50,80,30);
		g.setColor(Color.YELLOW);
		g.fill3DRect(80,80,60,60,true);
		g.setColor(Color.BLACK);
		g.drawLine(30,30,200,70);
		g.setColor(c);
	}
}