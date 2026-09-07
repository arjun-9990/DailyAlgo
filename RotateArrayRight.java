import java.util.List;
import java.util.ArrayList;

class RotateArrayRight {
	
	public static void main(String args[]){	
		int arr[] = {1,2,3,4,5,6,7,8,9};
		int k = 3;
		rotateArrayFromKPosition(arr,k);
	}
	
	public static void rotateArrayFromKPosition(int arr[] , int k){
		
		List<Integer> val = new ArrayList<>();
		for(int i = k ; i < arr.length; i++){
			val.add(arr[i]);
		}
		
		// {1,2,3,4,5,6,7,8,9}
		
		// 4,5,6,7,8,9,1,2,3
		int count = 0;
		for(int i = val.size() ; i < arr.length ; i++){
			val.add(arr[count]);
			if(count > k){
				break;
			}
			count++;
		}
		
		System.out.println(val);		
	}
	
}