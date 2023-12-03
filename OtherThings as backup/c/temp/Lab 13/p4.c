#include<stdio.h>
#include<string.h>
int main()
{
    char a, str[1000];
    printf("Enter string : ");
    scanf("%s", &str);
    printf("Enter a character : ");
    scanf(" %c", &a);
    int i=0, j = strlen(str)-1;
    while(1)
    {
        if(str[i] == a && str[j] == a) break;
        else if(str[i]!=a && str[j]!=a)
        {
            i++;
            j--;
        }
        else if(str[i]!=a && str[j]==a)
            i++;
        else if(str[i]==a && str[j]!=a)
            j--;
    }
    printf("First Index : %d\n", i);
    printf("Last Index : %d\n", j);
    return 0;
}