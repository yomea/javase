public class Testb3c1 {
	public static void main(String[] agrs) {
		b3c(100);
	}
	
	public static void b3c(int n) {
		int count=0;
		for(int i=0; i <= n; i++) {
			if(i%3==0) {
				System.out.println(i);
				count++;
				
			}
			if(count==5)
				break;
		}
	}
}