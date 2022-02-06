package langJava.InterviewBit;

public class gcdWithoutRecursion {
    public int gcd(int A, int B) {
        int n =A>B?A:B;

        if(A==1 && B==0)
        {
            return A;
        }
        else{
            int i;
            int gcd=0;
            for(i=1;i<=n;i++)
            {
                int j;
                for(j=1;j<=n;j++)
                {
                    if(A%i==0 && B%j==0 && i==j)
                    {
                        gcd=i;
                    }
                }
            }
            return gcd;
        }
    }
}
