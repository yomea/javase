import java.awt.*;
import java.awt.event.*;
import java.util.*;
//本程序用eclipse运行，否则报错！！！不要问为什么。
public class PaintPoint {
	public static void main(String[] agrs) {
		new Mypoint().picture();
	}
}

class Mypoint extends Frame {
	ArrayList<Point> al = new ArrayList<Point>();
	public void picture(){
		setBounds(400,300,400,400);
		setVisible(true);
		addMouseListener(new Mon());
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				setVisible(false);
				System.exit(0);//匿名类。
			}
		});
	}
	public void paint(Graphics g) {
		Color c = g.getColor();
		g.setColor(Color.BLUE);
		Iterator<Point> it = al.iterator();
		Point pt = null;
		while(it.hasNext()) {
			pt = it.next();
			g.fillOval((int)pt.getX(),(int)pt.getY(),10,10);
		}
	}
}

class Mon extends MouseAdapter {
	public void mousePressed(MouseEvent e) {
		Mypoint mp = (Mypoint)e.getSource();
		mp.al.add(new Point(e.getX(),e.getY()));
		mp.repaint();
	}
}