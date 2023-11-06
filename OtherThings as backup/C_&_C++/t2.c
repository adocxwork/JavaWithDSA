// to find area and perimeter of triangle and rectangle

#include<stdio.h>
#include<math.h>
int main()
{
    float t1,t2,t3,tArea,tPerimeter,sPerimeter; //trianlge's variable
    float r1,r2,rP,rA;
    printf("Triangle :-\n");
    printf("Enter sides of triangle :-\n");
    scanf("%f", &t1);
    scanf("%f", &t2);
    scanf("%f", &t3);
    tPerimeter = t1+t2+t3;

    sPerimeter = tPerimeter/(float)2;
    tArea = sqrt(sPerimeter*(sPerimeter-t1)*(sPerimeter-t2)*(sPerimeter-t3));

    printf("The area of triangle is : %f\n", tArea);
    printf("The perimeter of triangle is : %f\n", tPerimeter);

    printf("\nRectangle :-\n");
    printf("Enter sides of rectangle :-\n");
    scanf("%f", &r1);
    scanf("%f", &r2);
    rP = 2*(r1+r2);
    rA = r1*r2;
    printf("The area of rectangle is : %f\n", rA);
    printf("The perimeter of rectangle is : %f\n", rP);
    return 0;
}