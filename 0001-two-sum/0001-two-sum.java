class Solution {
    int sum = 0;

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numberMap = new HashMap<>(); 
        for (int i = 0; i<nums.length; i++){
            int remaining = target - nums[i];
            if (numberMap.containsKey(remaining)) {
                return new int[]{numberMap.get(remaining), i};
            }    
            numberMap.put(nums[i],i);
        }
        return new int[]{};
    }
}