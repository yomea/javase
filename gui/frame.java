import java.awt.*;

public class frame {
	public static void main(String[] agrs) {
		Fra f1 = new Fra(100,100,100,100,Color.blue);
		Fra f2 = new Fra(200,200,100,100,Color.red);
		Fra f3 = new Fra(300,300,100,100,Color.gray);
		Fra f4 = new Fra(400,400,100,100,Color.orange);
		Fra f5 = new Fra(500,500,100,100,Color.green);
		Fra f6 = new Fra(600,600,100,100,Color.yellow);
	}
}

class Fra extends Frame {
	Fra(int x,int y, int width, int height,Color c) {
		setBounds(x,y,width,height);
		setBackground(c);
		setVisible(true);
	}
}