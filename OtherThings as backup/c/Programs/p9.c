// WAP to check given word is present in string or not
#include<stdio.h>
#include<string.h>
int main()
{
    char w[] = "Adi"; //word
    char str[] = "HelloThisIsAditya";
    int check=0;

    for(int i=0; i<strlen(str); i++)
    {
        if(w[0]==str[i])
        {
            for(int j=0; w[j]==str[j+i]; j++)
            {
                if(w[j]==w[strlen(w)-1])
                {
                    check=1;
                    break;
                }
            }
        }
    }

    if(check) printf("Yes, its present");
    else printf("No...");
    return 0;
}