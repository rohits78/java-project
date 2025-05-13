public class LargestinArray {
    public static void main(String[] args) {
        int arr[] = {4,3,2,6,7,89,43,23};
        int max = largestinArray(arr);
        int min = minimuminArray(arr);
        System.out.println(max);
        System.out.println(min);
    }
    public static int largestinArray(int arr[]){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static int minimuminArray(int arr[]){
            int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }
}
