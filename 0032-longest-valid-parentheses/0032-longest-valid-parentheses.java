class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> st=new Stack<>();
        st.push(-1);
        int r=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(') st.push(i);
            else{
                st.pop();
                if(st.empty()) st.push(i);
                else r=Math.max(r,i-st.peek());
            }
        }
        return r;
        
    }
}