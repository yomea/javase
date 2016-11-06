public class TestThread {
	public static void main(String[] agrs) {
		Runner r = new Runner();
		Thread tr = new Thread(r);
		tr.start();
		for(int i=0; i < 100; i++) {
			System.out.println("////////main Thread:///"+i);
		}
	}
}

class Runner implements Runnable {
	public void run() {
		for(int i=0; i < 100; i++) {
			System.out.println("Runner:-----"+i);
		}
	}
}