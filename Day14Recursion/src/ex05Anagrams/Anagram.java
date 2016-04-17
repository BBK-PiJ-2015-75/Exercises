package ex05Anagrams;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

/*An anagram is a word created by recombination of the letters in another words. Some anagrams make sense
(“silent”, “listen”) and some do not (“nietsl”). Some people only accepts “real” anagrams, but in this exercise we
will accept them all, even if they do not exist as real words.
Write a class with a method that takes a String as a parameter and returns a list (hint: you can use List<String>
and ArrayList<String>) of strings with all the anagrams that can be made with it. Note: Remember that if this
method is a pure function without side-effects, it is good practice to make it static.
Is it easy to do this both iteratively and recursively? Is this similar to a former exercise?*/


public class Anagram {
	
	public static void main(String[] args){
		Anagram a = new Anagram();
		HashSet<String> permutations  = a.recAnagramFinder("abcd", "abcd");
		
		System.out.println("Size " + permutations.size());
		
		Iterator<String> it = permutations.iterator();
		
		while (it.hasNext()){
			System.out.println(it.next());
		}
		
	}

	// takes a string and returns a set of the anagrams
	private HashSet<String> recAnagramFinder(String s, String letter) {
		//if the length of the string is zero, return an empty set
		if (s.length() == 0){
			return new HashSet<String>();
		}
		
		//oneCharacter is a new set for the anagrams beginning with one letter.
		HashSet<String> oneCharacter = new HashSet<String>();
		
		// size of set is the max no of combinations for a string of string letter's factorial.
		int sizeOfSet = factorial(letter.length()-1);
		
		//while the set doesn't have the maximum no of anagrams possible
		while(oneCharacter.size() < sizeOfSet){
			
			//create a new arrayList consisting of the characters of the string letters 
			ArrayList<Character> chars = new ArrayList<Character>();
			
			for (int i=0; i < letter.length(); i++){
				chars.add(letter.charAt(i));
			}
			
			// the first letter of char changes every time an anagram is added
			String anagram = "" + s.charAt(0);
			chars.remove(new Character(s.charAt(0)));
			
			// create an anagram consisting of the letters in char, decrease char as you go along
			while (chars.size() > 0){
				Random r = new Random();
				
				int rand = r.nextInt(chars.size());
				
				char c = chars.remove(rand);
			
				anagram += c;
			}
			// add the anagram to oneCharacter set
			oneCharacter.add(anagram);
			
		}
		
		oneCharacter.addAll(recAnagramFinder(s.substring(1), letter));
		
		return oneCharacter;
	}

	
	
	private int factorial(int i) {
		if (i > 0)
			return i * factorial (i-1);
		else 
			return 1;
	}

}
