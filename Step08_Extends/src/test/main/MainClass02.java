package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;

public class MainClass02 {

	public static void main(String[] args) {
		
		HandPhone p1 = new HandPhone();
		
		Phone p2 = new HandPhone(); //phone type으로도 만들 수 있음 자식객체의 참조값을 부모타입으로 넣음  단, 사용은 Phone에 있는 것 밖에 못씀 -> 바꾸고 싶으면 casting 사용  
		
		Object p3 = new HandPhone(); //java의 다형성 
		
		/*
		 * 지역변수나 필드앞에 선언하는 data type은(참조 데이터 type)
		 * 
		 * 그 안에 들어있는 참조값의 사용 설명서라고 생각하면 됨
		 * 그렇기에 지역변수나 필드에 . 을 찍으면 사용 설명서에 명시된 기능만 사용 
		 * 
		 * java의 모든 객체는 다형성 가짐(type이 여러 종류)
		 * */
		
	}

}
