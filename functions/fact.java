
import java.util.Scanner;
public class fact {
		public static int fact(int n){
		int factorial = 1;
		if(n > 0){
		for(int i = 1 ; i<= n ; i++){
			factorial = factorial * i;
		}
		return factorial; //it will return the factorial of n when main function calls it
		}else{
			System.out.println("Factorial is not defined for negative numbers.");
			return -1; // Indicating an error for negative input -> false output
		}

	}

	public static void main(String[] args) {
		//factorial
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to find its factorial: ");
		int n = sc.nextInt();
		int fact = fact(n);
		System.out.println("The factorial is: " + fact);
	}
}

