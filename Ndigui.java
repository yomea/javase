public class Ndigui{
	public static void main(String agrs[]){
		System.out.println(f(-5));
	}
	public static long f(int n){
		long sum=0,a=1l,b=1l;
		if(n<1){
			System.out.println("input error!!!>0");
		}
		else{
		if(n==1||n==2){
			return 1l;
		}
		for(int i=0;i<n-2;i++){
			sum=a+b;
			a=b;
			b=sum;
		}
		}
		return sum;
	}
}