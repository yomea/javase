public class TestBinarySearch {
	public static void main(String[] agrs) {
		int[] a = {1,2,3,4,5,6,7,8,9};
		System.out.println(binarySort(a,8));
	}
	public static int binarySort(int[] a, int m) {
		int startpos=0;
		int endpos=a.length-1;
		int binary=(startpos+endpos)/2;
		while(startpos <= endpos) {
			if(a[binary]==m) {
				return binary;
			}
			if(a[binary]>m) {
				endpos=endpos-1;
			}
			if(a[binary]<m) {
				startpos=startpos+1;
			}
			binary=(startpos+endpos)/2;
			 
		}
		return -1;
	}
}