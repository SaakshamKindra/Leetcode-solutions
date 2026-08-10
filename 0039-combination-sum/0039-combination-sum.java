import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum(int[] a, int t) {
        List<List<Integer>> r=new ArrayList<>();
        Arrays.sort(a);
        f(a,t,0,new ArrayList<>(),r);
        return r;
    }

    void f(int[] a,int t,int i,List<Integer> l,List<List<Integer>> r) {
        if(t==0){r.add(new ArrayList<>(l));return;}
        for(;i<a.length&&a[i]<=t;i++){
            l.add(a[i]);
            f(a,t-a[i],i,l,r);
            l.remove(l.size()-1);
        }
    }
}