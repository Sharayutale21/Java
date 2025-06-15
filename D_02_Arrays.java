import java.util.Scanner;
public class D_02_Arrays {

	public static boolean search (int matrix[][] , int key){
		for(int i=0 ; i<matrix.length ; i++ ){
			
			for(int j=0 ; j<matrix[0].length ; j++){
				if(matrix[i][j] == key){
					System.out.println("Element found at position (" + i + "," + j +")");
					return true; // Exit after finding the first occurrence
				}
			}
		 }
		 return false;
	}

	public static int largest(int matrix[][]){
		int largest = Integer.MIN_VALUE;
		for(int i=0 ; i<matrix.length ; i++){
			for(int j=0 ; j<matrix[0].length ; j++){
				if(matrix[i][j] > largest){
					largest = matrix[i][j]; // Update largest if current element is greater
				}
			}
		}
		return largest;
	}
	public static void main(String[] args){
		
		int matrix[][] = new int[3][3];
		int n = matrix.length;
		 int m = matrix[0].length;


		 Scanner sc = new Scanner(System.in);
		 for(int i=0 ; i<n ; i++ ){
			for(int j=0 ; j<m ; j++){
				matrix[i][j] = sc.nextInt(); 
			}
		 }
		//output the matrix
		 for(int i=0 ; i<n ; i++ ){
			for(int j=0 ; j<m ; j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		 }

		 //searcging for an element
		 int key = 4; // Example key to search
		boolean found = search(matrix, key);

		//largest element in the matrix
		int largestElement = largest(matrix);
		System.out.println("Largest element in the matrix is: " + largestElement );
	}

}
	
	 

