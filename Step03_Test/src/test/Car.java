package test;
/*
 *  class 의 역할
 *  
 *  1. 객체의 설계도 역할
 *    - 객체는 heap 영역(사물함) 에  들어 있는 물건이라고 생각하면 된다. 
 *    - class 를 이용해서 객체를 원하는 시점에 원하는 갯수 만큼 만들어 낼수 있다
 *    - 만들어진 객체가 어떤 저장소와 어떤 기능을 가지게 할지 class 로 설계 할수 있다.
 *    
 *  2. data type 역할
 *  
 *  3. static 필드와 메소드를 포함하는 역할
 */
public class Car {
	//기능(method) 정의
	public String name; //데이터 저장소(field), 선언후 값 안 넣으면 객체 생성시 null로 초기화
	public int price;
	
	
	public void drive() {
		System.out.println(this.name + " is Running now");
	}
}
