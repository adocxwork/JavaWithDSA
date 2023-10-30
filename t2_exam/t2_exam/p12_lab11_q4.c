// // don't copy this code
// #include<stdio.h>
// int place=1;
// int baseChange(int n, int b)
// {
//     int deciNum=0;
//     if(n==0)
//     return deciNum;
//     else
//     deciNum+=(n%b)*place;
//     place*=10;
//     return deciNum + baseChange(n/b, b);

// }
// int main()
// {
//     int n, b;
//     printf("Enter number & it's conversion base :-\n");
//     scanf("%d %d", &n, &b);
//     printf("The converted value is : %d", baseChange(n, b));
//     return 0;
// }