public class Practice {
    public static void main(String[] args) {
        int nums[] = {1};
        int target = 0;
        System.out.println(search(nums, target));

    }
    public static int search(int nums[], int target){
        for(int i = 0; i < nums.length; i++){
            if(target == nums[i]){
                return i;
            }
        }
        return -1;
    }
}
