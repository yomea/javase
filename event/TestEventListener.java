import java.awt.*;
import java.awt.event.*;

public class TestEventListener {
	public static void main(String[] agrs) {
		Frame f = new Frame("Event");
		Button bt = new Button("press me!");
		f.add(bt,BorderLayout.CENTER);
		Monitor mt = new Monitor();
		bt.addActionListener(mt);
		f.pack();
		f.setVisible(true);
	}
}

class Monitor implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		System.out.println("hello,the button be click!");
	}
}
