package test.mypac;

public class myRemocon implements Remocon{ //interface의 경우 예약어 implements를 사용 -> Override 필수! 

	@Override
	public void up() {
		System.out.println("Turn the channel up ");
	}

	@Override
	public void down() {
		System.out.println("Turn the channel down");
	}
	
}
