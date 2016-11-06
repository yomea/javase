import java.io.*;
public class TestBufferReader {
	public static void main(String[] agrs) throws IOException{
		FileReader fr = new FileReader("D:/java/testIO/TestBufferReader.java");
		BufferedReader br = new BufferedReader(fr);
		FileWriter fw = new FileWriter("D:/java/testIO/sdg.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		br.mark(100);
		for(int i=0; i<11; i++) {
			//System.out.println(br.readLine());
			String s = br.readLine();
			bw.write(s);
			bw.newLine();
		}
		br.reset();
		for(int i=0; i<25; i++) {
			System.out.println(br.readLine());
			
		
		}
		bw.flush();
		br.close();
		bw.close();
	}
}