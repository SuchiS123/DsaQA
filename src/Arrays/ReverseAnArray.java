package Arrays;

import java.util.Arrays;
public class ReverseAnArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] array2 = new int[array.length];
        int n=0;

        for(int i = array.length-1; i >=0; i--)
        {
            array2[n]=array[i];
            n++;
        }

        System.out.println(Arrays.toString(array2));

    }
}
