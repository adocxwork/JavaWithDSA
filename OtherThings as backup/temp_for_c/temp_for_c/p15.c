// assignment
// (1) Check prime number
#include<stdio.h>
int main()
{
    int n, i=2, p=1;
    printf("Enter the number : ");
    scanf("%d", &n);

    while (i<=(n/2))
    {
        if(n%i==0)
        {
            printf("Not Prime");
            p=0;
            break;
        }
        i++;
    }

    if(p==1 && n!=1)
    printf("Prime");
    else if(n==1)
    printf("1 is neither prime nor composite.");
    
    return 0;
}