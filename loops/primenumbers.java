package loops;

public class primenumbers {

	public static void main(String[] args) {
	
		int n=47;
		boolean isprime=true;
//		for (int i=2;i<n;i++) 
		for(int i=2;i*i<=n;i++){
			
			if(n%i ==0) {
			isprime=false;
		break;
					}
}
	if(n<2) {
			isprime=false;
	}
		System.out.println("isprime" + isprime);
	
	
		
		
		
	}

}
