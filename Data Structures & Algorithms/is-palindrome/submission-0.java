class Solution {
    public boolean isPalindrome(String s) {
        String str = new String();
        s = s.toLowerCase();
        for(int i=0; i<s.length(); i++)
        {
            int c = s.charAt(i);
            if((c>=65&&c<=90)||(c>=97&&c<=122)||(c>=48&&c<=57))
            {
                char ch = s.charAt(i);
                str=str+ch;
            }
        }
        int start = 0, end = str.length()-1;
        while(start<=end){
            char ch1 = str.charAt(start);
            char ch2 = str.charAt(end);
            if(ch1==ch2)
            {
                start++;
                end--;
            }
            else 
            return false;
        }
        return true;
    }
}
