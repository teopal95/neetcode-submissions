class Solution {
     public boolean hasDuplicate(int[] nums)
    {
        java.util.Set<Integer> table = new java.util.HashSet<>();
        
        for (int i=0;i<nums.length;i=i+1)
        {
             if (table.contains(nums[i]))
             {
                return true;
             }
             else
             {
                table.add(nums[i]);
             }
        }

        return false;
    }
}
