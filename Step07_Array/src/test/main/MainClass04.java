package test.main;

import test.mypac.Bike;

public class MainClass04 {

	public static void main(String[] args) {
		/*
		 * 1. Bike 객체를 담을수 있는 방 3개짜리 배열객체를 생성해서 참조값을 bikes라는 지역변수에 담기
		 * 2. 배열의 각자의 방에 Bike 객체를 생성해서 담기
		 * 3. 반복문 for를 이용해 순서대로 배열의 각각 방에 있는 Bike 객체의 ride() 메소드 호출
		 * 
		  */
		Bike[] bikes =new Bike[3];
		bikes[0] = new Bike();
		bikes[1] = new Bike();
		bikes[2] = new Bike();
		
		for(int i=0; i<bikes.length; i++) {
			bikes[i].ride();
		}
		//확장 for 문 사용
		
		for(Bike tmp : bikes) {
			tmp.ride();
		}
	}

}
