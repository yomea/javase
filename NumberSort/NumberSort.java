public class NumberSort {
	public static void main(String agrs[]) {
		int[] a = new int[agrs.length];
		int t;
		int k;
		for(int i=0; i < agrs.length; i++) {
			a[i] = Integer.parseInt(agrs[i]);
		}
		for(int i=0; i < a.length-1; i++){
			t=i;
			for(int j=i+1; j < a.length; j++){
	
				if(a[t]>a[j]) {
					
					t=j;
					
				}
				
			}
			if(t!=i) {
			k=a[i];
			a[i]=a[t];
			a[t]=k;
			}
		}
		for(int i=0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
			
	}
}