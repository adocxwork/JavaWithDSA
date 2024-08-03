#include<iostream>
using namespace std;
int isPrime(int x)
{
    for(int i=2; i<=(x/2); i++)
    {
        if(x%i==0) return 0;
    }
    return 1;
}
int maxPrime(int a, int b)
{
    for(int i=b; i>=a; i--)
    {
        if(isPrime(i)) return i;
    }
    return -1;
}
int main()
{
    int st, end;
    cout<<"Enter start and end points for prime numbers :-"<<endl;
    cin>>st>>end;
    int maxP = maxPrime(st, end), t=maxP;
    int f[10] = {0};
    while(maxP)
    {
        int i = maxP%10;
        f[i]++;
        maxP/=10;
    }
    for(int i=9; i>=0; i--)
    {
        if(f[i]>0)
        {
            cout<<"The digit with maximum frequency for prime number "<<t<<" is "<<i<<endl;
            break;
        }
    }
    return 0;
}
