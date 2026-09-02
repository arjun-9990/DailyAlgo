class FindMissingNumber {
	
	public static void main(String args[]){
		int arr[] = {1,2,3,4,6,7,8,9};
		findMissingNumber(arr);
	}
	
	public static void findMissingNumber(int arr[]){
		int totalArraySum = Integer.MIN_VALUE;
		int totalSumArray = Integer.MIN_VALUE;
		for(int i = 0 ; i < arr.length; i++){
			totalSumArray += arr[i];
		}
		
		// TODO :- update this without hardcode values;
		for(int i = 1 ; i <= 9 ; i++){
			totalArraySum += i;
		}
		System.out.println("The missing num = " + (totalArraySum - totalSumArray));
		
	}
}