package test.mypac;

public class Student {
	
	public Student() {
		//생성자(constructor) , 객체를 생성하는 시점에 무언가 준비 작업을 하고 싶으면 여기서 진행 +) 클래스명과 반드시 똑같이 지어야함 return type 없어야함 
		System.out.println("Student() 생성자 호출");
	}
	
	public void study() {
		System.out.println("Study!");
	}
	

}
