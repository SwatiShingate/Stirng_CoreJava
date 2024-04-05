package com.learning.core.day2session1;

import java.util.HashSet;
 
import java.util.Set;
 
public class String_9 {
  
	    public static String replaceSpaces(String str) {
 
	        StringBuilder result = new StringBuilder();
 
	        
 
	        for (char c : str.toCharArray()) {
 
	            if (c == ' ') {
 
	                result.append("%20");
 
	            } else {
 
	                result.append(c);
 
	            }
 
	        }
 
	        
 
	        return result.toString();
 
	    }
 
 
	    public static void main(String[] args) {
 
	        String input = "Mr John Smith";
 
	        String replaced = replaceSpaces(input);
 
	        System.out.println("Original string: " + input);
 
	        System.out.println("After replacing spaces: " + replaced);
 
	    }
 
	}
 


	