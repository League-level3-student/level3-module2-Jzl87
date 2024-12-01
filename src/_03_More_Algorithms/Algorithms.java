package _03_More_Algorithms;

import java.util.Arrays;
import java.util.List;

/*
 * Write your methods in this class
 */
public class Algorithms {

	public static String multiply(int num1, int num2) {
		return null;
	}

	public static int findBrokenEgg(List<String> eggs) {

		for (int index = 0; index < eggs.size(); index++) {
			if (eggs.get(index).equals("cracked")) {
				return index;
			}
		}

		return -1;
	}

	public static int countPearls(List<Boolean> oysters) {
		int result = 0;
		for (int x = 0; x < oysters.size(); x++) {
			if (oysters.get(x)) {
				result++;
			}
		}
		return result;
	}

	public static double findTallest(List<Double> list) {
		Double result = 0.0;

		for (int x = 0; x < list.size(); x++) {
			if (list.get(x) > result) {
				result = list.get(x);
			}
		}

		return result;
	}

	public static String findLongestWord(List<String> words) {

		String longestWord = "";
		int maxLength = 0;

		for (String word : words) {

			int currentLength = word.toCharArray().length;

			if (currentLength > longestWord.toCharArray().length) {
				longestWord = word;
				maxLength = currentLength;
			}
		}

		return longestWord;
	}

	public static boolean containsSOS(List<String> messages) {
		boolean result = false;

		for (String message : messages) {
			if (message.contains("... --- ...")) {
				result = true;
			}
		}

		return result;
	}

	public static List<Double> sortScores(List<Double> scores) {
		for (int i = 1; i < scores.size(); i++) {

			for (int j = i; j > 0; j--) {

				if (scores.get(j) < scores.get(j - 1)) {
					Double temp = scores.get(j);
					scores.set(j, scores.get(j - 1));
					scores.set(j - 1, temp);
				}

			}

		}

		return scores;
	}

	public static List<String> sortDNA(List<String> sequence) {

		for (int i = 1; i < sequence.size(); i++) {

			for (int j = i; j > 0; j--) {

				if (sequence.get(j).toCharArray().length < sequence.get(j - 1).toCharArray().length) {
					String temp = sequence.get(j);
					sequence.set(j, sequence.get(j - 1));
					sequence.set(j - 1, temp);
				}

			}

		}

		return sequence;
	}

	public static List<String> sortWords(List<String> sequence) {
		boolean sorted = false;
		while (!sorted) {
			sorted = true;
			for (int j = 1; j < sequence.size(); j++) {

				if (sequence.get(j).compareTo(sequence.get(j - 1)) < 0) {
					
					sorted = false;
					String temp = sequence.get(j);
					sequence.set(j, sequence.get(j - 1));
					sequence.set(j - 1, temp);
				}

			}
		}

		return sequence;
		
	}
}



