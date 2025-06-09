package Java.pattern.java;

public class pattern_adv {
//hollow rectangle
	public static void hollowRect(int totalRows , int totalCols) {
		for(int i = 1 ; i <= totalRows ; i++){
			for(int j=1 ; j<=totalCols ; j++){
				if(i==1 || i==totalRows || j==1 || j==totalCols) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

//inverted half pyramid
	public static void invPyr(int n){
		for(int i=1 ; i<=n ; i++){
			//spaces
			for(int j=1 ; j<=n-i; j++){
				System.out.print(" ");
			}
			//stars
			for(int j=1 ; j<=i ; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

//inverted half pyramid with numbers
	public static void inv(int n){
		for(int i=1 ; i<=n ; i++){
			for(int j=1 ; j<=n-i+1; j++){
				System.out.print(j);
			}
			System.out.println();
		}
		
	}

	
	public static void floyds(int n){
		int num=1;
		for(int i=1 ; i<=n ; i++){
			for(int j=1 ; j<=i ; j++){
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}
	}

//0-1 triangle

	public static void triangle_01(int n){
		for(int i=1 ; i<=n ; i++){
			for(int j=1 ; j<=i ; j++){
				if((i+j) % 2 == 0){
					System.out.print("1");
				} else {
					System.out.print("0");
				}
			}
			System.out.println();
		}
	}


//butterfly
	public static void butterfly(int n){
		//1st half
		for(int i=1 ; i<=n ; i++){
			//stars - i
			for(int j=1 ; j<=i ; j++){
				System.out.print("*");
			}

			//spaces - 2*(n-i)
			for(int j=1 ; j<=2*(n-i) ; j++){
				System.out.print(" ");
			}

			//stars - i
			for(int j=1 ; j<=i ; j++){
				System.out.print("*");
			}

			System.out.println();
		}

		//2nd half
		for(int i=n ; i>=1 ; i--){
			//stars - i
			for(int j=1 ; j<=i ; j++){
				System.out.print("*");
			}

			//spaces - 2*(n-i)
			for(int j=1 ; j<=2*(n-i) ; j++){
				System.out.print(" ");
			}

			//stars - i
			for(int j=1 ; j<=i ; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

//solid rhombus
	public static void solidRhombus(int n){
		for(int i=1 ; i<=n ;i++){
			//spaces - n-i
			for(int j=1 ; j<= n-i ; j++){
				System.out.print(" ");
			}


			//stars - n
			for(int j=1 ; j<=n ; j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}


//hollow rhombus
	public static void hollow_Rh(int n){
		for(int i=1 ;i<=n ; i++){
			//spaces
			for(int j=1 ; j<=n-i ; j++){
				System.out.print(" ");
			}

			//stars
			for(int j=1 ; j<=n ; j++){
				if(i==1 || i==n || j==1 || j==n){
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
	}
	
//diamond pattern
	public static void diamond(int n){

		//1st half
		for (int i=1 ; i<=n ; i++){
			//spaces - n-i
			for (int j=1 ; j<=n-i ; j++){
				System.out.print(" ");
			}

			//stars -  2i-1

			for(int j=1 ; j<=2*i-1 ; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		//2nd half
		for (int i=n ; i>=1 ; i--){
			//spaces - n-i
			for (int j=1 ; j<=n-i ; j++){
				System.out.print(" ");
			}

			//stars -  2i-1

			for(int j=1 ; j<=2*i-1 ; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		hollowRect(4,5);

		invPyr(5);

		inv(5);

		floyds(5);

		triangle_01(5);

		butterfly(5);

		solidRhombus(5);

		hollow_Rh(5);

		diamond(5);
	}}
