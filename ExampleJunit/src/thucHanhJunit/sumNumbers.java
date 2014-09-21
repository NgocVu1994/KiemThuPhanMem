package thucHanhJunit;

public class sumNumbers {
	private int a;
	private int b;
	public sumNumbers(int a,int b) {
		this.a = a;
		this.b = b;
		
	}
	public int sum() {
		if (a<0) a = 0;
		if(b<0) b= 0;
		return a+b;
	}
	public int getNumber1() {
		return a;
	}
	public int getNumber2(){
		return b;
	}

}
