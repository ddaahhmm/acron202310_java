package test.main;

import test.mypac.Remocon;

public class MainClass03 {

	public static void main(String[] args) {
		Remocon r1 = new Remocon() {

			@Override
			public void up() {
				System.out.println("R1 Up");
			}

			@Override
			public void down() {
				System.out.println("R1 Down");
			} //implements Remocon 한 익명 클래스 생성 
			
		};
		useRemocon(r1);
		useRemocon(new Remocon() {
			
			@Override
			public void up() {
				System.out.println("up the temperature");
			}
			
			@Override
			public void down() {
				System.out.println(" down the temperature");
			}
		});
	}
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
}
