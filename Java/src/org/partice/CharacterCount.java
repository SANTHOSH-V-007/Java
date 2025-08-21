package org.partice;

public class CharacterCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "We are the changepond experts and learning testing tutorials";
		char target = 't';
		int count =0;
		input = input.toLowerCase();
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)==target) {
				count++;
			}
		}
		System.out.println("The character '" + target + "' occurs " + count + " times. ");

	}

}
