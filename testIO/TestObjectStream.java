import java.io.*;
public class TestObjectStream {
	public static void main(String[] agrs) throws ClassNotFoundException,IOException {
		TT tt = new TT();
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:/java/testIO/cun.log"));
		oos.writeObject(tt);
		oos.flush();
		//oos.close();
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:/java/testIO/cun.log"));
		TT t = (TT)ois.readObject();
		System.out.println(t.i+"--"+t.s+"--"+t.g);
	}
}

class TT implements Serializable {
	int i=10;
	long s=15;
	transient float g = 2.3f;
}