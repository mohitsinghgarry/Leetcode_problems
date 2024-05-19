class Solution {
    public int reverse(int x) {
        long sum =0;
        if(x>0)
        {
            while(x>0)
            {
                int rem = x%10;
                sum=sum*10+rem;
                x/=10;
            }
            if(sum>2147483647)
            return 0;
            else
            return (int)(sum);
        }
        else
        {
            x=-x;
            while(x>0)
            {
                int rem = x%10;
                sum=sum*10+rem;
                x/=10;
            }
            sum =-sum;
            if(sum<-2147483648)
            return 0;
            else
            return (int)(sum);

        }
    
    }
}