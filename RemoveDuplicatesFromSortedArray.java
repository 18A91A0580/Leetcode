package leetcode;

public class RemoveDuplicatesFromSortedArray {

    public static int removeDuplicates(int[] nums) {
        int count=0;
        for (int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                nums[count]=nums[i];
                count++;
            }
        }
        nums[count]=nums[nums.length-1];
        return ++count;
    }
    public static void main(String[] args) {
        int[] nums ={0,0,1,1,1,2,2,3,3,4};
        int k = removeDuplicates(nums);
        for(int i=0;i<k;i++){
            System.out.print(nums[i] + " ");
        }
    }
}
