public class MoveZeros {
    public static void main(String[]args){

            int nums[]= {5, 8, 9, 0, 6, 0};
            int left = 0;
            int right = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    int temp = nums[right];
                    nums[right] = nums[left];
                    nums[left] = temp;
                    left++;
                }
            }

    }
}
