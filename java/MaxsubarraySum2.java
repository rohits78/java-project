public class MaxsubarraySum2 {
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        printSubArray(arr);
    }
    public static void printSubArray(int arr[]){
        int sum = 0;
        int maxsum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < prefix.length ; i++) {
            prefix[i]=prefix[i-1]+arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                sum=i==0? prefix[j]:prefix[j]-prefix[i-1];

                if(maxsum<sum){
                    maxsum=sum;
                }
            }
        }
        System.out.println("max sum is: "+maxsum);
    }
}
//Time complexity will be: O(n^2).