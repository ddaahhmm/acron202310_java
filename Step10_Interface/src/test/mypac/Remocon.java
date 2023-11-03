package test.mypac;
/*[interface]
 * 생성자가 없음(단독 객체 생성불가)
 * 구현된 메소드는 가질 수 없음(추상 메소드만 가질 수 있음)
 * 필드는 static final 상수만 가질 수 있음
 * data type의 역할 할 수 있음
 * interface type의 참조값이 필요하면 구현(implements) 클래스를 만들어서 객체 생성해야함
 * 클래스 상속은 단일 상속이지만 인터페이스는 다중 구현 가능
 * */
public interface Remocon {
	public String COMPANY = "LG";
	public void up(); //인터페이스는 추상 메소드밖에 없음 -> abstract 안붙여 줘도 됨 , 메소드의 모양만 정의함 
	public void down();
}
