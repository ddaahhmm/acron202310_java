package test.mypac;

public class AndroidPhone extends HandPhone{
	
	public AndroidPhone() {
		System.out.println("Android Constructor Call");
	}
	
	public void doInternet() {
		System.out.println("Internet");
	}
	
	@Override  
	public void takePicture() {
		//super.takePicture(); -> 부모 메소드를 가르킴 
		System.out.println("Take 100 Pictures ");
	}
}
