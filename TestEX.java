public class TestEX {
	public static void main(String[] agrs) {
		int[] a = {1,2,3};
		System.out.println(a[2]);
		Hongge h = new Hongge();
		try{
		h.tiancai(0);
		}catch(MyException e) { 
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}
	}
}

class MyException extends Exception {
	private int id;
	MyException(String message, int id) {
		super(message);
		this.id = id;
	}
}

class Hongge {
	void tiancai(int i) throws MyException {
		
		if(i==0){
			throw new MyException("error!",3);
			}
		
	}
}