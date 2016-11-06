import java.net.*;
import java.io.*;
public class UDPServer {
	public static void main(String[] agrs) {
		byte[] by = new byte[1024];
		try{
			DatagramPacket dgp = new DatagramPacket(by,by.length);
			DatagramSocket dgs = new DatagramSocket(5678);
		
			while(true) {
				dgs.receive(dgp);
				DataInputStream dis = new DataInputStream(new ByteArrayInputStream(by));
				System.out.println(dis.readLong());
			}
		}catch(SocketException e) {
				e.printStackTrace();
			}catch(Exception e) {
				e.printStackTrace();
			}
	}
}