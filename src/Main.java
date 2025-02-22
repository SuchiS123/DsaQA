import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        int[] arr= {2,2,3,4,1,6,5,446,535,345};

        int max=arr[0];
        int min=arr[0];

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);


    }


}

