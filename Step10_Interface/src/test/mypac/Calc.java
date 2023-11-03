package test.mypac;

@FunctionalInterface // 추상메소드 딱 하나만 만들도록 정의함 () ->{} 형태로 사용할 수 있도록 보장

public interface Calc {
	/*메소드로 두개의 실수를 전달받아 어떤 연산을 하고 결과값을 리턴해주는 메소드
	어떤 연산을 할지는 개발자가 정함  */
	
	public double execute(double num1, double num2);
	
	// public void test(); -> 에러남 

}
