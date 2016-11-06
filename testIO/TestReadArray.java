import java.io.*;
public class TestReadArray{
	public static void main(String[] agrs) throws IOException {
		FileReader fr = new FileReader("D:/java/testIO/TestReadArray.java");
		char[] c = new char[2500];
		fr.read(c,500,2000);
		for(int i=0; i< c.length; i++) {
			System.out.print(c[i]);
		}
	}
}