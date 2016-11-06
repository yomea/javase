import java.util.*;

class Name implements Comparable {
	public String firstName, lastName;
	public Name(String firstName,String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String toString() {
		return firstName+" "+lastName;
	}
	public boolean equals(Object obj) {
		if(obj instanceof Name) {
			Name n = (Name)obj;
			return firstName.equals(n.firstName)&&lastName.equals(n.lastName);
		}
		return super.equals(obj);
	}
	public int hashCode() {
		return firstName.hashCode();
	}
	public int compareTo(Object a) {
		Name o = (Name)a;
		//return firstName.compareTo(o.firstName) > 0 ? 1 : firstName.compareTo(o.firstName) < 0 ? -1 : lastName.compareTo(o.lastName);
		if(firstName.compareTo(o.firstName) == 0) {
			return lastName.compareTo(o.lastName);
		}else {
			return firstName.compareTo(o.firstName);
		}
	}
}

public class TestCollection {
	public static void main(String agrs[]) {
		Collection c = new ArrayList();
		//c.add("hellloWorld");
		c.add(new Name("wu","zhenhong"));
		//c.add(new Integer(100));
		//c.remove("hellloWorld");
		//c.remove(new Name("wu","zhenhong"));
		System.out.println(c);
		c.add(new Name("sdgdfg","zhsdfg"));
		c.add(new Name("sd","sdgsd"));
		c.add(new Name("sdg","Scd"));
		List v = (List)c;
		Collections.sort(v);
		System.out.println(v);
		testIterator(c);
	}
	public static void testIterator(Collection c) {
		Iterator i = c.iterator();
		while(i.hasNext()) {
			Name n = (Name)(i.next());
			if(n.firstName.length()<3) {
				i.remove();
			}
			//System.out.println(n+" ");
			
		}
		System.out.println(c);
	}
}