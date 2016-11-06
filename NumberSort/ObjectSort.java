
class Date1 {
	int year,month,day;
	Date1(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public int compare(Date1 d){
		return year>d.year?1:year<d.year?-1:month>d.month?1:month<d.month?-1:day>d.day?1:day<d.day?-1:0;
	}
	public String toString() {
		return "year--month--day--"+year+"--"+month+"--"+day;
	}
}

public class ObjectSort {
	public static void main(String[] agrs) {
		Date1[] a = new Date1[5];
		
		a[0] = new Date1(2013,4,5);
		a[1] = new Date1(2009,6,5);
		a[2] = new Date1(2078,12,5);
		a[3] = new Date1(2013,4,9);
		a[4] = new Date1(2010,8,5);
		
		print(bubbleSort(a));
		System.out.println(binarySort(a,a[3]));
		
	}
	public static Date1[] bubbleSort(Date1[] a) {
		int len = a.length;
		for(int i=len-1; i>=1; i--) {
			for(int j=0; j<i; j++) {
				if(a[i].compare(a[j])<0) {
					Date1 temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a;
	}
	public static void print(Date1[] a) {
		for(int i=0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
	public static int binarySort(Date1[] a, Date1 m) {
		int startpos=0;
		int endpos=a.length-1;
		int binary=(startpos+endpos)/2;
		while(startpos <= endpos) {
			if(a[binary].compare(m)==0) {
				return binary;
			}
			if(a[binary].compare(m)>0) {
				endpos=endpos-1;
			}
			if(a[binary].compare(m)<0) {
				startpos=startpos+1;
			}
			binary=(startpos+endpos)/2;
			 
		}
		return -1;
	}
	
}