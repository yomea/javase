public class TestSync implements Runnable{
	Timer tm = new Timer();
	static Haha ha = new Haha(); 
	public static void main(String[] agrs) throws Exception {
		
		TestSync ra = new TestSync();
		Thread r1 = new Thread(ra);
		Thread r2 = new Thread(ra);
		r1.setName("r1");
		r2.setName("r2");
		r1.start();
		r2.start();
		Thread.sleep(1000);
		ha.s();
	}
	public void run(){
		//tm.add(Thread.currentThread().getName());
		try{synchronized(ha){Thread.sleep(5000);ha.sum();}}catch(Exception e){}
	}
}

class Timer {
	public static int num = 0;
	/*synchronized*/ void add(String s) {
		synchronized(this){num++;
		System.out.println(s+"------"+num);
		}
	}
}

class Haha {
	public void sum(){
		System.out.println("hehe!!!");
	}
	public void s(){
		System.out.println("dfhbfgnh");
	}
}