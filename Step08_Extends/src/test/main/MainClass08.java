package test.main;

import test.auto.Car;
import test.auto.Engine;

public class MainClass08 {

	public static void main(String[] args) {
		//Car 객체를 생성해서 참조값을 car1 이라는 지역변수에 담기 
		Car car1 = new Car(new Engine());
		
		car1.drive(); //drive 메소드 호출
	}

}
