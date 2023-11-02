package test.mypac;


public class Phone { //어떤 클래스도 상송받지 않으면 자동으로 extends Object 가 됨 
	public Phone() {System.out.println("Phone Constructor Call");}
	public void call() {
		System.out.println("Call Someone");
	}
}
