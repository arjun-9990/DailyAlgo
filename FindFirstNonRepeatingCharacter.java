import java.util.Map;
import java.util.HashMap;
import java.util.Set;

class FindFirstNonRepeatingCharacter {
	// input :- swiss
	// output :- w
	public static void main(String args[]){
		String value = "swiss";
		char[] arr = value.toCharArray();
		findFirstNonRepeatingCharacterByHashMap(arr);
	}
	public static void findFirstNonRepeatingCharacterByHashMap(char arr[]){
		
		Map<Character,Integer> charCount = new HashMap<>();
		
		for(int i = 0 ; i < arr.length; i++){
			
			if(charCount.containsKey(arr[i])){
				charCount.put(arr[i],charCount.get(arr[i]) + 1);
			}else{
				charCount.put(arr[i],1);
			}
			
		}

		
		for (int i = 0; i < arr.length; i++) {

            if (charCount.get(arr[i]) == 1) {
                System.out.print(arr[i]);
                break;
            }
        }
		
	}
}