public class Testagrs {
	public static void main(String agrs[]) {
		int[] a = new int[9];
		int t=0;
		int k=0;
		for(int i=0; i < agrs.length; i++) {
			a[i] = Integer.parseInt(agrs[i]);
		}
		for(int i=0; i < a.length-1; i++){
			t=i;
			for(int j=i+1; j < a.length; j++){
	
				if(a[t]>a[j]) {
					//t=a[i];
					t=j;
					/*a[i]=a[j];
					a[j]=t;*/
				}
				
			}
			k=a[i];
			a[i]=a[t];
			a[t]=k;
		}
		for(int i=0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
			
	}
}