package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;

public class MainClass03 {

	public static void main(String[] args) {
		//
		HandPhone p1 = new HandPhone(); // -> HandPhone 객체를 생성함으로써 HandPhone,Phone,Object 전부 사용가능 
		Phone p2 = p1; //
		Object p3 = p1; // 총 객체 1개 생성 (key 만 3개)
	} //자식 객체의 참조값은 부모 type 변수나 필드에 자연스럽게 담김 

}
