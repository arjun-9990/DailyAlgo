class LargestNumInArray {
	
	public static void main(String args[]){
		
		int arr[] = {1,2,3,41,5,6,7,8,9};
		largestNumInArray(arr);
		
	}
	
	public static void largestNumInArray(int arr[]){
		
		int largestNum = Integer.MIN_VALUE;
		
		for(int i = 0 ; i < arr.length; i++){
			if(largestNum < arr[i]){
				largestNum = arr[i];
			}
		}
		System.out.println(largestNum);
	}
	
}