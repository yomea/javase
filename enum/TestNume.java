public class TestNume{
	 public enum MydoorOpen {me, myWife,myFather,myMother,mySister,mySon,myDaugter};
	public static void main(String[] agrs) {
		 int i=0;
		
		MydoorOpen m = MydoorOpen.myWife;
		switch(m) {
			case me : System.out.println("me");
			break;
			case myWife : System.out.println("myWife");
			break;
			case myFather : System.out.println("myFather");
			break;
			case myMother : System.out.println("myMother");
			break;
			case mySon : System.out.println("mySon");
			break;
			case myDaugter : System.out.println("myDaugter");
			break;
			default : System.out.println("null");		}
	}
}