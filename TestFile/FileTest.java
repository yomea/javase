import java.io.*;
public class FileTest{
	public static void main(String[] agrs ) {
		String separator = File.separator;
		String parentPath = "youth"+separator+"hong";
		String childPath = "hongge.txt";
		File f = new File(parentPath,childPath);
		if(f.exists()) {
			System.out.println("absolutePath:"+f.getAbsolutePath());
			System.out.println("fileSize:"+f.length());
			
		}else {
			f.getParentFile().mkdirs();
			try {
				f.createNewFile();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}