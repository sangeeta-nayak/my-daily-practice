public class FindMinMax {
    public static int findMin(){
        int[] arr = {2, 3, 4, 9, 1};
        int min = arr[0];
        int n = arr.length;
        for(int i=1; i<n; i++){
            int currentVal = arr[i];
            if(currentVal<min){
                min = currentVal;

            }
        }
        return min;
    }
    public static void main(String[] args){
        int minVal = findMin();
        System.out.println(minVal);

    }
}
