package com.qa.portfolio;


public class MultiChar {

	/**
	 * For each character in the entered string the method will triplicate
	 * each the character and return the concatenated string.
	 * 
	 * @param input - any string
	 * @return triplicates of each letter from the input
	 */
	public String multiChar(String input) {
		
		String sentence = new String(); 
		
		for (int i = 0; i < input.length(); i++) {
			for (int x = 0; x < 3; x++) {
				sentence = sentence + input.charAt(i);
			}
		}
		return sentence;
	}

}
