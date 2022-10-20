import java.util.Arrays;
 public class ArraysClockWise
{
    static int arrays[] = new int[]{10, 20, 30, 40, 50, 60};
     
    static void rotate_array()
    {
       int a = arrays[arrays.length-1], i;
       for (i = arrays.length-1; i > 0; i--)
          arrays[i] = arrays[i-1];
       arrays[0] = a;
    }
     
   public static void main(String[] args) 
    {
       // System.out.println("Original:");
        System.out.println(Arrays.toString(array));
         
        rotate_array();
         
       // System.out.println("After Rotated:");
        System.out.println(Arrays.toString(array));
    }
}
