// read a character and determine whether it is a vowel or not
#include<stdio.h>
int main()
{
    char ch;
    printf("Enter a character : ");
    scanf("%c", &ch);

    if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
    {
        printf("It's a vowel.");
    }
    else
    {
        printf("It's not a vowel.");
    }
    return 0;
}