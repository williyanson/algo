/* package whatever; // don't place package name! */
// http://ideone.com/MMDuXM

import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static int romanNumeralToDecimal(String romanNum)
	{
		int result = 0;
		int prevNum = 0;
		
		for(int i=romanNum.length()-1;i>=0;i--)
		{
			char currChar = romanNum.charAt(i);
			int currNum = romanNumeralMap(currChar);
			
			if(currNum == -1) return -1;
			
			// If going to the left is bigger, no problem, just add it up
			// if going to the left is smaller, we need to minis it up. 
			// Reference - https://goo.gl/Fms5kT
			if(prevNum < currNum) result += currNum;
			else result -= currNum;
			prevNum = currNum;
		}
		
		return result;
	}
	
	public static int romanNumeralMap(char romanNum)
	{
		romanNum = Character.toUpperCase(romanNum);
		if(romanNum == 'I') return 1;
		else if(romanNum == 'V') return 5;
		else if(romanNum == 'X') return 10;
		else if(romanNum == 'L') return 50;
		else if(romanNum == 'C') return 100;
		else if(romanNum == 'D') return 500;
		else if(romanNum == 'M') return 1000;
		
		return -1;
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		System.out.println(romanNumeralToDecimal("XCI"));
	}
}
