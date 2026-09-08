/*
 Question:
 Given a positive integer, count how many of its digits **evenly divide** the number itself.

 A digit evenly divides a number if the number modulo digit equals 0.
 Ignore any zero digits.

 Examples:
 Input: 1012 → Output: 3 (1, 1, 2 divide 1012)
 Input: 1234 → Output: 2 (1 and 2 divide 1234)
 Input: 111 → Output: 3 (all 1s divide 111)

 Return:
 - An integer representing the count of digits that divide the original number.

 Input: 1012
 Output: 3
*/

public class DigitDivisors {
	public int countDividingDigits(int number) {
		// Write your code here
		
		int count = 0;
		
		int random = number;
		while(number > 0){
			
			int digit = number % 10 ; 
			if(digit != 0 && random % digit == 0){
				count++;
			}
			number /= 10;
		}
		return count;
	}

    public static void main(String[] args) {
        DigitDivisors digitDivisors = new DigitDivisors();
        int number = 1012;
        int result = digitDivisors.countDividingDigits(number);
        System.out.println("Input: " + number);
        System.out.println("Dividing digits count: " + result);
    }
}
