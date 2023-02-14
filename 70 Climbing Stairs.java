//70.爬樓梯:

// class Solution {
//     private Map<Integer, Integer> temp = new HashMap<>();
//     public int climbStairs(int n) {
//         if(n==1) return 1;
//         if(n==2) return 2;
//         if( temp.get(n) != null ){
//             return temp.get(n);
//         }else{
//             int result = climbStairs(n-1) +climbStairs(n-2);
//             temp.put(n, result);
//             return result;
//         }
//     }
// }

//=========

class Solution {
    public int climbStairs(int n) {
        if(n==1) return 1;
        if(n==2) return 2;
        int result = 0;
        int prepre = 1;
        int pre = 2;
        for(int k=3 ; k<=n; k++){
            result = prepre + pre;
            prepre = pre;
            pre = result;
        }
        return result;
    }
}