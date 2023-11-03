package test.main;

import test.mypac.Remocon;
import test.mypac.myRemocon;

public class MainClass02 {

	public static void main(String[] args) {
		myRemocon r1 = new myRemocon();
		Remocon r2 = r1;
		Object r3 = r1;
		
		useRemocon(r1);
		useRemocon(r2);
		//useRemocon(r3); 는 오류발생 Object != Remocon 
	}
	
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}

}
