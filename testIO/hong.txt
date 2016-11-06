import java.io.*;

public class TestFileReader {
	public static void main(String agrs[]) throws IOException{
		FileReader fr = new FileReader("D:/java/testIO/TestFileReader.java");
		FileWriter ot = new FileWriter("D:/java/testIO/hong.txt");
		int b = 0;
		while((b = fr.read())!=-1) {
			System.out.print((char)b);
			ot.write(b);
		}
		fr.close();
		ot.close();
	}
}