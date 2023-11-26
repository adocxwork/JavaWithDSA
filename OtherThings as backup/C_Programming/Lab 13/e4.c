#include<stdio.h>
#include<string.h>
int main()
{
    char str[] = "Engineering";
    printf("%s\n", str);
    int br=0;
    for(int i=0; i<strlen(str); i++)
    {
        for(int j=strlen(str)-1; j>=i+1; j--)
        {
            if(str[i]==str[j])
            {
                printf("First : %d\nLast : %d\n", i, j);
                br=1;
                break;
            }
        }
        if(br) break;
    }
    return 0;
}