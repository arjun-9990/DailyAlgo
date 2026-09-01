class SecondLargestNum {
	public static void main(String args[]){
		int arr[] = {98,2,3,4,5,6,7,8,9,100};
		findSecondLargestNum(arr);	
	}
	public static void findSecondLargestNum(int arr[]){
		
		int largestNum = Integer.MIN_VALUE;
		int secondLargestNum = Integer.MIN_VALUE;
		
		for(int i = 0 ; i < arr.length; i++){
			if(largestNum < arr[i]){
				secondLargestNum = largestNum;
				largestNum = arr[i];
			} else if (secondLargestNum < arr[i] && arr[i] != largestNum){
				secondLargestNum = arr[i];
			}
		}
		System.out.println("Second largestNum :- " + secondLargestNum);
	}
}