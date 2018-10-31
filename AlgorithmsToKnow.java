
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
        int count = 0;
        
        for (int i=0; i<nums.length; i++) {
            if (nums[i] == value) {
                count++;
            }
        }
        
        return count;
    }

    // return the sum of all elements in an array
    public static int sum(int[] nums) {
        int sum = 0;
        
        for (int i=0; i<nums.length; i++) {
            sum += nums[i];
        }
        
        return sum;
    }
    
    // return the maximum value in an array
    public static int max(int[] nums) {
        int max = nums[0];
        
        for (int i=1; i<nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        
        return max;
    }
    
    // return the minimum value in an array
    public static int min(int[] nums) {
        int min = nums[0];
        
        for (int i=1; i<nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        
        return min;
    }
    
    // determine if an array contains a value using a linear search
    public static boolean contains(int[] nums, int value) {
        for (int i=1; i<nums.length; i++) {
            if (nums[i] == value) {
                return true;
            }
        }        
        
        return false;
    }
    
    // determine the location of a value if it exists in an array
    public static int find(int[] nums, int value) {
        for (int i=1; i<nums.length; i++) {
            if (nums[i] == value) {
                return i;
            }
        }        
        
        return -1;
    }
    
    public  static void main(String[] args) {
        int[] values = new int[] {4, 9, 12, 11, 0, 19, 4, 2, 12, 4, 12};
        
        System.out.println( count(values, 12) );
        System.out.println( sum(values) );
        System.out.println( max(values) );
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
