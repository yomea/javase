import java.io.*;
import java.net.*;

public class Client {
	public static void main(String[] agrs) {
		try{
			Socket s = new Socket("localHost",888);
		DataInputStream in = null;
		DataOutputStream out = null;
		
			BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
		in = new DataInputStream(s.getInputStream());
		out = new DataOutputStream(s.getOutputStream());
		String s1 = bis.readLine();
		String gh = null;
		while(s1!=null) {
			if(s1.equalsIgnoreCase("bye")){
				out.writeUTF("bye-bye");
			break;
			} 
			
			out.writeUTF(s1);
			gh = in.readUTF();
			
			System.out.println("Server:"+gh);
			if(gh.equalsIgnoreCase("bye")){
		
			break;
			} 
			s1 = bis.readLine();
		}
		bis.close();
		in.close();
		out.close();
		s.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}