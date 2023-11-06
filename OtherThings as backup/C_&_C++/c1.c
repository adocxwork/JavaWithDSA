// lab 6

#include<stdio.h>
int main()
{
    int amountToBeWithdrawn;
    printf("Enter the amount to be withdrawn : ");
    scanf("%d", &amountToBeWithdrawn);

    int notes100=0;
    int notes50=0;
    int notes10=0;

    notes100=amountToBeWithdrawn/100;
    amountToBeWithdrawn=amountToBeWithdrawn%100;

    notes50=amountToBeWithdrawn/50;
    amountToBeWithdrawn=amountToBeWithdrawn%50;

    notes10=amountToBeWithdrawn/10;
    amountToBeWithdrawn=amountToBeWithdrawn%10;

    printf("\nNotes of 100 : %d", notes100);
    printf("\nNotes of 50 : %d", notes50);
    printf("\nNotes of 10 : %d", notes10);
    return 0;
}