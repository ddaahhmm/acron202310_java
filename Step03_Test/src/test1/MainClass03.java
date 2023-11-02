package test1;

import test.Car;

public class MainClass03 {

	public static void main(String[] args) {
		
		new Car(); //객체를 생성해서 사용 하지 않고 버림
		
		new Car().name = "Mr"; //저장하더라도
		
		Car c1 = new Car();
		c1.drive();
		c1.drive();
		new Car().drive(); //여기서 저장된게 나오는게 아님 그냥 새로운 객체로 취급 
		}
	
}
