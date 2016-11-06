//质数

public class Zhishu {
	public static void main(String[] agrs) {
		sushu(101,200);
		Zhishu2 obj=new Zhishu2();
		System.out.println("Method2...");
		obj.sushu2(101,200);
	}
	public static void sushu(int i, int j){
		for(int n=i; n<j; n++) {
			if(n%2==1) {
				System.out.println(n);
			}
		}
	}
}

class Zhishu2 {
	void sushu2(int i, int j) {
		for(int n=i; n<j; n+=2) {
			boolean flag=true;
			for(int k=2; k<i; k++){ 
			if(n%k==0){
			flag=false;
			break;
				}
			}
			if(!flag) continue;
			System.out.println(n);
		}
	}
}

