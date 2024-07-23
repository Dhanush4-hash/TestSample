package Programs;

public class Factorial {

	public static void main(String[] args) {

		int no=12;
		int fact=1;
		
		for (int i = 1; i <=no; i++) {
			fact=fact*i;
		}
		
		System.out.println("The factorial of the given number is : "+fact);
		
	}

}
