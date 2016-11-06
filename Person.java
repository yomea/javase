public class Person {
	int id;
	int age=20;
	Person(int n,int i){
		id=n;
		age=i;
	}
	public static void main(String agrs[]) {
		Person Wuzhenhong = new Person(3607311,22);
		System.out.print(Wuzhenhong.id+"\n"+Wuzhenhong.age);
	}
} 