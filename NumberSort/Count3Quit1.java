public class Count3Quit1 {
	public static void main(String[] agrs) {
		int[] a = new int[500];
		int count=0;
		int left=a.length;
		int i=0;
		while(left>1) {
			if(a[i]==0) {
				
				count++;
				if(count==3) {
					a[i]=1;
					left--;
					count=0;
				}
			}
			i++;
			if(i==a.length) {
				i=0;
			}
			
		}
		for(int j=0; j<a.length; j++) {
			if(a[j]==0) {
				System.out.println(j+1);
			}
		}
	}
}