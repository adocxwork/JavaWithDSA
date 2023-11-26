#include<stdio.h>
int main()
{
    int arr1[2][3] = {{1,2,3}, {4,5,6}};
    int arr2[2][3] = {{1,2,3}, {4,5,6}};
    int result[2][3];
    for(int i=0; i<2; i++)
    {
        for(int j=0; j<3; j++)
        {
            result[i][j] = arr1[i][j] + arr2[i][j];
        }
    }
    for(int i=0; i<2; i++)
    {
        printf("%p\n", &result[i]);
        for(int j=0; j<3; j++)
        {
            printf("%p : %d, ", &result[i][j], result[i][j]);
        }
        printf("\n");
    }
    return 0;
}