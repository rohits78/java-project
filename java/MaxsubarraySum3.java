public class MaxsubarraySum3 {
    public static void main(String[] args) {
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        kadanes(arr);
    }
    public static void kadanes(int arr[]){
        int maxssum = Integer.MIN_VALUE;
        int currsum = 0;

        boolean allnegative = true;
        int maxele = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>=0){
                allnegative=false;
                break;
            }
        }
        if(allnegative){
            for (int i = 0; i < arr.length; i++) {
                if(maxele<arr[i]){
                    maxele=arr[i];
                }
            }
            System.out.println("Max sum: "+maxele);
        }else{
            for (int i = 0; i < arr.length; i++) {
                currsum = currsum+arr[i];
                if(currsum<0){
                    currsum=0;
                }
                maxssum=Math.max(currsum,maxssum);
            }
            System.out.println("Max sum: "+maxssum);
        }
    }
}
