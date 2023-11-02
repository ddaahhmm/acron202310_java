package test1;

public class Test00 {
	public double height;
	public double width;
	
	public void rec() {
		double result = height * width;
		System.out.println(this.height + "*" + this.width + "=" + result);
	}
}
