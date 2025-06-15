public class Arrays_2d {
	//public static void spiralArray(int arr[][]){
	//	int startRow = 0;
	//	int startCol = 0;
	//	int endRow = arr.length -1;
	//	int endCol = arr[0].length - 1 ;

	//	while(startRow <= endRow && startCol<= endCol){
	//			//top row
	//			for(int i=startCol ; i<=endCol ; i++){
	//				System.out.print(arr[startRow][i] + " ");
	//			}
				
	//			//right col
	//			for(int i=startRow + 1 ; i<=endRow ; i++){
	//				System.out.print(arr[i][endCol] + " ");
	//			}
				

	//			//bottom row
	//			for(int i=endCol -1 ; i>=startCol ; i--){
	//				if(startRow == endRow) break; // to avoid printing the same row again
	//				System.out.print(arr[endRow][i] + " ");
	//			}
				

	//			//left col
	//			for(int i=endRow -1 ; i>=startRow + 1 ; i--){
	//				if(startCol == endCol) break; // to avoid printing the same column again
	//				System.out.print(arr[i][startCol] + " ");
	//			}

				
	//			startRow++;
	//			startCol++;
	//			endRow--;
	//			endCol--;
	//	}
			
	//		}

		//time complexity: O(n^2) 
		//public static void diagSum(int arr[][]) {
		//	int sum = 0;
			//for(int i=0 ; i<arr.length ; i++){
			//	for(int j=0 ; j<arr[i].length ; j++){
			//		if(i == j || i + j == arr.length - 1) {
			//			sum += arr[i][j];
			//		}
			//	}
				
			//}
			//System.out.println("Sum of diagonals: " + sum);


			//optimised -> time complexity o(n)
		//	for(int i=0 ; i<arr.length ; i++){
		//		//primary diag
		//		sum += arr[i][i];

		//		//sec diag
		//		if(i != arr.length - 1 - i) { // to avoid double counting the middle element in odd-sized arrays doubly
		//			sum += arr[i][arr.length - 1 - i];
		//		}


		//	}
		//	System.out.println("Sum of diagonals: " + sum);
		//}

		public static boolean mainsearchSortedArray(int arr[][], int key){
			int row = 0;
			int col = arr[0].length - 1; // Start from the top-right corner

			while(row < arr.length  && col>=0){
				if(arr[row][col] == key) {
					System.out.println("Element found at: (" + row + ", " + col + ")");
					return true; // Element found, exit the function
				} else if(key < arr[row][col]) {
					col--; // Move left
				} else {
					row++; // Move down
				}
			}
			return false;
		}
		
		public static void main(String[] args){
		int arr[][] = {
			{1, 2, 3, 4},
			{5, 6, 7, 8},
			{9, 10, 11, 12},
			{13, 14, 15, 16}
		};
		//diagSum(arr);

		int key = 14;
		mainsearchSortedArray(arr, key); // Call the function to search for the element
	}
}