// 2D array, input and output

#include<stdio.h>
int main()
{
    int arr[5][3]={
        {1,4,6},
        {3,5,7},
        {8,9,10},
        {11,12,13},
        {1,8,7}
    };
    // int arr[5][3];
    // printf("Enter values for array :-\n");
    // for(int i=0; i<5; i++)
    // {
    //     for(int j=0; j<3; j++)
    //     {
    //         scanf("%d", &arr[i][j]);
    //     }
    // }
    printf("Array Entered :-\n");
    for(int i=0; i<5; i++)
    {
        for(int j=0; j<3; j++)
        {
            printf("%d ", arr[i][j]);
        }
        printf("\n");
    }
    return 0;
}