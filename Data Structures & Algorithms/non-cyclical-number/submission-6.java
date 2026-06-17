class Solution {
    public int sumOfSquares(int a){
        int sum = 0;
        while(a!=0){
            int r = a % 10;
            sum = sum + r*r;
            a = a/10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        int sum = sumOfSquares(n);
        while(true){
            if(sum == 1)
            return true;
            else
            {
                if(!set.add(sum))
                return false;
                sum = sumOfSquares(sum);
            }
        }
    }
}
