import java.io.*;

public class ListFile {
	public static void main(String[] agrs) {
		File f = new File("D:/A");
		System.out.println(f.getName());
		list(f);
		
	}
	public static void list(File f) {
		File[] listFile = f.listFiles();
		String l = "    ";
		for(int i=0; i<listFile.length; i++) {
			l+=l+"    ";
			System.out.println(l+listFile[i].getName());
			if(listFile[i].isDirectory()) {
			File[] dir = listFile[i].listFiles();
			
			for(int j=0; j<dir.length; j++) {
				System.out.println(l+dir[j].getName());
				}
			}
		}
	}
}