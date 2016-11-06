import java.io.*;
public class TestPrintStream {
	public static void main(String[] agrs) throws IOException {
		PrintStream ps = new PrintStream(new FileOutputStream("D:/java/testIO/print.txt"));
		System.setOut(ps);
		System.out.println("helloWorld!!!");
		ps.close();
	}
}