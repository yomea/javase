public class TestString {
	public static void main(String[] agrs) {
		char[] c2 = {'h','o','n','g','g','e'};
		String s5 = new String(c2,0,6);
		int intString = 123456789; 
		String s1 = "HelloWorld";
		String s2 = null,s3 = null;
		s2 = s1.substring(5,9);
		s3 = s1.substring(5);
		System.out.println(s2+" "+s3);
		String[] c1;
		c1 = s1.split("o");
		for(int i=0; i < c1.length; i++)
		System.out.println(c1[i]);
		String s4 = String.valueOf(intString);
		System.out.println(s4.length());
		System.out.println(s4.startsWith("234",1));
		System.out.println(s4.endsWith("789"));
		System.out.println(s5);
	}
}