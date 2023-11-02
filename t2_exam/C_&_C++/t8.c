
#include<stdio.h>
int main()
{
    char ch2,ch;
    printf("Enter a character for lowercase check : ");
    scanf("%c", &ch2);
    (ch2>='a' && ch2<='z')?
    printf("This is a lowercase character.\n"):
    printf("This is not a lowercase character.\n") ;

    printf("\nEnter a character for special symbol check : ");
    scanf(" %c", &ch); //always mention space b/w format specifier
    ((ch >= 0  && ch <= 47) ||  
    (ch >= 58 && ch <= 64) ||  
    (ch >= 91 && ch <= 96) ||  
    (ch >= 123) ) ?  
    printf("Character Entered Is a Special Symbol\n") :  
    printf("Character Entered Is not a Special Symbol\n");
    return 0;
}