import java.io.*;

public class TestBufferedInputStream {
	public static void main(String[] agrs) {
		try{
		FileInputStream fi = null;
		BufferedInputStream fr = null;
		int b=0;
		
		fi=new FileInputStream("D:/java/testIO/TestBufferedInputStream.java");
		fr=new BufferedInputStream(fi);
		FileOutputStream out = new FileOutputStream("D:/java/testIO/get.txt");
		BufferedOutputStream ot = new BufferedOutputStream(out); 
		
		 
		for(int i=0;i<50000;i++) {
			if(i%2==0){
				ot.write(13);
				ot.write(10);
			}
			ot.write(i);
			
		}
		ot.flush();
		fr.mark(300);
		
			while((b=fr.read())!=-1) {
				System.out.print((char)b);
			}
		fr.close();
		}catch(FileNotFoundException e) {
			System.out.println("File not found!");
		}
		catch(IOException e) {
			System.out.println("read error!");
		}
		
	}
}