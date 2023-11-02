package test1;

import test.Car;

public class MainClass01 {

	public static void main(String[] args) {
			//test.test1.Car 클래스로 객체 생성 후 객체 참조값을 car1이라는 지역변수에 담기
		
			Car car1 = new Car();
			car1.drive();
			String a = car1.name;
			car1.name = "Mr.Lee";
			String b = car1.name;
			
			System.out.println(a);
			System.out.println(b);
			
			Car car2 = new Car();
			String a1 = car2.name;
			car2.name = "Mr.Kim";
			String b1 = car2.name;
			System.out.println(a1);
			System.out.println(b1);
	}

}
