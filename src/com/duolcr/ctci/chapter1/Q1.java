package com.duolcr.ctci.chapter1;

public class Q1 {
	
	public static boolean isUnique(String str, boolean caseSensitive) throws Exception{
		if(str == null || str.length() == 0){
			throw new NullPointerException();
		}
		else{
			if(!caseSensitive) str = str.toLowerCase();
			for(int i = 0; i < str.length(); i++){
				for(int j = i+1; j < str.length(); j++){
					if(str.charAt(i) == str.charAt(j)) return false;
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args){
		String str = "E=-s0";
		try {
			System.out.println(isUnique(str, false));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
