public class SumOfElements {
    public static void main(String[]args){
        int[] elements = {4, 5, 8, 3, 2};
        int sum = 0;
        int n = elements.length;
        for(int i=0; i<n; i++){
            sum = sum+elements[i];
        }
        System.out.println(sum);
    }

}
