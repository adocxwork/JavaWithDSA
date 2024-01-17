#include<iostream>
using namespace std;
int stringCom(char *s1, char *s2)
{
    int i=0;
    for(int i=0; s1[i]!='\0' || s2[i]!='\0'; i++)
    {
        if(s1[i]!=s2[i])
        {
            return 0;
        }
    }
    return 1;
}
int main()
{
    char s1[] = "aditya";
    char s2[] = "aditya";
    cout<<stringCom(s1,s2);
    return 0;
}
