import java.util.Scanner;
public class bin_coeff {
	
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
	public static int binCoeff(int n , int r){
			int fact_n = fact(n);
			int fact_r = fact(r);
			int fact_nmr = fact(n-r);

			int bin_coeff = fact_n/(fact_r * fact_nmr);
			System.out.println("The binomial coefficient C(" + n + ", " + r + ") is: " + bin_coeff);
			 
			return bin_coeff;
		}

			public static void main(String[] args){
				//binomial coefficient
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n for binomial coefficient C(n, r): ");
		int n= sc.nextInt();
		System.out.print("Enter r for binomial coefficient C(n, r): ");
		int r = sc.nextInt();

		binCoeff(n ,r);
			}
}

