class Solution1 {
    public int reverse(int x) 
    {
        int rev=0;
        while(x!=0)
        {
            rev=rev*10+x%10;
            x=x/10;
        }
        if(x<Math.pow(-2,31))
    }
}