import java.util.*;

public class TestMap {
	public static void main(String[] agrs) {
		Map m = new HashMap();
		
		/*m.put("a",new Integer(100));
		m.put("b",new Integer(56));
		m.put("c",new Integer(345));
		m.put("d",new Integer(34));*/
		//auto-boxing;
		m.put("a",100);
		m.put("b",56);
		m.put("c",345);
		m.put("d",34);
		Map m1 = new HashMap(m);
		//int i = ((Integer)m.get("a")).intValue();
		int i = (Integer)m.get("a");//auto-unboxing;
		m1.remove("b");
		System.out.println(m);
		System.out.println(m1);
		System.out.println(i+"   "+m.size()+" "+m1.containsKey("b")+" "+m1.containsValue(new Integer(100)));
	}
}