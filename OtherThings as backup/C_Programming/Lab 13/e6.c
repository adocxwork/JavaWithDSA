// not done
#include<stdio.h>
int main()
{
    int n;
    printf("Enter the no of students : ");
    scanf("%d", &n);
    char name[n][100];
    printf("Enter the names of students :-\n");
    for(int i=0; i<n; i++)
    {
        scanf("%s", &name[i]);
    }

    for(int i=0; i<n; i++)
    {
        for(int j=0; j<n-i-1; j++)
        {
            if(name[j][0]>name[j+1][0])
            {
                char temp[] = name[j];
                name[j]=name[j+1];
                name[j+1] = temp;
            }
        }
    }

    for(int i=0; i<n; i++)
    {
        printf("%s\n", name[i]);
    }
    return 0;
}