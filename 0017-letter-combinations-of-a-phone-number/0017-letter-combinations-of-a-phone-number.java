class Solution {
    public List<String> letterCombinations(String d) {
        if (d.length() == 0) return new ArrayList<>();
        String[] m = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> r = new ArrayList<>();
        f(d, 0, "", r, m);
        return r;
    }

    void f(String d, int i, String s, List<String> r, String[] m) {
        if (i == d.length()) {
            r.add(s);
            return;

        }
        for(char c : m[d.charAt(i) - '0'].toCharArray())
        f(d, i + 1,s + c, r, m);
    }
}