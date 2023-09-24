// 8. Using conditional operators determine:
// (1) Whether the character entered through the keyboard is a lower-case alphabet or not.
// (2) Whether a character entered through the keyboard is a special symbol or not.
#include<stdio.h>
int main()
{
    char a;
    printf("Enter the character : ");
    scanf("%c", &a);
    int asciVal = a;
    (asciVal>=97 && asciVal<=122)? printf("It's a lower case character.") :
    printf("It's not a lower case character.");

    // digits (0-9): 48-57; 
    // capital letters (A-Z): 65-90; small letters (a-z): 97:122;
    // special characters: entire range excluding previous three).
    
    char b;
    printf("\nEnter the character : ");
    scanf(" %c", &b); //always add single space while receiving a char in scanf function
    int asciVal2 = b;
    ((asciVal2>=97 && asciVal2<=122) || (asciVal2>=65 && asciVal2<=90) || (asciVal2>=48 && asciVal2<=57))?
    printf("It's not a special symbol.") : printf("It's a special symbol.");

    return 0;
}