public class Q2 {
	
	public static boolean match(String pattern, String string){
		if(pattern == null|| pattern.length() == 0 || string == null){
			return false;
		}
		
		int patternLength = pattern.length();
		int stringLength = string.length();
		
		if(stringLength >= patternLength){
			for(int i = 0; i < (stringLength-patternLength+1); i++){
				int j = 0;
				int k = i;
				while(j < patternLength && string.charAt(k) == pattern.charAt(j)){
					j++;
					k++;
				}
				if(j == patternLength) return true;
			}
		}
		
		return false;
	}
	
	public static void main(String args[]){
		System.out.println(match(args[0], args[1]));
	}
}