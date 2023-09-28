package stringProgram;

public class FInd_wrd_Char_vow_cons_IndVow {
//Find no of word,char,vowels,constant and individual vowels
	public static void main(String[] args) {
		String s="narayanaswamy resigned as chief minister from pondicherry";
		int countSpace=0;
		int countVowels=0;
		int vowelA=0,vowelE=0,vowelI=0,vowelO=0,vowelU=0;
		
		for(int i=0;i<s.length();i=i+1)
		{
			if(s.charAt(i)==' ')
			{
				countSpace=countSpace+1;
			}
		}
		//1.No of Words
		System.out.println("No of Words :"+(countSpace+1));
		//2.No of characters
		System.out.println("No of Characters  :"+s.length());
		//3.No of Vowels
		for(int i=0;i<s.length();i=i+1)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			{
				countVowels=countVowels+1;
			}
			
		}
		System.out.println("no of vowels :"+countVowels);
		//4.no of constant
		System.out.println("no of constant :"+(s.length()-(countSpace+countVowels)));
		
		//5.no of individual vowels
		
		for(int i=0;i<s.length();i=i+1)
		{
			if(s.charAt(i)=='a')
				vowelA=vowelA+1;
			if(s.charAt(i)=='e')
				vowelE=vowelE+1;
			if(s.charAt(i)=='i')
				vowelI=vowelI+1;
			if(s.charAt(i)=='o')
				vowelO=vowelO+1;
			if(s.charAt(i)=='u')
				vowelU=vowelU+1;
			
		}
		
		System.out.println(" no of vowel a  :"+vowelA);
		System.out.println(" no of vowel e  :"+vowelE);
		System.out.println(" no of vowel i  :"+vowelI);
		System.out.println(" no of vowel o  :"+vowelO);
		System.out.println(" no of vowel u  :"+vowelU);
		
		
		
	}

}
