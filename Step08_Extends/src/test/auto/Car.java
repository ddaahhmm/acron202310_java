package test.auto;

public class Car {
	//필드
	protected Engine engine;
	//Engine 객체를 생성자의 인자로 전달받는 생성자
	public Car(Engine engine) {
		this.engine = engine;
	}
	
	//메소드
	public void drive() {
		if(this.engine == null) {
			System.out.println("There is no Engine");
			return;
		}
		System.out.println("Run!");
	}
	/* 클래스,필드, 생성자,메소드에는 접근 지정자를 붙인다
	 * public :어디에서나 접근가능
	 * protected : 동일 package 혹은 상속관계에서 자식에서 접근가능
	 * x(default) : 동일한 package 안에서만 접근가능 
	 * private : 동일 클래스,객체 안에서 접근 가능 
	 * 
	 * new Car() -> X
	 * 
	 * new Car(new Engine() ) -> O
	 * 
	 * Engine e1 = new Engine(); 이 있을 경우
	 * new Car (e1); -> O 
	 * 
	 * 
	 * */
}
