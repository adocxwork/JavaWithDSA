#include <stdio.h>
#include <string.h>
int main()
{
    char string[1000];
    printf("Enter the input: ");
    fgets(string, sizeof(string), stdin);

    int new[strlen(string)];
    int n = strlen(string);
    for(int i=0;string[i]!='\0';i++)
    {
         int count = 1;
        for(int j=i+1;string[j]!='\0';j++)
        {
            if(string[i] == string[j])
            count++;
        }

        new[i] = count;
    }

    for(int i=0;i<n;i++)
    {
        printf("%d ",new[i]);
    }
    printf("\n");

    int max=new[0];
    int min=new[0];
    char pos1=string[0],pos2=string[0];
    for(int i=1;i<string[i]!='\0';i++)
    {
        if(max<new[i])
        {
            max = new[i];
            pos1 = string[i];
        }

        if(min>new[i])
        {
            min = new[i];
            pos2 = string[i];
        }
    }

    printf("highest frequency %c frequency is %d\n",pos1,max);
    printf("loweset frequency %c frequency is %d\n",pos2,min );
    return 0;
}