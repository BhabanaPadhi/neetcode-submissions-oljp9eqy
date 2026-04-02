class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer,Integer> hashmap = new HashMap<>();

// [4,5,6]
        for(int i=0; i<nums.length;i++){
            int diff = target - nums[i]; // 4 -> 10-4 = 6
            if(hashmap.containsKey(diff)) {
                return new int[]{hashmap.get(diff), i};  // Different indices!
            }
            hashmap.put(nums[i], i);  
        }

        return new int[]{};

    }
}
