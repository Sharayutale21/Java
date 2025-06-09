

public class overloading {
	//function overloading(no of parameters)
		public static int sum(int a , int b){
			return a + b;

		}
		public static int sum(int a , int b , int c){
			return a + b + c;
		}


	//function overloading(data type of parameters)
	public static int sum2(int a , int b){
		return a + b;
	}
	public static float sum(float a , float b){
		return a + b;
	}
public static void main(String[] args) {
	//function overloading(no of parameters)
		int sum1 = sum(2,3);
		System.out.println("The sum of two numbers is: " + sum1);
		int sum2 = sum(2,3,4);
		System.out.println("The sum of three numbers is: " + sum2);
	
	//function overloading(data type of parameters)
	    int sum3 = sum(2,3);
		System.out.println("The sum of two numbers is: " + sum3);
		float sum4 = sum(2.5f, 3.5f);
		System.out.println("The sum of three numbers is: " + sum4);
}}


