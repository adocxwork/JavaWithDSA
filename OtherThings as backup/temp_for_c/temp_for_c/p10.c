// 7. Read a character and determine whether it is a vowel or not
#include<stdio.h>
int main()
{
    char a;
    printf("Enter the character : ");
    scanf("%c", &a);

    if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u')
    printf("It's a vowel.");
    else
    printf("It's not a vowel.");

    return 0;
}