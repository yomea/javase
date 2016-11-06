import java.util.*;

public class TestMap2 {
	private static final int ONE = 1;
	public static void main(String[] agrs) {
		Map<String,Integer> m = new HashMap<String,Integer>();
		
		for(int i = 0; i < agrs.length; i++) {
			/*Integer fre = m.get(agrs[i]);//int fre = m.get(agrs[i])==null ? 0 : m.get(agrs[i]);
			m.put(agrs[i],fre==null?ONE:(fre.intValue()+1));//m.put(agrs[i],fre==0?ONE:(fre+1));*/
			if(!m.containsKey(agrs[i])) {
				m.put(agrs[i],ONE);
			}else {
				int fre = m.get(agrs[i]);
				m.put(agrs[i],fre+1);
			}
		}
		System.out.println(m);
	}
}