class a {
    public boolean isPalindrome(int x) {
        if(x<0)
        return false;
        int num=0, i, xx=x;
        while(xx>0)
        {
            i=xx%10;
            xx/=10;
            num=num*10 + i;
        }
        if(num==x)
        return true;
        return false;
    }
}