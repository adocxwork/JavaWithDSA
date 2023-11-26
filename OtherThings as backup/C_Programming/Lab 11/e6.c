#include<stdio.h>
int isPrime(int n)
{
    if(n==1 || n==0) return 0;
    for(int i=2; i<=(n/2); i++)
    {
        if(n%i==0) return 0;
    }
    return 1;
}
int main()
{
    int n, count=0;
    printf("Enter number : ");
    scanf("%d", &n);
    int i=n;
    while(count!=n)
    {
        if(isPrime(i))
        {
            printf("%d ", i);
            count++;
        }
        i++;
    }
    return 0;
}