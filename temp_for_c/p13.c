// 10. In a company an employee is paid as under:
// If his basic salary is less than Rs. 2500, then HRA = 30% of basic salary and DA = 40%
// of basic salary. If his salary is either equal to or above Rs. 3000, then HRA = Rs. 5000
// and DA = 54% of basic salary. If the employee's salary is input through the keyboard write
// a program to find his gross salary.
#include<stdio.h>
int main()
{
    float a, grossSal, hra, da;
    printf("Enter salary : ");
    scanf("%f", &a);

    if(a<2500)
    hra = 0.3*a, da=0.4*a;
    else if(a>=3000)
    hra = 5000, da=0.54*a;
    
    grossSal = a + hra + da;
    printf("Gross Salary : %f", grossSal);
    return 0;
}