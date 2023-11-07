/**
 * Complete at least the first 4 methods below. Test them in the main method
 * Try the Challenges too!
 *
 * @author Ben Smith
 * @version (2/2021)
 */
public class ArrayAlgorithms
{
    /**
     * Average method to calculate an average
     * @ param int[] array of int values.
     * @return double average of int values in the array.
     */
    public static double average(int[] arr)
    { 
        double sum = 0;
        for( int num : arr )
        {
            sum+=num;
        }
        return sum/arr.length;
    }

    /**
     * Write the following methods:
     * public static double minimum(double[] arr)
     *      to find minimum value in an array
     * public static boolean findString(String[] words, String target)
     *      Search for a particular string in an array of strings
     * public static PotatoHead[] hasMoustache(PotatoHead[] taters)
     *      returns an array of Potatoheads from the original array
     *      that have moustaches. see Potatohead class in the project.
     * public static String bigRect(Rectangle[] rects)
     *      given an array of Rectangle objects, finds the one with the
     *      largest area, and returns the toString() for that rectangle.
     * CHALLENGES: optional
     * public static boolean hasDuplicates(int[] arr)
     *      Determine the presence or absence of duplicate elements in an int[]
     * public static int numPotatoesWithArms(PotatoHead[] potatoes, int numArms)
     *      Determine the number of elements meeting specific criteria
     *      in this case, number of potatoheads in an array with a 
     *      specified number of arms.
     * public static void shiftLeft( int[] arr )
     *      Shift elements in an int[] to the left
     *      placing the elelment in index 0 to last index.
     *      alter the original array, do not return a new one.
     * public static void reverse( rectangle[] rects )
     *      Reverse the order of the elements in the array.
     */
    public static double minimum(double[] arr)
    {
        double min = arr[0];
        for (int i=0; i<arr.length; i++)
        {
            if (arr[i]<min)
            {
                min = arr[i];
            }
        }
        return min;
    }
    public static boolean findString(String[] words, String target)
    {
        for (int i=0; i<words.length; i++)
        {
            if (words[i]==target)
            {
                return true;
            }
        }
        return false;
    }
    public static PotatoHead[] hasMoustache(PotatoHead[] taters) 
    {
        int numWithMoustache = 0;
        for (PotatoHead tater : taters) 
        {
            if (tater.getHasMoustache()) 
            {
                numWithMoustache++;
            }
        }
        PotatoHead[] withMoustache = new PotatoHead[numWithMoustache];
        int index = 0;
        for (PotatoHead tater : taters) 
        {
            if (tater.getHasMoustache()) 
            {
                withMoustache[index] = tater;
                index++;
            }
        }
        return withMoustache;
    }   
    public static String bigRect(Rectangle[] rects)
    {
        Rectangle largest = rects[0];
        for (Rectangle rect : rects)
        {
            if (rect.area() > largest.area())
            {
                largest = rect;
            }
        }
        return largest.toString();
    }
    
    public static void main(String[] args)
    {
        // setup the arrays
        int[] nums = {1,6,8,3,4,2,3, 9, 13, 56};
        // double array
        double[] arr = {1.4,6.3,8.1,3.2,4.3,2.4,3.5, 9.6, 13.7, 56.8};
        String[] words = {"pizza","fries","burger","milkshake","sandwich","lemonade"};
        // PotatoHead Array (at least 5 different PotatoHead objects)
        PotatoHead[] taters = {new PotatoHead("bob", 14, "hi", 8, true),new PotatoHead(),new PotatoHead("tim", 4, "howdy", 3, false), new PotatoHead(), new PotatoHead("jim", 10, "no!", 7, true)};
        // Rectangle Array (at least 5 different Rectangle objects)
        Rectangle[] rects = {new Rectangle(2,3), new Rectangle(1,5), new Rectangle(7,6), new Rectangle(5,4), new Rectangle(8,7)};
        // call and test the methods: Be aware of their return methods (or not)
        System.out.println("the average method: " + average(nums));
        // minimum(double[] arr)
        System.out.println("the minimum value: " +  minimum(arr));
        // findString(String[] words, String target)
        System.out.println("words with pizza in them: " + findString(words, "pizza"));        
        // hasMoustache(PotatoHead[] taters)
        System.out.println("potatoes that have moustaches: " + hasMoustache(taters));
        // bigRect(Rectangle[] rects)
        System.out.println("the rectangle with the largest area: " + bigRect(rects));
        
        // CHALLENGES:
        // hasDuplicates(int[] arr)
        // numPotatoesWithArms(PotatoHead[] potatoes, int numArms)
        // shiftLeft( int[] arr )
        // reverse( rectangle[] rects )
    }

}
