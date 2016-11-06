import java.net.*;
import java.io.*;

public class UDPClient {
	public static void main(String[] agrs) throws Exception {
		long l = 88888888888l;
		/*String s = String.valueOf(l);
		byte[] by = (new String(s)).getBytes();*/
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(bos);
		dos.writeLong(l);
		byte[] by = bos.toByteArray();
		//System.out.println(by.length);
		DatagramPacket dgp = new DatagramPacket(by,by.length,new InetSocketAddress("127.0.0.1",5678));
		DatagramSocket dgs = new DatagramSocket(999);
		dgs.send(dgp);
		dgs.close();
	}
}