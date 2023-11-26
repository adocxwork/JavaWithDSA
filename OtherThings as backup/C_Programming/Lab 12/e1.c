#include<stdio.h>
int main()
{
    int arr1[] = {4,9,8,0,1,3,7};
    int n, in;
    printf("Enter the number : ");
    scanf("%d", &n);
    for(int i=0; i<7; i++)
    {
        printf("%d ", arr1[i]);
        if(arr1[i]==n)
            in = i;
    }
    printf("\n");
    arr1[in] = (arr1[in-1] + arr1[in+1])/2;
    for(int i=0; i<7; i++)
        printf("%d ", arr1[i]);
    return 0;
}