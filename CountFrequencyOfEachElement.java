import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class CountFrequencyOfEachElement {
	
	public static void main(String args[]){
		int arr[] = {1,2,3,4,5,6,7,8,8,7,6,5,4,2,1,1,1,1,1,1};
		CountFrequencyOfEachElement(arr);
	}
	public static void CountFrequencyOfEachElement(int arr[]){
		
		Map<Integer,Integer> groupOfCount = new HashMap<>();
		
		for(int i = 0 ; i < arr.length; i++){
			
			if(groupOfCount.containsKey(arr[i])){
				groupOfCount.put(arr[i],groupOfCount.get(arr[i]) + 1);
			}else{
				groupOfCount.put(arr[i],1);
			}
			
		}
		
		Set<Integer> uniqueKeys = groupOfCount.keySet();
		
		for(Integer val : uniqueKeys){
			System.out.println(val + " :- " + groupOfCount.get(val));
		}
		
		
	}
	
}