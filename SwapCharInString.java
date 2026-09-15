class SwapCharInString {
	public static void main(String args[]){
		String name = "Arjun";
		// output :- rAuJn;
		swapCharInString(name);
	}
	
	public static void swapCharInString(String name){
		
		char arr[] = name.toCharArray();
		String output = "";
		
		for(int i = 0 ; i < arr.length; i+=2){
			if(i + 1< arr.length){
				char firstChar = arr[i];
				char secondChar = arr[i+1];
				output+=String.valueOf(secondChar);
				output+=String.valueOf(firstChar);
			}else{
				output+=String.valueOf(arr[i-1]);
			}
		}
		
		System.out.println("My output is :- "+output);
		
	}
	
}