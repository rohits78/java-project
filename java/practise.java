public class practise {
    public static void main(String[] args) {
        int arr[] = {-1,-2,-3,-4};
        check(arr);
    }
    public static void check(int arr[]){
        boolean allnegative = true;
        int maxele = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>=0){
                allnegative=false;
                break;
            }
        }
        if(allnegative){
            System.out.println("all elements are negative");
        }else{
            System.out.println("not all are negative");
        }
        for (int i = 0; i < arr.length; i++) {
            if(maxele<arr[i]){
                maxele=arr[i];
            }
        }
        System.out.println(maxele);
    }
}
