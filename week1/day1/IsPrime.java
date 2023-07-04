package week1.day1;

public class IsPrime {
	public static void main(String[] args) {
		int n=41;
		boolean isprime = true;
		for (int i = 2; i < n-1; i++) {
			if(n%i==0) {
				isprime= false;
				break;
			}

		}
		if(isprime) {
			System.out.println("Prime");
		} else {
			System.out.println("Not Prime");
		}
	}

}

