package _02_Intro_To_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class _03_SearchTest {

    /*
     *  A minimum of 3 tests are required for each method
     */
	
    @Test
    public void testLinearSearch() {
    	String []  words = new String [] {"ah", "B", "SNEK", "Mike", "verb", "transuranic", };
    	
    	
    	
        // 1. Use the assertEquals() method to test your linear search method
    	assertEquals(3, _01_LinearSearch.linearSearch(words, "Mike"));
    	assertEquals( -1, _01_LinearSearch.linearSearch(words, "Chjicken"));
    }

    @Test
    public void testBinarySearch() {
        // 2. Use the assertEquals() method to test your binary search method
        //    remember that the array must be sorted
    	
    	int [] nums = new int [] {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
        assertEquals(16, _02_BinarySearch.binarySearch(nums, 0, nums.length, 16));
    }
}
