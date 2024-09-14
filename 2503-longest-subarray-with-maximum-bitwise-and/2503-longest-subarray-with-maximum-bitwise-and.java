class Solution {
    public int longestSubarray(int[] nums) {
        int len =1;

        int mx = Integer.MIN_VALUE;
        for(int n: nums){
            mx=Math.max(n,mx);
        }

        int temp_length = 0;
        for (int n: nums){
            if(n == mx){
                temp_length++;
            } else {
                len = Math.max(len,temp_length);
                temp_length = 0;
            }
        }
        len = Math.max(len,temp_length);

        return len;

    }
}