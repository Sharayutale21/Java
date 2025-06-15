import java.util.Arrays;

public class insertion {
	public static void insertionSort(int arr[]){
		for(int i=1 ; i<arr.length ; i++){
			int curr = arr[i];
			int prev = i-1;
			while(prev >= 0  && arr[prev] > arr[curr]){
				//pushing elements
				arr[prev+1] = arr[prev];
				prev--;

			}
			//insertion
			arr[prev+1] = arr[curr];
			System.out.println("After pass " + (i) + ": " + Arrays.toString(arr));
		}
	}
	public static void main(String[] args) {
		int arr[] = {5,4,1,3,2};
		insertionSort(arr);
		System.out.println("Final sorted array: " + Arrays.toString(arr));
	}

}
