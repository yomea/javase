import hong.*;
public class TestProtected{
	private int i=0;
			int j=9;
	protected int k=10;
	public int n=56;
	public static void main(String agrs[]){
		Testquanxian t = new Testquanxian();
		Testqx g = new Testqx();
		System.out.println("wumuhuiyalongshi"+"\n"+t.n);
		g.m();
	}
}

class Testqx extends TestProtected {
	void m() {
		System.out.println(k);
	}
	
}