// Java program to print the smallest element of the array
 
public class FindSmallestElementInArray {
    public static void main(String[] args)
    {
        // initialize array elements
        
        int[] initializedArray
            = new int[] { 25, 110, 74, 75, 5 };
 
        System.out.println("Given array ");
 
        for (int i = 0; i < initializedArray.length; i++) {
 
            System.out.println(initializedArray[i]);
        }
 
        // Initialize minValue with first element of array.
        int minValue = initializedArray[0];
 
        // Loop through the array
        for (int i = 0; i < initializedArray.length; i++) {
 
            // Compare elements of array with minValue and
            // if condition true, make minValue to that
            // element
 
            if (initializedArray[i] < minValue)
 
                minValue = initializedArray[i];
        }
 
        System.out.println(
            "Smallest element present in given array: "
            + minValue);
    }
}
