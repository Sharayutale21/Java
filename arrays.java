package Java;

public class Arrays {


	//array is passed by reference 
	public static void update(int marks[] , int nonChangable){
		for(int i=0 ; i<marks.length ; i++){
			marks[i] = marks[i] + 1; // Increment each element by 1
		}

		nonChangable = nonChangable + 10; // This won't change the original variable
	}


   public static boolean linearSearch(String items[]){
	int key = 20;
	String key = "banana"; // Example string to search for
	for(int i=0; i <arr.length; i++){
		if(arr[i]==key){
			System.out.println("Element " + key + " found at index: " + i);
			return i; // Exit the function once the element is found
		}
		
	}
	for(int i=0 ; i<items.length ; i++){
		if(items[i] == key){ // Check if the integer matches the key
			System.out.println("Element " + key + " found at index: " + i);
			return i; // Exit the function once the element is found
		}
	}
	return -1; // Return -1 if the element is not found
   }

   public static int getLargest(int arr[]){
	int largest = Integer.MIN_VALUE;

	for(int i=0 ; i<arr.length ; i++){
		if(arr[i]>largest){
			largest = arr[i]; // Update largest if current element is greater
		}
	}
	System.out.println("Largest element in the array is: " + largest);
	return largest; // Return the largest element found

   }


//binary search
	public static int binarySearch(int numbers[] , int key){
		int start =0;
		int end = numbers.length - 1;

		while(start <= end){
			int mid = (start + end)/2;

			if(numbers[mid] == key){
				return mid;
			}
			if(numbers[mid] < key){
				start = mid + 1; // Move to the right half
			} else {
				end = mid - 1; // Move to the left half
			}
		}
		return -1;

	}

//reversing an array
	public static void rev(int numbers[]){
		int first = 0;
		int last = numbers.length - 1;

		while(first < last){
			int temp = numbers[last];
			numbers[last] = numbers[first];
			numbers[first] = temp;

			first++;
			last--;
		}
	}

//pairs in array
	public static void pairs(int numbers[]){
		int tp = 0; // Total pairs
		for(int i=0 ; i<numbers.length ; i++){
			int curr = numbers[i];
			for(int j=i+1 ; j<numbers.length ; j++){
				System.out.print("("+curr +","+numbers[j]+")");
				tp++; // Increment total pairs count
			}
			System.out.println();

		}
		System.out.println("Total pairs: " + tp); // Print total pairs
		
	}

//subarrays
	public static void subarray(int numbers[]){
		for(int i=0 ; i<numbers.length; i++){
			int start = i;
			for(int j=i ; j<numbers.length ; j++){
				int end = j;
				for(int k=start ; k<=end ; k++){
					System.out.print(numbers[k] + " ");
				}
				System.out.println(); // Print a new line after each subarray
			}
			System.out.println(); // Print a new line after each starting index
		}
	}
//sum in subarray
	public static void maxSubarraySum1(int numbers[]){
		int currSum = 0 ;
		int maxSum = Integer.MIN_VALUE; // Initialize maxSum to the smallest possible value
		for(int i=0 ; i<numbers.length; i++){
			int start = i;
			for(int j=i ; j<numbers.length ; j++){
				int end = j;
				currSum = 0;
				for(int k=start ; k<=end ; k++){
					currSum = currSum +numbers[k];
					
				}
				System.out.println(currSum);
					if(maxSum < currSum){
						maxSum = currSum; // Update maxSum if current sum is greater
					}
				
			}
			
		}
		System.out.println("Maximum sum in subarray: " + maxSum); // Print the maximum sum found
	}

//prefix sum
		public static void maxSubarraySum2(int numbers[]){
				int currSum = 0 ;
				int maxSum = Integer.MIN_VALUE; // Initialize maxSum to the smallest possible value
				int prefix[] = new int[numbers.length];
				prefix[0] = numbers[0]; // Initialize the first element of the prefix array
				//calculate prefix array
				for(int i=1 ; i<prefix.length;i++){
					prefix[i] = prefix[i-1] + numbers[i]; // Calculate prefix sum
				}



				for(int i=0 ; i<numbers.length; i++){
					int start = i;
					for(int j=i ; j<numbers.length ; j++){
						int end = j;
						currSum = start == 0 ? prefix[end] :prefix[end]-prefix[start - 1]; // Calculate current sum using prefix array
						//for(int k=start ; k<=end ; k++){
						//	currSum = currSum +numbers[k];
							
						//}

						
							if(maxSum < currSum){
								maxSum = currSum; // Update maxSum if current sum is greater
							}
						
					}
					
				}
				System.out.println("Maximum sum in subarray: " + maxSum); // Print the maximum sum found
			}

//kadanes algorithm
	public static void kadanes(int numbers[]){
		int currSum = 0;
		int maxSum = Integer.MIN_VALUE; // Initialize maxSum to the smallest possible value
		for(int i=0 ; i<numbers.length ; i++){
			currSum +=numbers[i];
			if(currSum < 0 ){ // If current sum becomes negative, reset it to 0
				currSum = 0;
			}
			maxSum = Math.max(currSum , maxSum);
		}
		System.out.println("Maximum sum in subarray: " + maxSum); // Print the maximum sum found
	}

public static int buyAndSellStocks(int prices[]){
	int buyPrice = Integer.MAX_VALUE;
	int maxProfit = 0;

	for(int i=0 ; i<prices.length ; i++){
		if(buyPrice < prices[i]){
			int profit = prices[i] - buyPrice;
			maxProfit = Math.max(maxProfit , profit);
		}else{
			buyPrice = prices[i];
		}
	}
	return maxProfit;
}



	public static void main(String[] args){
		int marks[] = {98,99,100};
		// Print the updated array
		for(int i=0 ; i<marks.length ; i++){
			System.out.print(marks[i] + " ");
		}
		int nonChangable = 5; // This variable will not be changed by the update function because it is passed by value
		update(marks , nonChangable);
		System.out.println("\nAfter update:" + nonChangable);


	//linear search 
		int arr2[]={2,4,6,8,10,12,14,16};
		linearSearch(arr); // Call the linear search function to find the element

		String items[]= {"apple", "banana", "cherry", "date", "elderberry"};
		linearSearch(items);


	//finding largest element in an array

		int arr1[] = {3, 5, 7, 2, 8, 1, 4};
	 	getLargest(arr); // Call the function to find the largest element

	//binary search
	// Note: The array must be sorted for binary search to work correctly
		int numbers[] = {10, 20, 30, 40, 50};
		int key = 30; // Example key to search for

		int result = binarySearch(numbers, key); // Call the binary search function
		System.out.println("Element " + key + " found at index: " + result);


	//reverse an array
	int numbers6[] = {1, 2, 3, 4, 5};
		rev(numbers);

		//print the reversed array
		for(int i=0 ; i<numbers.length ; i++){
			System.out.print(numbers[i] + " ");
		}
		System.out.println(); // Print a new line after the reversed array

//pairs in array
		int numbers0[] = {2 , 4, 6, 8, 10};
		pairs(numbers);

	//subarrays
	int numbers1[] = {1 , 2, 3, 4};
		
	//	// Call the subarray function to print all subarrays
	subarray(numbers);

	//max of subarraySum
		int numbers2[] = {1, -2, 6 , -1, 3};
		maxSubarraySum1(numbers); // Call the subarray function to find the maximum sum in subarrays
	
	//max of subarraySum
		int numbers3[] = {1, -2, 6 , -1, 3};
		maxSubarraySum2(numbers); // Call the subarray function to find the maximum sum in subarrays
	

	//kadanes algorithm
		int numbers4[] = {1, -2, 6 , -1, 3};
		kadanes(numbers); // Call the kadanes function to find the maximum sum in subarrays

	//buy and sell stocks
		int prices[] = {7,1,5,3,6,4};
		System.out.println(buyAndSellStocks(prices));
	}
}

