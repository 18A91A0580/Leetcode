package leetcode;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int count =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums={0,1,2,2,3,0,4,2};
        int val=2;
        int k = removeElement(nums, val);
        for (int i=0;i<k;i++){
            System.out.print(nums[i] + " ");
        }
    }
}
