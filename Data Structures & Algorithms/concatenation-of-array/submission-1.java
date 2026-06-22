class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int length = 2 * nums.length;
        int[] ans = new int[length];

        for (int i=0;i<nums.length;i++)
        {
            ans[i] = nums[i];
            
        }
        for (int j=0;j<nums.length;j++)
        {
            ans[nums.length + j] = nums[j];

        }
        return ans;
    }
}