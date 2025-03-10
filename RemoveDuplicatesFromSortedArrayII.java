package leetcode;

public class RemoveDuplicatesFromSortedArrayII {
    public static int removeDuplicates(int[] nums) {
        int count=2;
        for(int i=2;i<nums.length;i++){
            System.out.println(nums[i] + " " + nums[i-2]);
            if(nums[i]==nums[count-2]) continue;

            else{
                nums[count]=nums[i];
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int k = removeDuplicates(nums);
        for(int i=0;i<k;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
