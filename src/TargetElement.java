public class TargetElement {
    public static boolean isTargetReceived(int[] arr, int target) {
        for (int value : arr) {
            if (value == target) {
                return true;
            }
        }
        return false;
    }
}
