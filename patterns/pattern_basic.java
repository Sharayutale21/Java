import java.util.Scanner;

public class pattern_basic {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();


		 //half pyramid pattern
		for(int line=1 ; line<=4 ; line++){
			for(int star=1  ; star<= line ; star++){
				System.out.print("*");
			}
			System.out.println();
		}


		//inverted half pyramid pattern
		for(int line=1 ; line<=n ; line++){
			for(int star=1  ; star<=n-line+1 ; star++){
				System.out.print("*");
			}
			System.out.println( );
		}


		//number half pyramid pattern
		for(int line=1 ; line<=n ; line++){
			for(int num=1  ; num<=line ; num++){
				System.out.print(num);
			}
			System.out.println( );
		}

		//char pattern
		char ch='A';
		for(int line=1 ; line<=n ; line++){
			for(int chars=1  ; chars<=line ; chars++){
				System.out.print(ch);
				ch++;
			}
			System.out.println( );
		}


	}
}
