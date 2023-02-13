// 1. Two Sum

//class Solution {
//    public int[] twoSum(int[] nums, int target) {
//        int[] result = new int[2];
//        for(int k = 0 ; k < nums.length ; k++){
//            for(int s = k+1; s < nums.length ; s++){
//                if(nums[s]+nums[k]==target){
//                    result[0] = k;
//                    result[1] = s;
//                    return result;
//                }
//            }
//        }
//        return result;
//    }
//}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> storage = new HashMap<>(nums.length, 1); 
        int[] result = new int[2];
        for(int k = 0 ; k < nums.length ; k++){
            int another = target - nums[k];
            Integer anotherIndex = storage.get(another);
            if( anotherIndex != null ){
                result[0] = anotherIndex;
                result[1] = k;
                break;
            }else{
                storage.put(nums[k], k);
            }
        }
        return result;
    }
}