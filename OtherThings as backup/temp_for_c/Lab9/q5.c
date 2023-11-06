#include<stdio.h>
#include<math.h>
int main()
{
    float iA=5, iV, iR, maxVerHeight, maxHorRange,tOFlight, g=9.8;
    printf("Enter the initial velocity : ");
    scanf("%f", &iV);
    printf("Angle   Height   MaxRange   TimeOfFlight\n");
    while (iA<=90)
    {
        iR = iA*(3.14159/180);
        maxVerHeight = ((iV*iV*sin(iR)*sin(iR))/(2*g));
        maxHorRange = ((iV*iV*sin(2*iR))/g);
        tOFlight = ((2*iV*sin(iR))/g);
        printf("%0.1f     %0.2f     %0.2f        %0.2f\n", iA, maxVerHeight, maxHorRange, tOFlight);
        iA += 5;
    }
    return 0;
}