package _02_Intro_To_Searching_Algorithms;

public class _01_LinearSearch {
    /*
     * When finding the location of a certain element in an array,
     * there are many algorithms that can do so. The simplest is the 
     * linear search. This is best for short unsorted lists of data.
     */
    public static int linearSearch(String[] words, String value) {
        // 1. Complete the method using a for loop to find the value
        //    in the array. Return the location in the array
        //    where the value was found.
        //    If the value is not found in the array, return -1.
    	int result = -1;
    	for (int x = 0; x < words.length; x++) {
    		if (words[x].equals(value)) {
    			result = x;
    		}
    	}
    
        return result;
    }
}
