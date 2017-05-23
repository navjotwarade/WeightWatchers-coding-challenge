package com.navjot;

public class reverseSentence {

	public static void main(String[] args) {
	   System.out.println(reverseEverything("124d"));	
	}
	
	public static String reverseEverything(String s){
		int j = s.length()-1;
		char [] charArray = s.toCharArray();
		for(int i = 0; i<s.length()/2; i++)
		{
			char temp = charArray[i];
			charArray[i] = charArray[j];
			charArray[j] = temp;
			j--;
		}
		return new String(charArray);
	}
	
}
