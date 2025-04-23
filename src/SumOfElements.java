public class SumOfElements {
    public static int getSum(int[] elements) {
        int sum = 0;
        for (int element : elements) {
            sum += element;
        }
        return sum;
    }
}

