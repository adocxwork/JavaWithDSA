#include<stdio.h>
#include<string.h>
int strendd(char s, char t, int ss, int tt)
{
    ss--;
    for(int i=tt-1; i>=0; i--)
    {
        if((s+(ss--)!=(t-i))) return 0;
    }
    return 1;
}
int main()
{
    char a[100] = "Aditya";
    char b[100] = "tya";
    int aLen = strlen(a);
    int bLen = strlen(b);
    printf("%d", strendd(a, b, aLen, bLen));
    return 0;
}
