import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;

public class ChatServer extends Frame {
	TextField tf = null;
	TextArea ta = null;
	ChatServer() {
		super("Server");
	}
	public static void main(String[] agrs) {
		ChatClient cc = new ChatClient();
		cc.launchFrame();
		
		
		
		
		
	}
	
	public void launchFrame() {
		setLocation(100,100);
		setSize(300,300);
		Panel p1 = new Panel(new GridLayout(1,1));
		Panel p2 = new Panel(new GridLayout(1,1));
		p1.setBounds(10,10,300,200);
		p1.setBackground(Color.BLUE);
		p2.setBackground(Color.RED);
		p2.setBounds(10,210,300,100);
		tf = new TextField();
		ta = new TextArea();
		tf.addActionListener(new Alistener(ta));
		add(p1,BorderLayout.CENTER);
		add(p2,BorderLayout.SOUTH);
		p1.add(ta);
		p2.add(tf);
		setVisible(true);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
	
	}
	

		
}

class Listener implements ActionListener {
	TextArea ta = null;
	ServerSocket skk = null;
	InputStream is = null;
	DataInputStream dis = null;
	DataOutputStream dos = null;
	Listener(TextArea ta) {
		this.ta = ta;
	}
	public void actionPerformed(ActionEvent e) {
		TextField tf = (TextField)e.getSource();
		String s = tf.getText();
		if(s!=null) {
		ta.append("Client:"+s+"\n");
		tf.setText("");
		
		}
		
		try{
			skk = new ServerSocket(599);
			Socket sk = skk.accept();
			is = sk.getInputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(sk.getOutputStream());
			dos.writeUTF(s);
			ta.append("Sever:"+dis.readUTF()+"\n");
		}catch(Exception e1) {
			System.out.println("error!");
		}
	}

}
