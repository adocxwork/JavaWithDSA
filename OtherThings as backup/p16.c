#include<stdio.h>
int place=1;
int deci2Octal(int a)
{
    int i, deciNum=0, p=1;
    while(a)
    {
        i=a%8;
        a/=8;
        deciNum+=(i*p);
        p*=10;
    }
    return deciNum;
}
int deci2OctalR(int a) //recurrsion
{
    int deciNum=0;
    if(a==0)
    return deciNum;
    else
    deciNum+=(a%8)*place;
    place*=10;
    return deciNum + deci2OctalR(a/8);
}
int main()
{
    int a;
    printf("Enter a number : ");
    scanf("%d", &a);
    printf("The Octal conversion is : %d", deci2OctalR(a));
    return 0;
}