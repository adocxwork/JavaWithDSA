#include<stdio.h>
int c=0;
int fun(int a)
{
    if(a==0)
    return c;
    else
    {
        c++;
        return fun(a/10);
    }
}
int main()
{
    printf("%d", fun(5894));
    return 0;
}