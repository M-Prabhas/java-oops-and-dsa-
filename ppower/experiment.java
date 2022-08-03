package ppower;
class vehicle{
	int wheels;
	String color;
	
	vehicle(int noofwheels){
		wheels=noofwheels;
	}
	vehicle(int noofwheels,String color){
		wheels=noofwheels;
		this.color=color;
	}
}
public class experiment {
   experiment(){//constructor
    	
    }
	public static void main(String[] args) {
		
		vehicle car=new vehicle(4);
		vehicle emascooty=new vehicle(2);
		
		vehicle erikshaw=new vehicle(3,"yellow"); //compulsory arguements needed after setting the particular argument accepting constructor
		System.out.println(car.wheels +" wheels");
        System.out.println(emascooty.wheels +" wheels");
        System.out.println(erikshaw.wheels +"wheels and color" + erikshaw.color);
	}

    }

