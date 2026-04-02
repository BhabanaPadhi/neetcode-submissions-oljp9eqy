class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> hashmap = new HashMap<>();
        for(int num : nums){
            hashmap.put(num,hashmap.getOrDefault(num,0)+1);
            if(hashmap.get(num) > 1){
                return true;
            }
        }
        return false;
    }
}