package Arrays;

public class SumOfArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        int sum = 0;
        for (int i = 0; i < array.length; i++) {

            sum= sum + array[i];
        }
        System.out.println("Sum of array elements: " + sum);
    }
}
