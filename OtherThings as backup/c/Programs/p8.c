#include<stdio.h>
int main()
{
    int A[3][3] = {
        {1,2,3},
        {4,5,6},
        {7,8,9}
    };
    int B[3][3] = {
        {1,2,3},
        {4,5,6},
        {7,8,9}
    };
    int C[3][3];
    for(int i=0; i<3; i++)
    {
        for(int j=0; j<3; j++)
        {
            C[i][j] = A[i][j] + B[i][j];
        }
    }
    
    // printing C
    for(int i=0; i<3; i++)
    {
        for(int j=0; j<3; j++)
        {
            printf("%d ", C[i][j]);
        }
        printf("\n");
    }
    return 0;
}