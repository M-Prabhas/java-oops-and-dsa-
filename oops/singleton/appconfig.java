package oops.singleton;

public class appconfig {
 
	private appconfig() {
		
	}
//	private static appconfig obj=new appconfig();
	private static appconfig obj=null;
	public static appconfig getInstance() {
		if(obj==null) {
			obj=new appconfig();
		}
		return obj;
	}
}
