import java.io.*;

public class FileList {
	public static void main(String[] agrs) {
		File f = new File("d:/A");
		System.out.println(f.getName());
		tree(f,1);
	}
	public static void tree(File f,int layer) {
		String  str = "";
		for(int i=0; i<layer; i++) {
			str+="    ";
		}
		File[] childs = f.listFiles();
		for(int i=0;i<childs.length; i++) {
			System.out.println(str+childs[i].getName());
			if(childs[i].isDirectory()) {
				tree(childs[i],layer+1);
			}
		}
	}
}