
package algo_data;

import java.util.Scanner;

/**
 *
 * @author ZAKARIA
 */
public class BubbleSort {
    
   public void bubble_sort()
   {
       Scanner s = new Scanner(System.in);
   
       System.out.print("Input array size => ");
       int size = s.nextInt();
      
       int[] arr = new int[size];
       
       // Input array element
       
       System.out.println("Enter Arra");
       for (int i = 0; i < size; i++) {
           arr[i] = s.nextInt();
       }
       
       // Display
       
       System.out.print("Display Array ELement = > ");
       for (int i = 0; i < size; i++) {
           System.out.println(arr[i] + " ");
       }
   }
    
}
