public class TestPriority {
	public static void main(String[] agrs) {
		P1 ti = new P1();
		P2 tt = new P2();
		tt.setPriority(10);
		ti.start();
		tt.start();
		for(int i=0; i < 10000; i++) {
			System.out.println(Thread.currentThread().isAlive());
		}
	}
}

class P1 extends Thread {
	public void run() {
		for(int i=0; i < 10000; i++) {
			System.out.println("P1____:"+i);
		}
	}
}

class P2 extends Thread {
	public void run() {
		for(int i=0; i < 10000; i++) {
			System.out.println("-----------------p2:"+i);
		}
		System.out.println(isAlive()+" "+getPriority());
	}
}