class Solution {
    public void solveSudoku(char[][] b) {
        f(b,0);
    }

    boolean f(char[][] b,int p) {
        if(p==81)return true;
        int i=p/9,j=p%9;
        if(b[i][j]!='.')return f(b,p+1);

        for(char c='1';c<='9';c++){
            if(ok(b,i,j,c)){
                b[i][j]=c;
                if(f(b,p+1))return true;
                b[i][j]='.';
            }
        }
        return false;
    }

    boolean ok(char[][] b,int r,int c,char x) {
        for(int i=0;i<9;i++)
            if(b[r][i]==x||b[i][c]==x||b[r/3*3+i/3][c/3*3+i%3]==x)
                return false;
        return true;
    }
}