package test.mypac;

public class MainClass02 {

	public static void main(String[] args) {
		Test t = new Test();
		t.doSomething(10, "Hello", new AirPlane());// int , String, AirPlane Type 
		 //send라는 같은 이름으로 여러 종류의 인수들이 있음 -> send에 대해 오버로딩 
	}

}
