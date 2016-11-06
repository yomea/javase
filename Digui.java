public class Digui{
	public static void main(String args[]){
		System.out.println(method(10));
	}
	public static int method(int i){
		if(i==1){
			return 1;
		}
		else{
			
			return i*method(i-1);
		}
	}
}