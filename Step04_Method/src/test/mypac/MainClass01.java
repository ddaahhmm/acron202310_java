package test.mypac;

public class MainClass01 {

	public static void main(String[] args) {
		Test t =new Test(); 
		t.walk(); //return type 이 void 인 메소드 호출
		int num = t.getNumber(); //return type이 int 인 메소드 호출하고 리턴되는 값을 num이라는 int type 지역변수에 담기
		String a = t.getGreeting(); //return type이 String인 메소드 호출하고 리턴되는 값을 a라는 String type 지역변수에 담기
		String b = t.getGreeting();
	
		System.out.println(num);
		System.out.println(a);
		System.out.println(b);
		
		t.setName("Visnu");
		t.setNum(500);
		t.setPlane(new AirPlane());
	}

}
