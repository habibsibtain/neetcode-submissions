class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int k = 0;
        for(int num: nums){
            if(num == val) k++;
        }
        int left = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] == val){
                left = i+1;
                while(left < n && nums[left] == val){
                    left++;
                }
                if(left < n){
                    int temp = nums[i];
                    nums[i] = nums[left];
                    nums[left] = temp;

                }
            }
        }
        return n-k;
    }
}