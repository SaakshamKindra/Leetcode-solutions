import java.util.*;

class Solution {
    public List<List<Integer>> fourSum(int[] a, int t) {
        List<List<Integer>> r=new ArrayList<>();
        Arrays.sort(a);
        for(int i=0;i<a.length-3;i++){
            if(i>0&&a[i]==a[i-1])continue;
            for(int j=i+1;j<a.length-2;j++){
                if(j>i+1&&a[j]==a[j-1])continue;
                int l=j+1,h=a.length-1;
                while(l<h){
                    long s=(long)a[i]+a[j]+a[l]+a[h];
                    if(s==t){
                        r.add(Arrays.asList(a[i],a[j],a[l],a[h]));
                        while(l<h&&a[l]==a[l+1])l++;
                        while(l<h&&a[h]==a[h-1])h--;
                        l++;h--;
                    }else if(s<t)l++;
                    else h--;
                }
            }
        }
        return r;
    }
}