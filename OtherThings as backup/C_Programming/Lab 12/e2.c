#include<stdio.h>
int main()
{
    int n, eP=0, oP=0;
    printf("Enter Array's length : ");
    scanf("%d", &n);
    int arr[n];
    int Even[n];
    int Odd[n];
    printf("Enter the elements :-\n");
    for(int i=0; i<n; i++)
    {
        scanf("%d", &arr[i]);
        Even[i] = Odd[i] = 0;
    }
    for(int i=0; i<n; i++)
    {
        if(arr[i]%2==0)
        Even[eP++] = arr[i];
        else
        Odd[oP++] = arr[i];
    }
    for(int i=0; i<n; i++)
    printf("%d ", Even[i]);
    printf("\n");
    for(int i=0; i<n; i++)
    printf("%d ", Odd[i]);
    return 0;
}