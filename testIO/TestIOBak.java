import java.io.*;

public class TestIOBak {
	public static void main(String[] agrs) {
		FileInputStream in = null;
		FileOutputStream out = null;
		try {
			in = new FileInputStream("D:/java/testIO/TestIO.java");
			out = new FileOutputStream("D:/java/testIO/TestIOBak.java");
		}catch(FileNotFoundException e) {
			System.out.println("File not found,Plase check the path that you input!");
		}
		int b=0;
		try {
			while((b=in.read())!=-1) {
				System.out.print((char)b);
				out.write(b);
			}
		}catch(IOException e) {
				e.printStackTrace();
			
		}
		
	}
}