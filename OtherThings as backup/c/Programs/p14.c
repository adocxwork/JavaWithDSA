// Palindrome
#include<stdio.h>
#include<string.h>
int main()
{
    char s[] = "abcba";
    int i=0, j=strlen(s)-1, c=1;
    while(i<j)
    {
        if(s[i++]!=s[j--])
        {
            printf("Not palindrome..");
            c=0;
            break;
        }
    }
    if(c) printf("It's a palindrome..");
    return 0;
}