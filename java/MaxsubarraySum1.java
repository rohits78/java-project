public class MaxsubarraySum1 {
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        printSubArray(arr);

    }
    public static void printSubArray(int arr[]){
        int sum = 0;
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                sum=0;
                for (int k = i; k <= j; k++) {
                    sum+=arr[k];
                }
                System.out.println(sum);
                if(maxsum<sum){
                    maxsum=sum;
                }
            }
        }
        System.out.println("max sum is: "+maxsum);
    }
}
//Time complexity will be: O(n^3).