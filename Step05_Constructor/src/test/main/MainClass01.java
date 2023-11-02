package test.main;

import test.mypac.Student;

public class MainClass01 {

	public static void main(String[] args) {
		System.out.println("main method starts");
		
		new Student();
		
		System.out.println("main mehtod ends");
	}
	
 /*public Student(){}
  * 생성자를 명시적으로 정의하지 않아도 위와 같은 default 생성자는 있다고 간주
  * 따라서 생성자를 따로 만들지 않아도 new Student() 객체를 생성 할 수 있음 
  * */
}
