package com.learning.core.day2session1;

public class String_3
 {
 
	private static void printAllSubsequences(String str, int start, String curr)
 
	{
 
		if (start == str.length())
 
		{
 
            System.out.println(curr);
 
            return;
 
        }
 
		printAllSubsequences(str, start + 1, curr + str.charAt(start));
 
		printAllSubsequences(str, start + 1, curr);
 
    }
 
 
    public static void main(String[] args)
 
    {
 
        String str = "abc";
 
        printAllSubsequences(str, 0, "");
 
    }
 
}