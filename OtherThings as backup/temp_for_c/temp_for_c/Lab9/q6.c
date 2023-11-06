#include<stdio.h>
int main()
{
    char name[20];
    int N, enroll, s1, s2, s3, avg;
    printf("Enter the number of students : ");
    scanf("%d", &N);
    while (N)
    {
        printf("\nEnter Name : ");
        scanf("%s", &name);
        printf("Enter the Enroll No. : ");
        scanf("%d", &enroll);
        printf("Enter the marks of three subjects :-\n");
        scanf("%d %d %d", &s1, &s2, &s3);
        avg = (s1+s2+s3)/3;
        if(s1>=35 && s2>=35 && s3>=35 && avg>=40)
        {
            printf("\nName EnrollNo. S1 S2 S3 Avg Result\n");
            printf("%s %d     %d %d %d %d Pass\n", name, enroll, s1, s2, s3, avg);
        }
        else
        {
            printf("\nName EnrollNo. S1 S2 S3 Avg Result\n");
            printf("%s %d     %d %d %d %d Fail\n", name, enroll, s1, s2, s3, avg);
        }
        N--;
    }
    return 0;
}