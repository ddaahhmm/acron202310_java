package test.main;

import test.mypac.HandPhone;

public class MainClass01 {
 /*Phone 클래스를 상속받은 HandPhone클래스 객체를 이용해 그 참조값을 p1라는 지역변수에 담기
  * */
	public static void main(String[] args) {
		HandPhone p1 = new HandPhone();
		/*
		 *HandPhone 클래스의 생성자를 호출해서 객체를 생성했더니 Phone 클래스의 생성자도 호출
		 *따라서 HandPhone 객체도 생성되고 Phone 객체도 같이 생성
		 *
		 *Phone 객체와 HandPhone 객체가 생성되어서 같은사물함에 들어간다
		 *즉, 하나의 참조값으로Phone의 기능, HandPhone 의 기능을 사용할 수 있다.*/
		p1.call();
		p1.mobileCall();
		p1.takePicture();
	}

}
