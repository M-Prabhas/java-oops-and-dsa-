package strings;

public class anagrams {

	public static void main(String[] args) {
		String s1="aab";
		String s2="abc";
	boolean isAnagram=true;
//	boolean isAnagram=false;
//		boolean visit[]=new boolean[s2.length()];
//		if(s1.length()==s2.length()) {
//		for(int i=0;i<s1.length();i++) {
//			char c=s1.charAt(i);
//			isAnagram=false;
//			for(int j=0;j<s2.length();j++) {
//				if(s2.charAt(j)==c && !visit[j]) {
//					visit [j]=true;
//					isAnagram=true;
//					break;
//					
//				}
//				
//				
//			}if(!isAnagram) {
//				break;
//			}
//			}
//		}
		
		
		
		
//		int al[]=new int[256];
//		int bl[]=new int[256];
//		
//        for(char c:s1.toCharArray()) {
//        	int index=(int)c;
//        	al[index]++;
//        }
//    
//        for(char c:s2.toCharArray()) {
//        	int index=(int)c;
//        	bl[index]++;
//        }
//       for(int i=0;i<256;i++) {
//    	   if(al[i]!=bl[i]) {
//    		   isAnagram=false;
//    		   break;
//    	   }
//       }
		
		
   	int al[]=new int[256];

	
    for(char c:s1.toCharArray()) {
    	int index=(int)c;
    	al[index]++;
    }

    for(char c:s2.toCharArray()) {
    	int index=(int)c;
    	al[index]--;
    }
   for(int i=0;i<256;i++) {
	   if(al[i]!=0) {
		   isAnagram=false;
		   break;
	   }
   }

		
		if(isAnagram) {
			System.out.println("anagram");
		}else {
			System.out.println("not anagram");
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
