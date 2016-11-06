import java.io.*;

public class TestSystemIn {
	public static void main(String[] gars) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = null;
		s = br.readLine();
		while(s!=null) {
			if(s.equalsIgnoreCase("exit")) {
				System.out.println("Are you sure? Input Y to exit,others will continue!!! ");
				s = br.readLine();
				if(s.equalsIgnoreCase("Y")) {
				break;
				}
			}
			System.out.println(s);
			s = br.readLine();
			
		}
		//System.out.println(s=="exit");//
		//s = br.readLine();
		br.close();
	}
}