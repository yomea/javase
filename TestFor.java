public class TestFor {
	public static void main(String agrs[]) {
		long sum=0,f=1;
		for(int i=0;i<10;i++) {
			f*=i;
			sum+=i;
		}
		System.out.println(sum);
	}
}