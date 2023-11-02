package test.auto2;

import test.auto.Car;
import test.auto.Engine;

public class MiniCar extends Car{

	public MiniCar(Engine engine) {
		super(engine);
		
	}
	public void openTruck() {
		if(this.engine == null) {
			System.out.println("There is no Engine");
			return;
		}
		System.out.println("open the truck ");
	}
}
