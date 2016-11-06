public class OddSum {
	public static void main(String agrs[]) {
		System.out.println(sum(5));
	}
	public static long sum(int n) {
		long sum=0;
		for(int i=1; i<=n; i=i+2){
			sum+=i;
		}
		return sum;
	}
}