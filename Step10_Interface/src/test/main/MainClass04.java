package test.main;

import test.mypac.Drill;

public class MainClass04 {

	public static void main(String[] args) {
		useDrill(new Drill() {
			
			@Override
			public void hole() {
				System.out.println("Drill the hole to the bottom");
			}
		});
			useDrill(()->{
				System.out.println("Drill the hole to the top");
			}); // hole()이라는 메소드와 같음 
		
	}

	public static void useDrill(Drill d) {
		d.hole();
		d.hole();
	}
}
