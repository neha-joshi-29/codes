class Solution 3{
    public static void main(String[] args) {
        int []arr={4,0,2,1};
        System.out.println(missingNumber(arr));

    }
    public static int missingNumber(int[] nums) {
        int i=0;
        while(i<nums.length)
        {
            if(nums[i]<nums.length && nums[i]!=nums[nums[i]])
            swap(nums,i,nums[i]);
            else
            i++;
        }
        for(int index=0;index<nums.length;index++)
        {
            if(nums[index]!=index)
            {
                return index;
            }else 
            {
                return nums.length;
            }
        }
         return 0;
    }
  public static void swap(int[]nums,int first,int second)
  {
      int temp=nums[first];
      nums[first]=nums[second];
      nums[second]=temp;
  }
}