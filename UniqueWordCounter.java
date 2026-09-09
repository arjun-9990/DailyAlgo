/*
Problem Statement:
Given a list of sentences (List<String>), write a method:
int countUniqueWords(List<String> sentences)

This method should:
- Extract all words from the sentences.
- Ignore case ("Hello" and "hello" are the same word).
- Count the number of unique words across all sentences.

Constraints & Notes:
- Words are separated by spaces.
- No need to handle punctuation (e.g., "Hello, world!") for this question.
- Use Java Streams to implement the solution.

@author Lalit Patil
*/

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueWordCounter {

	public int countUniqueWords(List<String> sentences) {

		Set<String> unique = new HashSet<>();
		for(int i = 0 ; i < sentences.size() ; i++){
			String value = sentences.get(i);
			String[] arr = value.split(" ");
			for (String word : arr) {
				unique.add(word.toLowerCase());
			}
		}

		return unique.size();
	}

	public static void main(String[] args) {
		UniqueWordCounter uniqueWordCounter = new UniqueWordCounter();

		List<String> sentences = Arrays.asList("Hello world", "hello again world", "HELLO Java");

		int count = uniqueWordCounter.countUniqueWords(sentences);
		System.out.println("Unique words count: " + count);
	}
}