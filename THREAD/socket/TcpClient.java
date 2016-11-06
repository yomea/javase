import java.net.*;
import java.io.*;
public class TcpClient {
	public static void main(String ags[]) throws Exception{
		Socket s = new Socket("localHost",666);
		DataOutputStream dos = new DataOutputStream(s.getOutputStream());
		dos.writeUTF("HelloWorld");
		s.close();
		dos.close();
	}
}