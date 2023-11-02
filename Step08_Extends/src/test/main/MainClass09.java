package test.main;

import test.auto.Engine;
import test.auto.SportsCar;

public class MainClass09 {

	public static void main(String[] args) {
		// SportsCar 객체를 생성해서 참조값을 car1 이라는 지역변수에 담기
		
		SportsCar car1 =new SportsCar(new Engine());
		
		car1.drive();
		car1.openDrive();
		
		SportsCar car2 =new SportsCar(null);
		car2.drive();
		car2.openDrive();
	}

}
