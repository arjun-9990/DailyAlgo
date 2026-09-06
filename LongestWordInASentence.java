class LongestWordInASentence{
	
	public static void main(String args[]){
		String value = "Java programming is very interesting";
		longestWordInASentence(value);
	}
	
	public static void longestWordInASentence(String value){
		
		String arr[] = value.split(" ");
		String largestWord = arr[0];
		for(int i = 1 ; i < arr.length ; i++){
			if(arr[i].length() > largestWord.length()){
				largestWord = arr[i];
			}
		}
		System.out.println("Largest Word is :- " + largestWord);
	}
	
}