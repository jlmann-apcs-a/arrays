
/**
 * Sings the Twelve Days of Chrismas song.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TwelveDays
{
    public static void main(String[] args)
    {
        String[] ordinals = {"first", "second", "third", "fourth",
                           "fifth", "sixth", "seventh", "eighth",
                           "ninth", "tenth", "eleventh", "twelfth"};
                           
                           
        String[] gifts = {"a partridge in a pear tree!",
                          "two turtle doves",
                          "three French hens",
                          "four calling birds",
                          "five golden rings",
                          "six geese a-laying",
                          "seven swans a-swimming",
                          "eight maids a-milking",
                          "nine ladies dancing",
                          "ten lords a-leaping",
                          "eleven pipers piping",
                          "twelve drummers drumming"};
                          
        for (int d = 0; d < 12; d++)
        {
            System.out.println("On the " + ordinals[d] + " of Christmas, ");
            System.out.println("my true love gave to me:");
            
            for (int g = d; g >= 0; g--)
            {   
                if (d>0 && g==0)
                System.out.print("and ");
                System.out.println(gifts[g]);
            }
            
            System.out.println();
        }
    }
}
