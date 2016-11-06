public class ArrayCopy {
	public static void main(String[] agrs) {
		String[] s = {"IBM","Apple","Oracle","Micosoft","Sun"};
		String[] sBak = new String[s.length];
		System.arraycopy(s,0,sBak,0,s.length);
		for(int i=0; i < sBak.length; i++) {
			System.out.print(sBak[i]+" ");
		}
		System.out.println();
		arraycopy();
	}
	public static void arraycopy(){
		int[][] intArray = {{1,2},{3,4,5},{6,7,8,9,0}};
		int[][] intArrayBak = new int[3][];
		System.arraycopy(intArray,0,intArrayBak,0,intArray.length);
		for(int i=0; i < intArrayBak.length; i++) {
			for(int j=0; j < intArrayBak[i].length; j++){
			System.out.print(intArrayBak[i][j]+" ");
			}
		}
	}
}
