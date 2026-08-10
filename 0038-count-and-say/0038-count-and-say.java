class Solution {
    public String countAndSay(int n) {
        String s="1";
        while(--n>0){
            StringBuilder b=new StringBuilder();
            for(int i=0;i<s.length();){
                int j=i;
                while(j<s.length()&&s.charAt(j)==s.charAt(i))j++;
                b.append(j-i).append(s.charAt(i));
                i=j;
            }
            s=b.toString();
        }
        return s;
    }
}