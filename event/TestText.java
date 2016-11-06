import java.awt.*;
import java.awt.event.*;

public class TestText {
	public static void main(String[] agrs) {
		Myframe mf = new Myframe();
		
	}
}

class Myframe extends Frame {
	Myframe() {
		TextField tf = new TextField();
		add(tf);
		tf.setEchoChar('*');
		Jianting jt = new Jianting();
		tf.addActionListener(jt);
		pack();
		setVisible(true);
	}
}

class Jianting implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		TextField tf = (TextField)e.getSource();
		System.out.println(tf.getText());
		tf.setText("");
	}
}