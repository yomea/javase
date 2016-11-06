class TestSuper {
	int i=90;
	TestSuper(int i) {
		this.i=i;
	}
}

class TestSuper1 extends TestSuper {
	TestSuper1() {
		super(100);
	}
}

public class Super {
	public static void main(String[] agrs) {
		TestSuper1 t = new TestSuper1();
		System.out.println(t.i);
	}
}