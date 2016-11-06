
public class TestStaticLoad {
	public static void main(String agrs[]) {
		if(agrs[0].equals("word")) {
			Word w = new Word();
		}
		if(agrs[0].equals("excel")) {
			Excel e = new Excel();
		}
	}
	
}