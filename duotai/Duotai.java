class Animal {
	String name;
	Animal(String name) {
		this.name = name;
	}
	public void enjoy(){
		System.out.println("Animal happy!");
	}
}

class Cat extends Animal{
	Cat(String name) {
		super(name);
	}
	public void enjoy(){
		System.out.println(name+"happy!");
		super.enjoy();
	}
}

class Dog extends Animal{
	Dog(String name) {
		super(name);
	}
	public void enjoy(){
		System.out.println(name+"happy!");
	}
}

public class Duotai {
	public static void main(String[] agrs) {
		//Cat a = new Cat();
		Animal a1 = new Cat("Cat ");
		Animal a2 = new Dog("Dog ");
		a1.enjoy();
		a2.enjoy();
		
	}
}