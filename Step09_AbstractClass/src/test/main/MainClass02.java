package test.main;

import test.mypac.MyWeapon;
import test.mypac.Weapon;

public class MainClass02 {

	public static void main(String[] args) {
		//useString 메소드 호출하기
		MainClass02.useString("hello");
		MainClass02.useString("hello556");
		
		//아래의 useWeapon() 메소드를 여기서 호출 
		MainClass02.useWeapon(new MyWeapon() {
		});
		
		System.out.println("Main Method ends");
	}
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
	public static void useString(String msg) {
		System.out.println(msg+" 의 길이 : " + msg.length());
	}
}
