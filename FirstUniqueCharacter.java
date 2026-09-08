/*
 Question: Given a string, find the first non-repeating character in it and return that character.
 If all characters repeat, return "_".

 Examples:
 "metamorphosys" → "e" (because 'm' repeats, but 'a' does not)
 "swiss" → "w"
 "aabbcc" → "_"

 Return:
 - First non-repeating character as a string (e.g., "u", "w")
 - Or "_" if none found

 Input: "success"
 Output: "u"
*/ 

import java.util.*;

public class FirstUniqueCharacter {

	public String execute(String input) {
        
		Map<Character,Integer> uniqueWord = new HashMap<>();
		
		char arr[] = input.toCharArray();
		
		for(int i = 0 ; i < arr.length ; i++){
			
			if(uniqueWord.containsKey(arr[i])) {
				uniqueWord.put(arr[i],uniqueWord.get(arr[i]) + 1);
			}
			else {
				uniqueWord.put(arr[i],1);
			}
		}
		
		String value = "";
		for(int i = 0 ; i < arr.length ; i++){
			
			if(uniqueWord.get(arr[i]) == 1){
				value = String.valueOf(arr[i]);
				break;
			}
		}
		if(value == ""){
			return value+="-";
		}
		return value;
	}

	public static void main(String[] args) {
        FirstUniqueCharacter finder = new FirstUniqueCharacter();

        String[] testCases = {"metamorphosys", "swiss", "aabbcc", "reappear", "success"};

        for (String test : testCases) {
            String result = finder.execute(test);
            System.out.println("Input: " + test + " → First unique character: " + result);
        }
    }
}
