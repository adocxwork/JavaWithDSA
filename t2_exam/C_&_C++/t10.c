#include<stdio.h>
int main()
{
    float HRA, DA, grossSalary;

    float salary;
    printf("Enter salary : ");
    scanf("%f", &salary);

    if(salary<2500)
    {
        HRA=30;
        DA=40;
        grossSalary = salary + (0.3*salary) + (0.4*salary);
    }
    else if(salary>=3000)
    {
        HRA=5000;
        DA=54;
        grossSalary = salary + (HRA) + (0.54*salary);
    }
    printf("The Gross Salary is : %f", grossSalary);
    return 0;
}