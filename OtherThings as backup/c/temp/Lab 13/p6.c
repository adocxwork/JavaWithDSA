#include<stdio.h>
#include<string.h>
void dis(char arr[][1000], int n)
{
    for(int i=0; i<n; i++)
    {
        printf("%s\n", arr[i]);
    }
    printf("\n");
}
int main()
{
    int n;
    printf("Enter the number of students : ");
    scanf("%d", &n);
    char str[n][1000];
    for(int i=0; i<n; i++)
    {
        scanf("%s", &str[i]);
    }
    printf("\n");
    dis(str, n);
    char order;
    printf("Enter the order : ");
    scanf("%c ", &order);
    if(order=='a' || 'A')
    {
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n-i-1; j++)
            {
                if(str[j][0]>str[j+1][0])
                {
                    char temp[1000];
                    strcpy(temp, str[j]);
                    strcpy(str[j], str[j+1]);
                    strcpy(str[j+1], temp);
                }
            }
        }
    }
    else
    {
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n-i-1; j++)
            {
                if(str[j][0]<str[j+1][0])
                {
                    char temp[1000];
                    strcpy(temp, str[j]);
                    strcpy(str[j], str[j+1]);
                    strcpy(str[j+1], temp);
                }
            }
        }
    }
    dis(str, n);
    return 0;
}