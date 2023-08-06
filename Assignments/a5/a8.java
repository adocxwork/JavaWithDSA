// Write a program to print a triangle of prime numbers upto given number of lines of the trinagle.
public class a8 {
    static int primeNum(int indexNo)
    {
        int tempIndex = indexNo;
        boolean isPrime = false;
        int x=2;
        while(tempIndex>0)
        {
            for(int i=2; i<=x; i++)
            {
                if(x%i==0 && i!=x)
                {
                    isPrime=false;
                    x++;
                    break;
                }
                else
                {
                    isPrime=true;
                }
            }
            if(isPrime==true)
            {
                tempIndex--;
                isPrime=false;
                x++;
            }
        }
        return (--x);
    }
    public static void main(String[] args) {
        int n=4;
        int tempK=1;
        for(int i=1; i<=n; i++)
        {
            // spaces
            for(int j=1; j<=n-i; j++)
            {
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++)
            {
                System.out.print(primeNum(tempK) + " ");
                tempK++;
            }
            
            System.out.println();
        }
    }
}