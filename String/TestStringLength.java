public class TestStringLength {
	public static void main(String[] agrs) {
		String s1 = new String("ABCjavajava000java00!java@$&^java*0java00abcd");
		String[] s2 = s1.split("0");
		String s8 = "abcdefghijklmnopqrstuvwxyz";
		String s9 = s8.toUpperCase();
		int count=0,COUNT=0,other=0,OTHER=0,java=0;
		int index=0;
		char[] s3 = s1.toCharArray();
		for(int i=0;i < s2.length; i++) {
		System.out.print(s2[i]+" ");
		}
		System.out.println();
		for(int i=0; i < s3.length; i++) {
			System.out.print(s3[i]+" ");
		}
		System.out.println();
		for(int i=0; i < s3.length; i++) {
			
			/*if(s3[i]=='0'){
				other++;
			}
			if('a'<=s3[i]&&s3[i]<='z'){
				count++;
			}else if('A'<=s3[i]&&s3[i]<='Z'){
				COUNT++;
			}else{
				OTHER++;
			}*/
			
			char cc = s1.charAt(i);
			if(s3[i]=='0'){
				other++;
			}
			
			/*if(s8.indexOf(cc)!=-1){
				count++;
			}else if(s9.indexOf(cc)!=-1){
				COUNT++;
			}else{
				OTHER++;
			}*/
			
			if(Character.isLowerCase(cc)){
				count++;
			}else if(Character.isUpperCase(cc)){
				COUNT++;
			}else{
				OTHER++;
			}
			
			if(s1.indexOf("java",index)!=-1) {
				 index=s1.indexOf("java",index)+4;
				java++;
			}
		}
		System.out.println(" "+count+" "+COUNT+" "+other+" "+OTHER+" "+java);
		
	}
}