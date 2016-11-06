import java.util.*;

public class TestCollections {
	public static void main(String[] agrs) {
		List l = new LinkedList();
		for(int i=0; i<10; i++) {
			l.add("a"+i);
		}
		System.out.println(l);
		Collections.shuffle(l);
		System.out.println(l);
		Collections.reverse(l);
		System.out.println(l);
		Collections.sort(l);
		System.out.println(l);
		System.out.println(Collections.binarySearch(l,"a5"));
	}
}