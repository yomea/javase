import java.io.*;

public class TestOutputStreamWriter {
	public static void main(String[] agrs) throws IOException {
		OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream("D:/java/testIO/java.txt",true),"ISO8859_1");
		/*for(int i=0; i<50000; i++) {
			out.write(i);
		}*/
		char[] c = {'h','o','n','g','g','e'};
		out.write(c,4,2);
		out.flush();
		System.out.println(out.getEncoding());
		out.close();
	}
}