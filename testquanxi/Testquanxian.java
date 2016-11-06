package hong;
public class Testquanxian {
	private int i=0;
			int j=9;
	protected int k=10;
	public int n=56;
	public static void main(String[] agrs) {
		Testqx t = new Testqx();
		t.m();
	}
}

class Testqx extends Testquanxian {
	void m() {
		System.out.println(j);
	}
	
}