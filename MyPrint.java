import java.util.Scanner;

public class MyPrint {
	public static void main(String[] args){
		System.out.println("input a > 0 number");
		Scanner sn = new Scanner(System.in);
		while(true){
			try{
				String inputStr = sn.next();
				if(inputStr.equals("exit")) {
					System.exit(0);
				}
				int input = Integer.parseInt(inputStr);
				print(input);
			} catch(Exception e) {
				System.out.println("error,repeat input");
				continue;
			}
		}
		
		
	}
	public static void print(int input){
		for(int i = 0; i < input*2-1; i++) {
			if(i < input) {
				for(int j = 0; j < input-i-1; j++) {
						System.out.print(" ");
				}
				for(int n = 0; n < i+1; n++){
					
					System.out.print("* ");
				}
				System.out.println();
			} else {
				for(int j = 0; j < i - input +1; j++) {
						System.out.print(" ");
				}
				for(int n = 0; n < input*2-i-1; n++) {
					System.out.print("* ");
				}
				System.out.println();
			}
		}
	}

}
