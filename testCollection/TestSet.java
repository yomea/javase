import java.util.*;

public class TestSet {
	public static void main(String[] agrs) {
		Set s = new HashSet();
		s.add("a");
		s.add("b");
		s.add("c");
		s.add("d");
		s.add("a");
		s.add("b");
		Set s1 = new HashSet(s);
		Set s2 = new HashSet(s1);
		s2.addAll(s2);
		Set s3 = new HashSet();
		s3.add("a");
		s3.retainAll(s);
		System.out.println(s3);
	}
}