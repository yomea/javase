class Animal {
	String name;
	Animal(String n) {
		this.name = n;
	}
}

class Cat extends Animal {
	String eyesColor;
	Cat(String n, String color) {
		super(n);
		//this.name=n;
		this.eyesColor=color;
	}
	void getMessage(Animal a){
		if(a instanceof Cat){
			Cat c = (Cat)a;
			System.out.println(c.name+"\n"+c.eyesColor);
		}
		
	}
}

public class TestInstanceof {
	public static void main(String agrs[]) {
		Cat c = new Cat("mimi","black");
		c.getMessage(c);
	}
}