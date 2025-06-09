import java.util.Scanner;

public class conversion {
	public static int binToDec(int binNum){

		int myNum = binNum; // Store the original binary number for reference
		int pow = 0;
		int decNum = 0;

		while(binNum > 0){
			int lastDigit = binNum% 10;
			 
			decNum = decNum + (lastDigit * (int)Math.pow(2, pow));
			pow++;
			binNum = binNum / 10; // Remove the last digit from the binary number
		}
		System.out.println("The decimal equivalent of binary " + myNum + " is: " + decNum);
		// Note: The function prints the decimal equivalent of the binary number
		return decNum; //it will return the decimal equivalent of the binary number when main function calls it
	}

	public static int decToBin(int decNum){
		int myNum = decNum; 
		int pow = 0;
		int binNum = 0;

		while(decNum > 0){
			int rem = decNum % 2;

			binNum = binNum + (rem* (int)Math.pow(10,pow));
			pow++;
			decNum = decNum / 2;
		}
		System.out.println("The decimal equivalent of binary " + myNum + " is: " + binNum);
		return decNum;
	}

	public static void main(String[] args) {
		//binary to decimal
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a binary number to convert to decimal: ");
		int decNo = binToDec(sc.nextInt());
		
		//binary to decimal
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter a binary number to convert to decimal: ");
		int binNo = decToBin(sc1.nextInt());
	}
}

