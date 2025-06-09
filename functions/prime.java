import java.util.Scanner;

public class prime {
	//prime or not
	//only for n>=2
	public static boolean isPrime(int n){
		if(n <= 1) {
			return false; // Not prime
		}else if(n==2){
			return true;
		}
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0) {
				return false; // Not prime
			}
		}
		return true; // Prime	
	}



	//optimised function for prime no 
	public static boolean  isPrimeOpt(int n){
		if(n == 2) {
			return true ; 
			}

		for(int i=2 ; i<= Math.sqrt(n); i++){
			if(n % i == 0){
				
				return false ;
			}
		}
		return true ; 
	}

	//prims in range
	
	public static void primesInRange(int n){
		for(int i=2 ; i<= n ; i++){
			if(isPrime(i)) {
				System.out.print(i + " ");
			}
		}
		System.out.println(); // Print a new line after listing all primes
	}

public static void main(String[] args) {
	//prime or not
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to check if it is prime: ");
		int n = sc.nextInt();
		System.out.println("Is " + n + " a prime number? " + isPrime(n));
	
	//prims in range
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter a number to find all prime numbers up to that number: ");
		int m = sc1.nextInt();
		System.out.println("Prime numbers up to " + m + ":");
		primesInRange(n);
}}

