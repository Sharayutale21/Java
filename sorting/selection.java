import java.util.Arrays;

public class selection {
	public static void selection(int arr[]){
		for(int i = 0; i < arr.length - 1; i++){
			int minPos = i;
			for(int j = i + 1; j < arr.length; j++){
				if(arr[minPos] > arr[j]){
					minPos = j;
				}
			}
			// swap
			int temp = arr[minPos];
			arr[minPos] = arr[i];
			arr[i] = temp;

			// print array after each pass
			System.out.println("After pass " + (i + 1) + ": " + Arrays.toString(arr));
		}
	}

	public static void main(String[] args){
		int arr[] = {5, 4, 1, 3, 2};
		selection(arr);
		System.out.println("Final sorted array: " + Arrays.toString(arr));
	}
}
