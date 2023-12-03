// WAP to compare to string
#include<stdio.h>
#include<string.h>
int strcompare(char s1[], char s2[])
{
    int i=0;
    for(i=0; s1[i]==s2[i]; i++)
    if(s1[i]=='\0') return 0;
    return s1[i]-s2[i];
}
int main()
{
    char s1[] = "hi";
    char s2[] = "hi";
    printf("%d", strcompare(s1, s2));
    return 0;
}