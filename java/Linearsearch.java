public class Linearsearch {
    public static void main(String[] args) {
        int arr[] = {2,4,1,3,5,5,7,4,3,56};
        int key = 89;
        int index = linearSearch(arr,key);
        if(index == -1){
            System.out.println("Not Found");
        }else{
            System.out.println("Found at index: "+index);
        }

    }
    public static int linearSearch(int arr[], int key){
        for (int i = 0; i < arr.length; i++) {
            if(key == arr[i]){
                return i;
            }
        }
        return -1;
    }
}
