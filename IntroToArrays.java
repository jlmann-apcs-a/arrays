/* This program demonstrates storing numeric values in Arrays. There
 * are some problems for you to try at the end.
 *
 * @author  [          ] <-- you
 * @version [          ] <-- today
 */
 
import java.util.Arrays;

public class IntroToArrays
{
	public static int sumArr(int[] nums)
	{
		int sum = 0;
		
		for (int i=0; i<nums.length; i++)
		{
			sum += nums[i];
		}
		
		return sum;
	}
	
	public static void main(String[] args)
	{
		// Here is how you create an array to hold 5 integers
		int[] someNums = new int[5];
		
		// Now let's put values in the individual locations.
		someNums[0] = 2;
		someNums[1] = 3;
		someNums[2] = 5;
		someNums[3] = 7;
		someNums[4] = 11;
		
		// The number referring to an elements position is called
		// its index. Notice how the first element is in position 0. 
		
		// Here's how to retrieve values.
		System.out.println(someNums[3]);
		int someSum = someNums[0] + someNums[4];
		System.out.println(someSum);
		
		// Here's how to get the size of an array.
		System.out.println(someNums.length);
		
		// Arrays are most useful because we can access values using loops.
		for (int i=0; i<someNums.length; i++)
		{
			System.out.print(someNums[i] + " ");
		}
		System.out.println();
		
		// We can also create an array with values like this.
		int[] moreNums = {0,1,1,2,3,5,8,13,21,34,55};
		for (int i=0; i<moreNums.length; i++)
		{
			System.out.print(moreNums[i] + " ");
		}
		System.out.println();
		
		// Arrays can even be sorted. The sort method is in the Arrays
		// class so it won't work without the import statement at the 
		// beginning of this class.
		int[] pi = {3,1,4,1,5,9,2,6,5};
		Arrays.sort(pi);
		for (int i=0; i<pi.length; i++)
		{
			System.out.print(pi[i] + " ");
		}
		System.out.println();		
		
		
		/********************** For you to do! **********************/
		
		// 0. Answer these. (Zero-indexing in the problems. I am so cool!)
		
			 // a. What values are stored in an int array by default? 
			 //    (Try printing an element in someNums before values 
			 //     are stored.)
			 
			 // b. How does the length of an array compare to the index
			 //    of its last element?
			 
			 // c. Suppose the first 20 Fibonacci numbers (starting 0,1,1)
			 //    are stored in an array. What are the indices of the prime
			 //    Fibonacci numbers?
			 
		
		// 1. Complete the arrSum(int[] nums) method above so that it 
		//    returns the sum of the int array passed.
		int sumOfNums = sumArr(moreNums);
		System.out.println(sumOfNums);
		
		
		// 2. Write and test a method max(int[] nums) which returns 
		//    the highest value in an int array.
		
		
		// 3. Write and test a method mean(double[] nums) which returns
		//    the mean of an array. Return the mean as a double.
		
		
		// 4. Write and test a method median(double [] nums) which returns
		//    the median of an array. Return the median as a double.
		//    (Don't forget to consider the case where the list has an
		//     even number of values.)
		
		
		// 5. Write and test method isPalindrome(int[] nums) that 
		//    returns true if nums is a Palindrome and false otherwise. 
		//    Ex: {8, 3, 1 ,3, 8} --> true, {5, 3, 2, 5} --> false.


	}
	
}