class Solution{
    public int[] twoSum(int[] nums,int target){
        int[] res={-1,-1};
        int n = nums.length;
        for(int i = 0; i<n; i++){
            for(int j = i+1 ;j<n ; j++){
                if(nums[i] + nums [j] == target){
                    res[0]=i;
                    res[1]=j;
                }
            }
        }
        return res;
    }}
