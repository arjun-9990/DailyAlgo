class CheckPrimeNumber {
	
	public static void main(String args[]){
		int num = 6;
		checkPrimeNumber(num);
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