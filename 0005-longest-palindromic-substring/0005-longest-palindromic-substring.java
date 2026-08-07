class Solution {
    int st=0,len=0;

    public String longestPalindrome(String s) {
        for(int i=0;i<s.length();i++){
            f(s,i,i);
            f(s,i,i+1);
        }
        return s.substring(st,st+len);
    }

    void f(String s,int l,int r){
        while(l>=0&&r<s.length()&&s.charAt(l)==s.charAt(r)){
            l--;
            r++;
        }
        if(r-l>len){
            len=r-l-1;
            st=l+1;
        }
    }
}