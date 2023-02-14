88. Merge Sorted Array

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int k = 0 ; k < n ; k++){
            nums1[m+k] = nums2[k];
        }
        Arrays.sort(nums1);
    }
}

///////////////

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = m + n;
        int[] temp = new int[k];
        for(int index =0 , nums1Index = 0, nums2Index = 0 ; index < k ; index++ ){
            if( nums1Index >= m ){
                temp[index] = nums2[nums2Index++];
            }else if( nums2Index >= n ) {
                temp[index] = nums1[nums1Index++];
            }else if( nums1[nums1Index]< nums2[nums2Index] ){
                temp[index] = nums1[nums1Index++];
            }else{
                temp[index] = nums2[nums2Index++];
            }
        }
        for(int d = 0 ; d<k ; d++){
            nums1[d] = temp[d];
        }
    }
}