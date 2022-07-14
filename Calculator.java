package week1.day2;

public class Calculator {
	
	public void add(int a , int b) {
		System.out.println(a + b);
	}
	public void sub(int c , float d) {
		System.out.println(c - d);
	}
	public void mul(double e , int f) {
		System.out.println(e * f);
	}
	public void div(long g ,double h) {
		System.out.println(g / h);
	}



	public static void main(String[] args) {
		Calculator cal= new Calculator();
		cal.add(12 , 10);
		cal.sub(15, 5);
		cal.mul(15, 5);
		cal.div(20, 2);

	}

}