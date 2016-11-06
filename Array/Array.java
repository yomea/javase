public class Array {
	public static void main(String[] agrs) {
		int a[][] = {{3,2}, {6,4,1,7},{21,34,23}};
		for(int i=0; i < a.length; i++) {
			for(int j=0; j < a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
		}
	}
}