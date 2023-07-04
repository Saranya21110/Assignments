package week1.day2;

public class Calculator {
	public int addThreeNumbers(int a, int b, int  c) {
		return a+b+c;
	}
	public float subtractTwoNumbers(int a, float b) {
		return a-b;
	}
	public int divideTwoNumbers (int a, int b) {
	
	return a/b;
	}
	
	public static void main(String[] args) {
		Calculator c = new Calculator();
		int sum = c.addThreeNumbers(20,30,40);
		System.out.println("sum = " + sum );
		float sub = c.subtractTwoNumbers(30,10.03f);
		System.out.println("sub= " + sub);
		int divide = c.divideTwoNumbers(10, 2);
		System.out.println("divide=" + divide);
	}
	
}
