public class Fibonacci{
	public static void main(String agrs[]){
		System.out.println(f(40));
	}
	public static int f(int n){
		if(n==1||n==2){
			return 1;
		}
		else{
			return f(n-1)+f(n-2);
		}
	}
}