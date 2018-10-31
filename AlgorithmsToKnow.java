
/**
 * Algorithms you should know cold. These examples are used on Arrays, but you
 * should eventually be able to adapt them to other iterable data types such as
 * Strings and ArrayLists.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AlgorithmsToKnow
{
    // return the number of times value occurs in an array
    public static int count(int[] nums, int value) {
        
        
        return 0;
    }

    // return the sum of all elements in an array
    public static int sum(int[] nums) {
        
        
        return 0;
    }
    
    // return the maximum value in an array
    public static int max(int[] nums) {
        
        
        return 0;
    }
    
    // return the minimum value in an array
    public static int min(int[] nums) {
        
        
        return 0;
    }
    
    // determine if an array contains a value using a linear search
    public static boolean contains(int[] nums) {
        
        
        return false;
    }
    
    // determine the location of a value if it exists in an array
    public static int find(int[] nums, int value) {
        
        
        return -1;
    }
    
    public  static void main(String[] args) {
        int[] values = new int[] {4, 9, 12, 11, 0, 19, 4, 2, 12, 4, 12};
        
        System.out.println( sum(values) );
    }
    
    /* Think about...
     *
     * - How could you modify the sum algorithm to return the mean value in a data set? (I wouldn't do this with ints.)
     * - How could you modify the max/min algorithms to find the LOCATION of the max/min values rather than the values themselves?
     * - With a linear search, what happens if the query value occurs multiple times in the array?
     * - Why do some algorithms have return statements both in the loop and at the end while others only contain a single return 
     *   statement?
     * - How would you modify the count algorithm to look at consecutive values? For example, how could you count the number of
     *   times consecutive values are the same?
     */
}
