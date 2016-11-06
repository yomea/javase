import java.io.*;
import java.util.*;
public class TestLog {
	public static void main(String[] agrs) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintStream ps = new PrintStream(new FileOutputStream("D:/java/testIO/log.log",true));
		String s = null;
		s = br.readLine();
		while(s != null) {
			if(s.equalsIgnoreCase("exit")) {
				break;
			}
			System.out.println(s.toUpperCase());
			ps.println("--------------");
			ps.println(s);
			ps.println(new Date());
			s = br.readLine();
		}
		br.close();
		ps.close();
	}
}