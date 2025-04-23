public class TargetElement {

    public static int IfTargetRecieved(int[] arr){
        int target = 2;
        int n = arr.length;
        boolean contains = false;
        for(int i=0; i<n; i++){
            if(arr[i]== target){
               contains=true;
               return contains;
            }
        }
    }
    public static void main(String[]args){
        int[] arr = {1, 2, 9, 8};
        int result = IfTargetRecieved(arr);
        System.out.println(result);
    }
}
