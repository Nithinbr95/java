public class VowelCounter{
	
	public static void main(String args[]){
		
	char name[] = {'a','g','t','u'};
	char vowelCount = 0;
		for(int i=0;i<=name.length;i++){
			char art = name[i];
			if (art == 'a' || art == 'e' || art == 'i' || art == 'o' || art == 'u'){
			vowelCount++;
			}
			 System.out.println ("Number of vowels: " + vowelCount);
		}
		
	}
	
}
