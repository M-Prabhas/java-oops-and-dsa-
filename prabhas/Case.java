package prabhas;

public class Case {

	public static void main(String[] args) {
int rating=3;

switch(rating) {
case 1:
case 2:
	System.out.println("bad review");
	break;
case 3:
	System.out.println("average review");
	break;
case 4:
case 5:
	System.out.println("very good review");
	break;
	default:
		System.out.println("not applicable");
}
	}

}
