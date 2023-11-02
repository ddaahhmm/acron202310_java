package test.auto;

public class SportsCar extends Car {
	//extends Car 만 하면 오류뜸 -> Car 객체는 Engine 객체를 필요로 하기 때문 
	
	public SportsCar(Engine engine) {
		super(engine); 
		//super 는 부모 생성자를 의미 -> Car의 부모 생성자 : Engine 
		//부모 생성장에 필요한 값을 자식 생성자에서 받아 전달
		//super () 코드 실행전 다른 코드가 있으면 안됨!!! 
		
	}
	
	public void openDrive() {
		this.engine =engine;
		if(engine == null) {
			System.out.println("There is no Engine");
		}
		System.out.println("Open the roop and Run! ");
	}
}
