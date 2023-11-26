#include<stdio.h>
int main()
{
    int n, rc=0, jj=0;
    printf("Enter the value of n : ");
    scanf("%d", &n);
    int ii=n-1;
    int m1[n][n], m2[n][n];
    printf("Enter the elements :-\n");
    for(int i=0; i<n; i++)
    {
        for(int j=0; j<n; j++)
        {
            m2[i][j]=0;
            scanf("%d", &m1[i][j]);
        }
    }

    for(int i=0; i<n; i++)
    {
        rc=0;
        for(int j=0; j<n; j++)
        {
            rc+=m1[i][j];
        }
        m2[i][jj++] = rc;
    }
    
    for(int j=0; j<n; j++)
    {
        rc=0;
        for(int i=0; i<n; i++)
        {
            rc+=m1[i][j];
        }
        m2[j][ii--] = rc;
    }

    printf("\n");
    for(int i=0; i<n; i++)
    {
        for(int j=0; j<n; j++)
        {
            printf("%d ", m2[i][j]);
        }
        printf("\n");
    }

    return 0;
}