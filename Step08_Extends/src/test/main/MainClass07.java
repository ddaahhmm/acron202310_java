package test.main;

import java.util.Scanner;

import test.mypac.Phone;

public class MainClass07 {
	//java에서 사용하는 모든 data는 Object type 변수나 필드에 담을 수 있음
	public static void main(String[] args) {
		
		Object a = 10;
		Object b = true;
		Object c = 'a';
		Object d = "abcd";
		Object e = new Phone();
		Object f = new Scanner(System.in);
		
		Object[] objs = new Object[5];
		objs[0] = 10;
		objs[1] = true;
		objs[2] = 'A';
		objs[3] = new Phone();
		objs[4] = new Scanner(System.in);
		
		
		//지역 변수 e에 저장된 참조값을 이용해 전화를 걸기(call 메소드 호출)
		
		Phone e1 = (Phone) e;
		e1.call();
		
		//objs 배열의 3번방에 있는 참조값을 이용해 전화 걸기(call 메소드 호출)
		
		Phone e2 = (Phone)objs[3];
		e2.call();
		
		//한줄로 줄이기 
		
		((Phone) objs[3]).call();
		
	}//기본 data type은 Wrapper Classs Type 으로 간주되어 담김 

}
