package oops.abstraction;

public class audi extends car {

	
	
	public void brake() {
		System.out.println("audi is on brake position");
	}

	@Override
	public void accelerate() {
		System.out.println("audi is accelarating");
		
	}
}
