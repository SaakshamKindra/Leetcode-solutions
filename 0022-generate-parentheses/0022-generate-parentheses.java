class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> r=new ArrayList<>();
        f("",0,0,n,r);
        return r;
    }
    void f(String s,int o,int c, int n,List<String> r) {
        if(s.length()==2*n){r.add(s);return;}
        if(o<n) f(s+"(",o+1,c,n,r);
        if(c<o) f(s+")",o,c+1,n,r);
    }
}