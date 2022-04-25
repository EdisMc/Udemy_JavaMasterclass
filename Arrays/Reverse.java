import java.io.*; 
import java.util.*;

public class ReverseArray {
    
    private static void reverse(int[] arr) {
        int temp;
        String array = Arrays.toString(arr);
        System.out.print("Array = "+ array);
        for (int i=0; i<arr.length; i++) {
            for(int j=0; j<arr.length-(i+1); j++){
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
        String stringArr = Arrays.toString(arr);
        System.out.println("Reversed array = "+ stringArr);
    }
}
