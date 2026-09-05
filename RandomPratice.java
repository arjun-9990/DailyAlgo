import java.util.Map;
import java.util.Set;
import java.util.HashMap;

class RandomPratice {
	
	// input :- swiss
	// output :- w
	
	public static void main(String args[]){
		String value = "swiss";
		findFirstNonRepeatingChar(value);
	}
	public static void findFirstNonRepeatingChar(String value){
		
		char arr[] = value.toCharArray();
		Map<Character,Integer> holdTheCount = new HashMap<>();
		
		for(int i = 0 ; i < arr.length; i++){
			
			if(holdTheCount.containsKey(arr[i])) {
				holdTheCount.put(arr[i],holdTheCount.get(arr[i]) + 1);
			}else {
				holdTheCount.put(arr[i],1);
			}	
			
		}
		
		Set<Character> uniqueChar = holdTheCount.keySet();
		
		for(Character uniqueKey : uniqueChar){

			if(holdTheCount.get(uniqueKey) == 1) {
				
				System.out.println(" The First non - repeating  char is  :- "+ uniqueKey);
				break;
			}
			
		}
		
		
	}
	
}