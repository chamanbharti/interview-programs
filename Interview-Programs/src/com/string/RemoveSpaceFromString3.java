package com.string;
//Java Example Program to remove all whitespaces from a String
public class RemoveSpaceFromString3 {
public static void main(String[] args) {
	String input="hello world\texample\rwith\twhitespaces";
	String output=removeSpaces(input);
	
	System.out.println("Input: "+input);
	System.out.println("Output: "+output);
	
   }
//Remove all whitespace characters (space, tab, return etc.)
   private static String removeSpaces(String input){
	 return input.replaceAll("\\s", "");
	   //return input.replaceAll("\\s+", "");
   }
}
