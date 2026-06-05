class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length-1;
        while(start<=end){
            if(numbers[start]+numbers[end]<target)
            start++;
            else if(numbers[start]+numbers[end]>target)
            end--;
            else break;
        }
        int sum[] = {start+1,end+1};
        return sum;
    }
}
