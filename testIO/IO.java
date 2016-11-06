import java.io.*;

public class IO {
	public static void main(String[] agrs) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char c = (char)br.read();
		while(c!='q'){
			System.out.println(c);
			c = (char)br.read();
		}
	}
}