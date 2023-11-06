#include<stdio.h>
float fact(float n)
{
    float fa=1;
    for(float i=1; i<=n; i++)
        fa = fa*i;
    return fa;
}
float powerOf(float a, float b)
{
    if(b==0)
    return 1;
    return a*powerOf(a, b-1);
}
float sinn(float x, float n)
{
    float sum=0, k=1;
    for(float i=1; i<=2*n-1; i=i+2)
    {
        if(k==1)
        {
            sum+=(powerOf(x,i))/(fact(i));
            k=0;
        }
        else
        {
            sum-=(powerOf(x,i))/(fact(i));
            k=1;
        }
    }
    return sum;
}
float main()
{
    float x, n;
    printf("Enter the value of x & n :-\n");
    scanf("%f %f", &x, &n);

    printf("The value of series is %f", sinn(x, n));
    return 0;
}