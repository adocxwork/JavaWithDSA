#include<stdio.h>
int fibo(int n)
{
    if(n==0 || n==1) return n;
    return fibo(n-1) + fibo(n-2);
}
int main()
{
    for(int i=0; i<10; i++)
    {
        printf("%d ", fibo(i));
    }
    printf("\n");
    return 0;
}