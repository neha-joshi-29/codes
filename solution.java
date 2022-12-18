class Solution 
{
    public int repeatedNTimes(int[] nums) 
    {
      
          for (int i = 0; i < nums.length - 1; ++ i) {
            if (nums[i] == nums[i + 1]) { // any two neighbour numbers 
                return nums[i];
            }            
        }
        // could be evenly distributed excluding the above case
        for (int i = 0; i < nums.length - 2; ++ i) {
            if (nums[i] == nums[nums.length - 1] || nums[i] == nums[nums.length - 2]) {
                return nums[i];
            }
        }
        throw null; // input array is not what has been described
    }
}

