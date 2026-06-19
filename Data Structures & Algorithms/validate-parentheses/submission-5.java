class Solution {
    public boolean isValid(String s) {
        if(s.length()==1)
        return false;
        Stack<Character> stack = new Stack<>();
        for(int i=0; i < s.length(); i++)
        {
            char ch  = s.charAt(i);
            if(ch=='('||ch=='{'||ch=='[')
            stack.push(ch);
            if(ch==')')
            {
                if(stack.empty())
                return false;
                char c = stack.pop();
                if(c!='(')
                return false;
            }
            if(ch=='}')
            {
                if(stack.empty())
                return false;
                char c = stack.pop();
                if(c!='{')
                return false;
            }
            if(ch==']')
            {
                if(stack.empty())
                return false;
                char c = stack.pop();
                if(c!='[')
                return false;
            }
        }
        if(stack.empty())
        return true;
        else return false;
    }
}
