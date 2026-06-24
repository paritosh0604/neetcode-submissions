class KthLargest {
    PriorityQueue<Integer> minHeap;

    public KthLargest(int k, int[] nums) {
        Arrays.sort(nums);
        this.minHeap = new PriorityQueue<>();
        if(nums.length==0){
            for(int i = 1; i <= k; i++){
                minHeap.add(-1000);
            }
        }
        if(k > nums.length && nums.length>0){
            for(int i = 1; i <= k; i++){
                if(i != k)
                minHeap.add(nums[i-1]);
                else
                minHeap.add(-1000);
            }
        }
        if(nums.length >= k){
            int a = nums.length-1;
            for(int i = 1; i <= k; i++){
            minHeap.add(nums[a]);
            a--;
        }
        }
        System.out.println(minHeap);
    }
    
    public int add(int val) {
        if(minHeap.peek()<val){
        minHeap.poll();
        minHeap.add(val);
        }
        System.out.println(minHeap);
        return minHeap.peek();
    }
}
