class RemoveWhiteSpaceFromString {
	
	public static void main(String args[]){
		
		String withWhiteSpace = " Ar ju n  Gaik  wad";
		removeWhiteSpaceFromString(withWhiteSpace);
	}
	
	public static void removeWhiteSpaceFromString(String word){
		
		char arr[] = word.toCharArray();
		String withoutSpace = "";
		for(int i = 0; i < arr.length; i++){
			if(arr[i] != ' '){
				withoutSpace+=String.valueOf(arr[i]);
			}
		}
		
		System.out.println("Without space char :-  "+withoutSpace);
		
	}
	
}