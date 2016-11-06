import java.lang.reflect.Method ;

public class TestReflect {
	public static void main(String[] agrs) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		String str = "T";
		
		Class c = Class.forName(str);
		
		 ((T)c.newInstance()).mm();
		 
		 Method[] methods = c.getMethods();

		for(Method m : methods) {
			//System.out.println(m);
			System.out.println(m.getName());
		}
		
	}
}

class T {
	static {
		System.out.println("gg");
	}
	int i = 100;
	T() {
		System.out.println ("helloWorld.java");
	}
	public void mm() {
		System.out.println("mmmm");
		
	}
	
}
