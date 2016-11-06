public class TestProducerConsumer {
	public static void main(String[] agrs) {
		QQ q = new QQ();
		Producers p = new Producers(q);
		Consumers c = new Consumers(q);
	}
}

class QQ {
	int n;
	boolean flag = false;
	 synchronized void put(int n) {
		 if(flag){
			 try{
				 wait();
			 }catch(InterruptedException e) {
				 System.out.println("InterruptedException caught!");
			 }
		 }
		 notify();
		 flag = true;
		 this.n = n;
		 System.out.println("put: "+this.n);
		 
	 }
	 
	 synchronized void get() {
		  if(!flag){
			 try{
				 wait();
			 }catch(InterruptedException e) {
				 System.out.println("InterruptedException caught!");
			 }
		 }
		 notify();
		 flag = false;
		 System.out.println("get: "+n);
	 }
}

class Producers implements Runnable {
	QQ q=null;
	Producers(QQ q){
		this.q = q;
		new Thread(this,"producer").start();
	}
	public void run() {
		int i = 0;
		while(i++<100){
			
		
		q.put(i);
		}
	}
}

class Consumers implements Runnable {
	QQ q=null;
	Consumers(QQ q){
		this.q = q;
		new Thread(this,"consumer").start();
	}
	public void run() {
	int i = 0;
		while(i++<100){
			
		q.get();
		}
	}
}