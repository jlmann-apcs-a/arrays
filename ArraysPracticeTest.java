/**
 * AP Computer Science
 * Arrays Practice Test
 *
 * @author  [                           ]
 * @version [                           ]
 */
 
import java.util.Arrays;

public class ArraysPracticeTest
{
	public static void main(String[] args)
	{
		// #1 - Create an array called pi with the integers 
		//      {3,1,4,1,5,9} stored in it.
		
				
		// #2 - What is the output of the line below?
		System.out.println(pi.length);
		
		
		// #3 - Fill each element in names with the names of four 
		//      different reindeer.
		String[] names = new String[4];
		

		
		
		
		
		
		// #4 - Write a for loop to print the elements in pi in 
		//      reverse order.
		
		
			
		
		
		
		
		// #5 - Write a method that selects two random elements from
		//      an int array and returns the product. Then write the
		//      line of code in main that would call the method to 
		//      print the product of two random elements of the array pi.
			
		
		// #6 - The block of code below shuffles the list names. What
		//      is the output after executing if r takes the random
		//      values {2,0,3,3}?
		for (int i=0; i<names.length; i++)
		{
			int r = (int)(names.length*Math.random());
			
			String temp = names[i];
			names[i] = names[r];
			names[r] = temp;
		}
		
		for (int i=0; i<names.length; i++)
			System.out.print(names[i] + " ");
		
		// #7 - Write a method that takes a String array and an int parameter and
		//      returns a new array with the element at the int parameter removed.
		//      Then write a line of code to remove reinder #2 from names.	
		
			
		// #8 - Write a method that returns an array with every consecutive
		//      pair of elements swapped. For example, {1,2,3,4,5,6} should
		//      become {2,1,4,3,6,5}. If the array has an odd number of 
		//      elements then the last element should remain unchanged. 
		//      The original array should not be altered.
		
	
		// #9 - Write a method that returns the sum of the elements in nums.
		double[] nums = {5.3, 6.8, 2.9, 1.0, 5.3, 9.2, 3.1};
		  
		
		// #10 - Write a method that returns the mean of nums. (You already have
		//      a mean method. Use it in this method. Don't rewrite code to find
		//      the mean. Write a line of code here to print the mean.
		
		
		// #11 - State the output.
		double n1 = nums[0];
		double n2 = nums[0];
		for (int i=0; i<nums.length; i++)
		{
			if (nums[i]<n1) n1 = nums[i];
			if (nums[i]>n2) n2 = nums[i];
		}
		System.out.println(n2-n1);
		
		
		// Bonus (0 points) - What is the output?
		String[] wish = {"Merry","Christmas"};
		for (int i=0; i<wish.length; i++)
		{
			if (i%2==0) 
			{
				System.out.print(wish[i]);
			}
			else if (i>0 && i<=wish.length-1)
			{
				System.out.print(wish[i]);
			}
			System.out.print(" ");
		}
	}
}