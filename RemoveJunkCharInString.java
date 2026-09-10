class RemoveJunkCharInString {
	
	public static void main(String args[]){
		
		String expration = "Ar452345jun_Gai52435kwad_9320_";
		
		System.out.println(expration.replaceAll("[^a-zA-Z]",""));
		
	}
	
}