import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 9, 8, 0, 0};
        int[] arrForSum = {4, 5, 8, 3, 2};
        int[] arrForMinMax = {2, 3, 4, 9, 1};

        // 1. Target Element
        boolean isTargetPresent = TargetElement.isTargetReceived(arr, 2);
        System.out.println("Target 2 present: " + isTargetPresent);

        // 2. Sum of Elements
        int sum = SumOfElements.getSum(arrForSum);
        System.out.println("Sum of elements: " + sum);

        // 3. Move Zeros to End
        MoveZeros.moveZerosToEnd(arr);
        System.out.println("Array after moving zeros: " + Arrays.toString(arr));

        // 4. Find Min and Max
        int min = FindMinMax.findMin(arrForMinMax);
        int max = FindMinMax.findMax(arrForMinMax);
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
}
