283. Move Zeroes

class Solution {
    public void moveZeroes(int[] nums) {
        if(nums==null){
            return;
        }
        int k = 0;
        for(int n = 0; n < nums.length ; n++ ){
            if(nums[n]!=0){
                nums[k]=nums[n];
                k++;
            }
        }

        for(int x = k ; x< nums.length ; x++ ){
            nums[x] = 0 ;
        }
    }
}