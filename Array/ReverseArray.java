public class ReverseArray {
    public static void RevArray(int[] nums) {
        int start = 0, end = nums.length -1;

        while(start < end){
            int temp = nums[end];
            nums[end] = nums[start];
            nums[start] = temp;

            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int nums[] = {2,4,6,8,10};

        RevArray(nums);

        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i] + " ");
        }
    }
}
