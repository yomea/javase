public class NumberSort1 {
	public static void main(String agrs[]) {
		int[] a = new int[agrs.length];
		int t;
		for(int i=0; i < agrs.length; i++) {
			a[i] = Integer.parseInt(agrs[i]);
		}
		for(int i=0; i < a.length-1; i++){
			
			for(int j=i+1; j < a.length; j++){
	
				if(a[i]>a[j]) {
					t=a[i];
					
					a[i]=a[j];
					a[j]=t;
				}
				
			}
	
		}
		for(int i=0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
			
	}
}