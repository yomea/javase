interface Painter {
	public static final String kind="picture";
	
	public void draw();
}

 interface Singer {
	public static final String vioce="beautiful";
	public void sing();
}
class SmallPig implements Painter,Singer {
	public void draw () {
		System.out.println("I'M A PAINTER!");
	}
	
	public void sing() {
		System.out.println("I'm a singer!"+"My vioce is "+vioce);
	}
}

class Student implements Singer {
	public void sing() {
		System.out.println("I'm a student!"+"My vioce is "+vioce);
	}
	void f(Singer s) {
		s.sing();
	}
}

public class TestInterface {
	public static void main(String agrs[]) {
		Singer s = new SmallPig();
		Painter d = (Painter)s;
		s.sing();
		Student as = new Student();
		as.f(as);
	}
	
}