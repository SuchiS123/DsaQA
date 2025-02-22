package Arrays;

public class SecMiniMumNo {

    public static void main(String[] args) {

        int[] arr = {2, 2, 3, 4, 1, 6, 5, 446, 535, 345};

        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Minimum number in the array: " + min);
        int min2 = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > min && arr[i] < min2) {
                min2 = arr[i];
            }
        }
        System.out.println("Second minimum number in the array: " + min2);

        int min3 = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i] > min2 && arr[i]<min3)
            {
                min3 = arr[i];
            }
        }
        System.out.println("Third minimum number in the array: " + min3);

    }
}
