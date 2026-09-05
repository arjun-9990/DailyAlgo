import java.util.List;
import java.util.ArrayList;
class MoveAllZerosToEnd {
	
	public static void main(String args[]){
		int arr[] = {1,0,2,0,3,0,4,0,5,0,6,0,7,0,8,0,9,0};
		// {1,0,2,0,3,0,4,0,5,0,6,0,7,0,8,0,9,0}
		moveAllZerosToEnd(arr);
		optimizeMoveAllZerosToEnd(arr);
	}
	
	public static void optimizeMoveAllZerosToEnd(int arr[]) {

		int startPoint = 0;

		// Move all non-zero elements to the beginning
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] != 0) {
				arr[startPoint] = arr[i];
				startPoint++;
			}
		}

		// Fill remaining positions with zero
		while (startPoint < arr.length) {
			arr[startPoint] = 0;
			startPoint++;
		}

		// Print array
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void moveAllZerosToEnd(int arr[]) {
		
		int countOfZero = 0;
		
		List<Integer> moveAllZerosToEnd = new ArrayList<>();
		
		for(int i = 0 ; i < arr.length; i++){
			
			if(arr[i] != 0){
				moveAllZerosToEnd.add(arr[i]);
			}else{
				countOfZero++;
			}
			
		}
		
		for(int i = 0 ; i < countOfZero ; i++){
			moveAllZerosToEnd.add(0);
		}
		
		System.out.print(moveAllZerosToEnd);
		System.out.println();
		
	}
	
}