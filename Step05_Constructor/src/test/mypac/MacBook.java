package test.mypac;

public class MacBook {
	private Cpu cpu;
	private Memory memory;
	private HardDisk hardDisk;
	
	public MacBook(Cpu cpu, Memory memory, HardDisk hardDisk) { //생성자의 매개변수로 전달되는 값을 필드에 저장
		this.cpu = cpu;
		this.memory = memory;
		this.hardDisk = hardDisk;
	}
}
