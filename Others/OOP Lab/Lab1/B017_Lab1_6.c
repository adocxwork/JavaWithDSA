#include<stdio.h>
#include<math.h>
int perfectSquare(int n)
{
    int arr[4], s=0;
    for(int i=3; i>=0; i--)
    {
        int d = n%10;
        n/=10;
        arr[i]=d;
    }
    if(arr[0]!=arr[1] || arr[2]!=arr[3]) return 0;
    n = arr[0]*1000 + arr[1]*100 + arr[2]*10 + arr[3];
    s = sqrt(n);
    if(s*s==n) return 1;
    else return 0;
}
int main()
{
    int i=7744;
    printf("%d", perfectSquare(i));
    return 0;
}

