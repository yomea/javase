import java.io.*;
import java.net.*;

public class Server {
	public static void main(String[] agrs) {
		try{
			ServerSocket ss = new ServerSocket(888);
		DataInputStream in = null;
		DataOutputStream out = null;
		while(true) {
			Socket s = ss.accept();
			BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
			in = new DataInputStream(s.getInputStream());
			out = new DataOutputStream(s.getOutputStream());
			System.out.println("Client:"+in.readUTF());
			String so = bis.readLine();
			String sl = null;
		while(so!=null) {
			out.writeUTF(so);
			if(so.equalsIgnoreCase("bye")) break;
			
			
			sl = in.readUTF();
			
			System.out.println("Client:"+sl);
			if(sl.equalsIgnoreCase("bye-bye")) break;
			so = bis.readLine();
		}
		
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}