
public class TestJoin {
	public static void main(String[] agrs) throws InterruptedException {
		Join1 ji = new Join1("ji");
		//Join1 hi = new Join1("hi");
		ji.start();
		ji.join();
		for(int i=0; i < 100;i++) {
			System.out.println("mainThread"+" "+i);
			
		}
	}
}

class Join1 extends Thread {
	Join1(String s) {
		super(s);
	}
	public void run() {
		for(int i=0; i < 100;i++) {
			System.out.println(getName()+" "+i);
			/*if(i%10==0) {
				yield();
			}*/
		}
	}
}