// transpose of matrix
#include<stdio.h>
void swap(int *p1, int *p2)
{
    int t = *p1;
    *p1 = *p2;
    *p2 = t;
}
int main()
{
    int arr1[3][3] = {
        {1,2,3},
        {4,5,6},
        {7,8,9}
    };
    for(int i=0; i<3; i++)
    {
        for(int j=i+1; j<3; j++)
        {
            swap(&arr1[i][j], &arr1[j][i]);
        }
    }
    for(int i=0; i<3; i++)
    {
        for(int j=0; j<3; j++)
        {
            printf("%d ", arr1[i][j]);
        }
        printf("\n");
    }
    return 0;
}