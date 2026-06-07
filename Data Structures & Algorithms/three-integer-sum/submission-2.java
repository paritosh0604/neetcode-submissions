class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int mid=1; mid<=nums.length-2; mid++)
        {
            int start = 0;
            int end = nums.length-1;
            while(start<mid&&mid<end)
            {
                if(nums[start]+nums[mid]+nums[end]<0)
                start++;
                else if(nums[start]+nums[mid]+nums[end]>0)
                end--;
                else{
                    List<Integer> innerList = new ArrayList<>(List.of(nums[start],nums[mid],nums[end]));
                    if(!res.contains(innerList))
                        res.add(innerList);
                    start++;
                    end--;
                }
            }
        }
        
        return res;
    }
}