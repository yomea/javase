import java.io.*;
public class TestPrint {
	public static void main(String[] agrs) {
		//String separator = File.separator;
		String s = agrs[0];
		if(s!=null) {list(s,System.out);}
	}
	public static void list(String s,PrintStream l) {
		try {
			String d = null;
			BufferedReader br = new BufferedReader(new FileReader(s));
			while((s=br.readLine())!=null) {
				l.println(s);
			}
		}catch(IOException e) {
			l.println(e.getMessage());
		}
		
	}
}