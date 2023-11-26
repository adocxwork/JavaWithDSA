#include<stdio.h>
float powerOf(float x, float y)
{
    if(y==0) return 1;
    return x * powerOf(x, y-1);
}
float fact(float n)
{
    float fact=1;
    for(float i=1; i<=n; i++)
    fact*=i;
    return fact;
}
float fun(float x, float n)
{
    float sum=0, sign=1;
    for(int i=1; i<=(2*n-1); i+=2)
    {
        if(sign==1)
        {
            sum+=powerOf(x,i)/fact(i);
            sign=0;
        }
        else
        {
            sum-=powerOf(x,i)/fact(i);
            sign=1;
        }
    }
    return sum;
}
int main()
{
    printf("%f", fun(2,3));
    return 0;
}