package test1;

import test.Car;

public class MainClass02 {

	public static void main(String[] args) {
		Car Sonata =new Car();
		Car BMW = new Car();
		
		Sonata.name = "Sonata";
		BMW.name = "BMW";
		
		Sonata.drive();
		BMW.drive();
		
		boolean result = Sonata == BMW; //다른 객체임 
		System.out.println(result);
		Car Car1 = Sonata;
		Car1.drive();
		boolean result1 = Car1 == Sonata; //같은 객체임 
		System.out.println(result1);
	
	}

}
