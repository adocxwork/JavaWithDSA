#include<stdio.h>
#include<string.h>
int main()
{
    char str[] = "HelloThisIsAditya";
    printf("%s\n", str);
    int n = strlen(str);
    for(int i=0; i<n; i++)
    {
        for(int j=0; j<n-i-1; j++)
        {
            if(str[j]>str[j+1])
            {
                char c = str[j];
                str[j] = str[j+1];
                str[j+1] = c;
            }
        }
    }
    printf("%s\n", str);
    return 0;
}