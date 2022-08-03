package oops.interfaces;

public class person implements student,youtuber {

	public static void main(String[] args) {
		
		person u=new person();
		u.study();
		u.makevideo();
        
	}

	@Override
	public void study() {
	System.out.println("person is studying");			
	}

	@Override
	public void makevideo() {
		System.out.println("person is making a good and horrible video");
		
	}
	

}
