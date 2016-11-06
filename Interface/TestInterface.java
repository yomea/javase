interface PetCarer {
	void feed();
	void play();
}

class Worker implements PetCarer {
	public void feed() {
		System.out.println("give pet some food!");
	}
	
	public void play() {
		System.out.println("Play with pet!");
	}
}

public class TestInterface {
	public static void main(String[] agrs) {
		PetCarer w = new Worker();
		w.feed();
		w.play();
	}
}