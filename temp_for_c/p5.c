// 2 To find Area & Perimeter of Triangle and Rectangle.
#include<stdio.h>
#include<math.h>
int main()
{
    // Rectangle
    float l,b;
    printf("Enter length and breadth of rectangle :-\n");
    scanf("%f %f", &l, &b);
    printf("The area of rectangle is (unit square): %f\n", (l*b));
    printf("The perimeter of rectangle is (unit): %f\n", (2*(l+b)));

    // Triangle
    float s1, s2, s3;
    printf("Enter the sides of triangle :-\n");
    scanf("%f %f %f", &s1, &s2, &s3);
    float semiPeri = (s1+s2+s3)/2;
    float tArea = sqrt(semiPeri*(semiPeri-s1)*(semiPeri-s2)*(semiPeri-s3));
    printf("The area of triangle is (unit square): %f\n", (tArea));
    printf("The perimeter of triangle is (unit): %f\n", (s1+s2+s3));
    return 0;
}