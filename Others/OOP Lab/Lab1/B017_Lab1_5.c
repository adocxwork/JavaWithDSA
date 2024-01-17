#include<stdio.h>
int fun(int i, int j)
{
    int t = j;
    while(i>j)
    {
        j+=t;
    }
    return j;
}
int main()
{
    int i, j;
    scanf("%d %d", &i, &j);
    printf("%d", fun(i, j));
    return 0;
}

