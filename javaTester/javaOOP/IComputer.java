package javaOOP;

public interface IComputer {

	//Mọi hàm trong interface đều là hàm abstract
	//Nếu ko gán từ khóa là abstract cho hàm thì tự hiểu đây vẫn là hàm abstract
	public void showComputerPerformance();
	
	//Abstract Method
	public abstract void showComputerRam();
	
}
