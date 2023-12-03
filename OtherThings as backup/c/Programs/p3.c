#include <stdio.h>
int gcd(int a, int b)
{
    if(b==0) return a;
    return gcd(b, a%b);
}
int gcd2(int a, int b)
{
    
}
int main()
{
    printf("%d", gcd(18,42));
    return 0;
}