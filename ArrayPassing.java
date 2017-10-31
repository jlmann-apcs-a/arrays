/**
 * I could put a description of the class ArrayPassing here,
 * but I'm not.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Arrays;

public class ArrayPassing
{
    public static void doSomething(int[] values)
    {
        for (int i=0; i<values.length; i++)
        {
            values[i] += 5;
        }
    }
    
    public static double median(double[] values)
    {
        double[] copy = new double[values.length];
        for (int i=0; i<values.length; i++)
            copy[i] = values[i];
        
        
        Arrays.sort(copy);
        int len = copy.length;
        
        if (len % 2 == 1)
            return copy[len / 2];
        else
            return (copy[len / 2] + copy[len / 2 + 1]) / 2;
    }

    public static int notSoMysterious(int x)
    {
        x = x + 5;
        return x;
    }
    
    /**
     * Make it go. 
     */
    public static void main(String[] aaaaaaarrrrrrrrrrgggggggg)
    {
        int num = 3;
        System.out.println(notSoMysterious(num));
        System.out.println(num);
        
        
        int[] unimportantListOfNumbers = {5, 8, 2, 0, 1, 5, 9, 17, 3, 573, 14 };
        System.out.println(Arrays.toString(unimportantListOfNumbers));
        
        doSomething(unimportantListOfNumbers);
        System.out.println(Arrays.toString(unimportantListOfNumbers));

    }
}
