#include<stdio.h>
#include<string.h>
int main()
{
    char str[] = "manohar";
    char *p = str;
    char v = *(p+strlen(str)-2);
    if(v=='a' || v=='e' || v=='i' || v=='o' || v=='u')
    printf("Vowel");
    else
    printf("Consonant");
    return 0;
}