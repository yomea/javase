import java.awt.*;
import java.awt.event.*;

public class TestNimingLei {
	public static void main(String[] agrs) {
		Niming nm = new Niming();
	}
}

class Niming extends Frame {
	public Niming() {
		Button bt1 = new Button("press me");
		TextField tf = new TextField();
		add(bt1, BorderLayout.NORTH);
		add(tf, BorderLayout.SOUTH);
		setVisible(true);
		pack();
		
		bt1.addActionListener(new ActionListener(){
			int i = 0;
			public void actionPerformed(ActionEvent e){
				tf.setText("press"+(++i));
				}
		});
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
				
			}
		});
	}
}