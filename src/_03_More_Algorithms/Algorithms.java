package _03_More_Algorithms;

import java.util.List;

/*
 * Write your methods in this class
 */
public class Algorithms {
    
    public static String multiply(int num1, int num2) {
        return null;
    }
    
    public static int findBrokenEgg(List<String> eggs) {
    	int result = -1;
        for (int index = 0; index < eggs.size(); index++) {
        	if (eggs.get(index).equals("cracked")) {
        		result = index;
        	}
        }
        return result;
    }
   
    public static int countPearls(List <Boolean> oysters) {
    	int result = 0;
    	for (int x = 0; x < oysters.size(); x++) {
    		if (oysters.get(x)) {
    			result++;
    		}
    	}
    	return result;
    }
    
    public static double findTallest (List <Double> list) {
    	Double result = 0.0;
    	 
    	for (int x = 0; x < list.size(); x++) {
    		if (list.get(x) > result) {
    			result = list.get(x);
    		}
    	}
    	
    	return result;
    }
}
