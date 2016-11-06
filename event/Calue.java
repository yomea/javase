import java.awt.*;
import java.awt.event.*;

public class Calue {
	public static void main(String[] agrs) {
		k kk = new k();
	}
}


class k extends Frame {
	TextField tf1 = null;
	Button bt = null;
	Label tf2 = null;
	TextField tf3 = null;
	TextField tf4 = null;
	k() {
		setLayout(new FlowLayout());
		setVisible(true);
		tf1 = new TextField(10);
		tf2 = new Label("+");
		tf3= new TextField(10);
		tf4 = new TextField(10);
		bt = new Button("=");
		add(tf1);
		add(tf2);
		add(tf3);
		add(bt);
		add(tf4);
		pack();
		//Jt tt = new Jt(this);
		Jt tt = new Jt();
		bt.addActionListener(tt);
		
 		
	}
	class Jt implements ActionListener {
	//k hh;
	//Jt(k hh) {
		//this.hh = hh;
	//}
	public void actionPerformed (ActionEvent e) {
		int a = Integer.parseInt(tf1.getText());
		int b = Integer.parseInt(tf3.getText());
		tf4.setText(""+(a+b));
	}
}
}

/*class Jt implements ActionListener {
	k hh;
	Jt(k hh) {
		this.hh = hh;
	}
	public void actionPerformed (ActionEvent e) {
		int a = Integer.parseInt(hh.tf1.getText());
		int b = Integer.parseInt(hh.tf3.getText());
		hh.tf4.setText(""+(a+b));
	}
}*/