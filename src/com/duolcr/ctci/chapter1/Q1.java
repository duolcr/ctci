/*
 * Implement an algorithm to determine if a string has all unique characters.
 * What if you cannot use additional data structures?
 */
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
	
	public static boolean isUnique(String str) throws Exception{
		return isUnique(str, true);
	}
	
	public static void main(String[] args){
		String str1 = "E=-s0";
		String str2 = "Ee";
		String str3 = "";
		String str4 = null;
		String str5 = "ºº×Ö";//untested
		try {
			System.out.println(isUnique(str1));
			System.out.println(isUnique(str2, true));
			System.out.println(isUnique(str2, false));
			System.out.println(isUnique(str3, false));
			System.out.println(isUnique(str4, false));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
