import java.util.*;
public class TestSleep {
	public static void main(String[] agrs) {
		Thread2 t2 = new Thread2();
		Thread td = new Thread(t2);
		td.start();
		try {
			Thread.sleep(10000);
		}catch(InterruptedException e){
			System.out.println(e.getMessage());
		}
		t2.flag=false;
	}
}

class Thread2 implements Runnable {
	public boolean flag = true;
	public void run(){
		try{
		while(flag){
		System.out.println("The time is:"+new Date());
		Thread.sleep(1000);
		}
		}catch(InterruptedException e) {
			return;
		}
	
	}
}