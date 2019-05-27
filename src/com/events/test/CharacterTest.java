/**
 * 
 */
package com.events.test;

/**
 * @author WZ
 *
 */
public class CharacterTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i = 0;
		int cp = "abcd".codePointAt(i);
		if(Character.isSupplementaryCodePoint(cp)) i+= 2;
		else i++;
		System.out.println(cp);
		
		System.out.println("a");
	}

}
