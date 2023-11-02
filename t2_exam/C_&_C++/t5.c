// to print multiplication table of a number without using loop
#include<stdio.h>
int main()
{
    int tableNumber;
    printf("Enter table number : ");
    scanf("%d", &tableNumber);

    printf("%d * 1 = %d\n",tableNumber, tableNumber*1);
    printf("%d * 2 = %d\n",tableNumber, tableNumber*2);
    printf("%d * 3 = %d\n",tableNumber, tableNumber*3);
    printf("%d * 4 = %d\n",tableNumber, tableNumber*4);
    printf("%d * 5 = %d\n",tableNumber, tableNumber*5);
    printf("%d * 6 = %d\n",tableNumber, tableNumber*6);
    printf("%d * 7 = %d\n",tableNumber, tableNumber*7);
    printf("%d * 8 = %d\n",tableNumber, tableNumber*8);
    printf("%d * 9 = %d\n",tableNumber, tableNumber*9);
    printf("%d * 10 = %d\n",tableNumber, tableNumber*10);
    return 0;
}