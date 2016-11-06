public class TestEquals {
	public static void main(String[] agrs) {
		Cat c1 = new Cat();
		Cat c2 = new Cat();
		System.out.println(c1.equals(c2));
		System.out.println(c1);
	}
}
class Cat {
	int color, height, weight;
	public boolean equals(Object obj) {
		if(obj==null) {
			return false;
		}
		else {
			if(obj instanceof Cat) {
				Cat c = (Cat)obj;
				if(color==c.color&&height==c.height&&weight==c.weight) {
					return true;
				}
			}
		}
		return false;
	}
	
	public String toString() {
		return "This is a cat!!!";
	}
}