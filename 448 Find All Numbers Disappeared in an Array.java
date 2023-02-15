448. Find All Numbers Disappeared in an Array

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        for( int num : nums ){
            int x = ( num - 1 )%n;
            nums[x] += n ;
        }
        List<Integer> result = new ArrayList<Integer>();
        for(int i = 0; i < n ; i++){
            if( nums[i] <=n ){
                result.add(i+1);
            }
        }
        return result;
    }
}