import java.net.*;
import java.io.*;
public class TcpServer {
	public static void main(String[] agrs) throws Exception {
		ServerSocket ss = new ServerSocket(666);
		while(true){
			Socket s = ss.accept();
			//System.out.println("A Client had been accept!");
			DataInputStream dis = new DataInputStream(s.getInputStream());
			System.out.println(dis.readUTF()+" "+" "+ss.getPort());
			s.close();
			dis.close();
		}
		
		
	}
}