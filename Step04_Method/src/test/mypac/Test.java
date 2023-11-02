package test.mypac;

public class Test {


		/*
		 * [메소드 만들때 고려 해야하는것]
		 	1. 접근 지정자(모르면 public)
		 	2. static or non static (모르면 non static)
		 	3. 리턴 type(모르면 void)
		 	4. 메소드명
		 	5. 메소드에 전달하는 인자의 갯수와 데이터 type
		 */
		
		public void walk() {
			System.out.println("Walk!");
		}
		/*
		 * public -> 패키지가 달라도 호출 가능
		 * void -> 어떤 값도 리턴 X
		 * walk -> 메소드 명
		 * () -> 인수 없음 
		 */
		public int getNumber() {
			int num =10;
			return num;
		}
		
		/*
		 * int -> int 리턴 
		 * 
		 */
		
		public String getGreeting() {
			String greet ="Hello";
			return greet;
		}
	/*
	 * String-> String type return 
	 * */
		public void fly() {
			System.out.println("Fly!");
			
		}
	public void setNum(int num) {} //new Test().setNum() -> 호출 안됨 setNum(10) 등 인수 넣어야 호출이 작동
	public void setName(String name) {}
	public void setPlane(AirPlane plane) {} // AirPlane plane = new AirPlane() 이라는 인수 넣어야 호출 
	
	public void doSomething(int num, String name, AirPlane plane) {}
	public void send() {
		System.out.println("Send Something");}
	public void send(int num) {
		System.out.println("Send" + num);
	}
	public void send(String name) {
		System.out.println("Send" + name);
		
	}
	public void send(AirPlane plane) {
		System.out.println("Send AirPlane");
	}
}
