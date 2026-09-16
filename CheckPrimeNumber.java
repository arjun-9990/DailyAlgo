class CheckPrimeNumber {
	
	public static void main(String args[]){
		int num = 97;
		checkPrimeNumber(num);
		checkPrimeNumberSecondApproch(num);
	}
	
	public static void checkPrimeNumberSecondApproch(int num){
		
		int count = 0;
		
		if(num <= 1){
			System.out.println(num + " :- Not a prime Number." );
			return;
		}
		
		for(int i = 1 ; i <= num ; i++){
			if(num % i == 0){
				count++;
			}
		}
		if(count == 2){
			System.out.println(num + " :- is a prime Number.");
			return;
		}
		System.out.println(num + " :- Not a prime Number." );
			
	}
	
	public static void checkPrimeNumber(int num){
		
		if(num <= 1){
			System.out.println(num + " :- Not a prime Number." );
			return;
		}
		
		for(int i = 2 ; i <= Math.sqrt(num); i++){
			if(num % i == 0){
				System.out.println(num + " :- Not a prime Number.");
				return;
			}
		}
		System.out.println(num + " :- is a prime Number.");
	}
	
}