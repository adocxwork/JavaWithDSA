#include<stdio.h>
#include<string.h>
int main()
{
    char str1[] = "Hello";
    char str2[] = "ThisIsAditya";
    char str3[strlen(str1) + strlen(str2)];
    char *p1 = str1;
    char *p2 = str2;
    char *p3 = str3;
    // printf("%s\n", str3);
    for(int i=0; i<strlen(str1); i++)
    {
        *(p3+i) = *(p1+i);
    }
    for(int i=strlen(str1); i<strlen(str1)+strlen(str2); i++)
    {
        *(p3+i) = *(p2+i-strlen(str1));
    }
    printf("%s\n", str3);
    return 0;
}
/*
#include <stdio.h>
    #include <string.h>
    int main()
    {
        char str1[1000];
        char str2[1000];
        printf("enter first string: ");
        scanf("%s",str1);
        printf("enter second string: ");
        scanf("%s",str2);
        char concat_str[strlen(str1)+strlen(str2)];

        char *ptr1 = str1;
        char *ptr2 = str2;
        char *ptr3 = concat_str;
        int i=0,j =0;
        while(*(ptr1 + i) != '\0')
        {
            *(ptr3+i) = *(ptr1+i);
            i++;
        }
        *(ptr3+i)=' ';
        i++; 
        while(*(ptr2+j)!='\0')
        {
            *(ptr3+i) = *(ptr2+j);
            i++;
            j++;
        }
        *(ptr3+i) = '\0';

        printf("%s",ptr3);
    }
*/