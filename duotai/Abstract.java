abstract class Bycycle {
	public abstract void enjoy() ;
}

class Haha extends Bycycle {
	public void enjoy() {
		System.out.println("hello !");
	}
}

public class Abstract {
	public static void main(String[] agrs) {
		Bycycle h = new Haha();
		h.enjoy();
	}
}