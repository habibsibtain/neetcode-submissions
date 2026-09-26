class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        int n = nums.length/2;
        for(var it: map.entrySet()){
            if(it.getValue() > n) return it.getKey();
        }
        return -1;
    }
}