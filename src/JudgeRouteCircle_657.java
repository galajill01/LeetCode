class JudgeRouteCircle_657 {
    public boolean judgeCircle(String moves) {
        char []c = moves.toCharArray();
        int a=0; int b=0;
        for (int i=0; i<c.length; i++)
        {
            if(c[i]=='R')
                a++;
            else if(c[i]=='L')
                a--;
            else if(c[i]=='U')
                b++;
            else b--;
        }
        return (a==0) && (b==0);
    }
}