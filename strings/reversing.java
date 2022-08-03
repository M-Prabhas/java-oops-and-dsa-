package strings;

public class reversing {

	public static void main(String[] args) {
         String c="the sky is blue";
         String ans=" "; 
         int i =c.length()-1;
         while(i>=0) {
        	 while(i>0 && c.charAt(i)==' ')i--;
        	 int j=i;
        	 if(i<0)break;
        	 while(i>=0 && c.charAt(i) !=' ')i--;
        	 if(ans.isEmpty()) {
        		 ans=ans.concat(c.substring(i+1,j+1));
        	 }else {
        		 ans=ans.concat(" "+c.substring(i+1,j+1));
        	 }
        		 
        	 
        	        
         }
	}

}
