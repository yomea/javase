class Teacher {
	public void nihao() {
		System.out.println("nihaostudent!!!");
	}
}

class Student extends Teacher {
	public void nihao() {
		System.out.println("nihaoteacher!!!");
	}
}

public class OverWrite {
	public static void main(String agrs[]) {
		Student s = new Student();
		s.nihao();
	}
}