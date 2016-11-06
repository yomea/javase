import java.io.*;
public class TestWriter {
	public static void main(String[] agrs) throws IOException{
		FileWriter fr = new FileWriter("D:/java/testIO/youth.txt");
		for(int i=0; i<50000;i++) {
			fr.write(i);
		}
		fr.close();
	}
	
}