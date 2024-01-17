#include<iostream>
using namespace std;
void matAdd(int arr1[][3], int arr2[][3], int row, int col)
{
    for(int i=0; i<row; i++)
    {
        for(int j=0; j<col; j++)
        {
            arr1[i][j] = arr1[i][j] + arr2[i][j];
        }
    }
}
int main()
{
    int arr1[3][3] = {
        {1,2,3},
        {1,2,3},
        {1,2,3}
    };
    int arr2[3][3] = {
        {1,2,3},
        {1,2,3},
        {1,2,3}
    };
    matAdd(arr1, arr2, 3, 3);

    //printing of array
    for(int i=0; i<3; i++)
    {
        for(int j=0; j<3; j++)
        {
            cout<<arr1[i][j]<<" ";
        }
        cout<<"\n";
    }
    return 0;
}
