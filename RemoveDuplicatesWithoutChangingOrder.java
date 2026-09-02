import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.LinkedHashSet;

class RemoveDuplicatesWithoutChangingOrder {
	// output :- 4 2 5 7 8
	public static void main(String args[]){
		
		Integer arr[] = {4 ,2 ,4 ,5 ,2 ,7 ,5 ,8 ,7};
		removeDuplicatesWithoutChangingOrderBySet(arr);
		removeDuplicatesWithoutChangingOrderAndWithoutUsingCollection(arr);
	}
	
	public static void removeDuplicatesWithoutChangingOrderBySet(Integer arr[]){
		Set<Integer> uniqueValues = new LinkedHashSet<>();
		Collections.addAll(uniqueValues,arr);
		System.out.println(uniqueValues);
	}
	
	public static void removeDuplicatesWithoutChangingOrderAndWithoutUsingCollection(Integer arr[]){
		//4 ,2 ,4 ,5 ,2 ,7 ,5 ,8 ,7
		//4 2 5 7 8
		for(int i = 0; i < arr.length; i++){
			
			boolean isDuplicate = false;
			
			for(int j = 0 ; j < i; j ++){
				
				if(arr[i] == arr[j]){
					isDuplicate = true;
					break;
				}
				
			}
			
			if(!isDuplicate){
				System.out.print(arr[i] + " ");
			}
			
			
		}
	}
	
}