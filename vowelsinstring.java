package DSA;

public class vowelsinstring {
     

		
	// Function to check the Vowel 
	 public static boolean isVowel(char ch) 
	{ 
		ch = Character.toUpperCase(ch); 
		return (ch=='A' || ch=='E' || ch=='I' || 
						ch=='O' || ch=='U'); 
	} 
	
	// Returns count of vowels in str 
	public static int countVowels(String str) 
	{ 
		int count = 0; 
		for (int i = 0; i < str.length(); i++) 
			if (isVowel(str.charAt(i))) // Check for vowel 
				++count; 
		return count; 
	} 
	
		public static void main(String args[]) 
	{ 
		//string object 
		String str = "abc de"; 
	
		// Total numbers of Vowel 
		System.out.println(countVowels(str)); 
	} 
} 
 

