public class TestDynamicLoad {
	public static void main(String agrs[]) throws Exception {
		
			
			Class c = Class.forName(agrs[0]);
			All word = (All)c.newInstance();
			word.start();
		
	}
	
}