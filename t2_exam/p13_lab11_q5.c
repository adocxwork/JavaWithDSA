#include<stdio.h>
int fibo(int n)
{
    if(n==0 || n==1) return n;
    return (fibo(n-1)+fibo(n-2));
}
void genFibo(int n)
{
    if(n==0)
    {
        printf("%d ", fibo(n));
        return;
    }
    genFibo(n-1);
    printf("%d ", fibo(n));
}
int sum(int n)
{
    int s=0;
    for(int i=0; i<=n; i++)
    s+=fibo(i);
    return s;
}
int main()
{
    genFibo(5);
    printf("\n%d", sum(5));
    return 0;
}