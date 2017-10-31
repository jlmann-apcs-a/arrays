/* AP Computer Science
 * More Array Practice
 *
 * @author  [                           ]
 * @version [                           ]
 */
 
 public class MoreArrayPractice
 {
 	public static int mystery0(int[] arr)	
 	{
	 	int x = arr.length;
	 	return x + arr[0] + arr[x-1];
 	}
 	
 	
 	public static int mystery1(int[] arr)	
 	{
 		int sum = 0;
 		for (int i=0; i<arr.length; i++)
 		{
 			if (i%2==0) sum += arr[i];
 		}
 		return sum;
 	}
 	
 	
 	public static int mystery2(int[] arr)	
 	{
 		int sum = 0;
 		for (int i=0; i<arr.length; i++)
 		{
 			if (arr[i]%2==0) sum += arr[i];
 		}
 		return sum;
 	}

 	
	public static void mystery3(int[] list1, int[] list2)
	{
		int mysteriousValue;
		for (int i=0; i<list1.length; i++)
		{
			mysteriousValue = list1[i] + list2[list2.length-1-i];
			System.out.print(mysteriousValue + " ");
		}
		System.out.println();
	}
	
	
	public static int mystery4(int[] arr)
	{
		int x = arr[0];		
		for (int i=1; i<arr.length; i++)
		{
			if (arr[i]<x) x = arr[i];
		}		
		return x;
	}
	
	
	public static boolean mystery5(int[] arr)
	{
		for (int i=0; i<arr.length-1; i++)
		{
			if (arr[i]>arr[i+1]) return false;
		}
		return true;
	}
	
	
	public static void reverseIt(int[] arr)
	{



		
		
		
		
		
		
		
		


		
		
	    
	    
	    
	    
	    
	    


	}
	
	
	public static int biggerThanIndex(int[] arr)
	{
		int n = 0;
		
		// your code goes here

		

		
		
		
		
		


		
		
		





		return n;
	}
	
	
	public static void main(String args[])
 	{
 		int[] pi = new int[6];
 		
 		// #0
 		System.out.println( pi[3] );
 		
 		
 		pi[0] = 3;
 		pi[1] = 1;
 		pi[2] = 4;
 		pi[3] = 1;
 		pi[4] = 5;
 		pi[5] = 9;
 		
 		
 		// #1
 		System.out.println(pi[0] + pi.length + pi[pi.length - 2]);
 		
 			
 		
 		// #2 - State the output.
 		int answer0 = mystery0(pi);
 		System.out.println(answer0);
 		
 		
		// #3 - State the output.
  		int answer1 = mystery1(pi);
 		System.out.println(answer1);
 		
 		
 		// #4 - State the output.
 		int answer2 = mystery2(pi);
 		System.out.println(answer2);
 		
 		
 		// #5 - State the output.
 		int[] e = {2, 7, 1, 8, 2,8 };
 		mystery3(pi,e); // (now it says "pie". cool.) 	
 			
 		
 		// #6 - State the output.
 		int answer4 = mystery4(e);
 		System.out.println(answer4);
 		
 		
 		// #7 - Give an example of a four-element array that when passed 
 		//      to mystery5 would return true and another example that  
 		//      would return false.
 		



 		
 		// #8 - Complete the method reverseIt so that it returns a new
 		//      array with the elements in reverse order. You'll have to
 		//      change the return type from void to int[]. (Right now, 
 		//      it's void just so this class will compile while you work
 		//      on other problems.
 		//int[] ip = reverseIt(pi);
 		
 		
 		// #9 - Complete the method biggerThanIndex so that it returns 
 		//      the count of elements larger than their index in the 
 		//      array. For example, in the e array, the values larger 
 		//      than their indices are 2, 7, 8, and 8. The output for 
 		//      the lines below should be 4.
 		int example7 = biggerThanIndex(e);
 		System.out.println(example7);
 	}
 }