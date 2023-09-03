import java.util.Scanner;

public class p3_MatricesAddition {
    static void print2DArray(int arr[][])
    {
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[i].length; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void addTwoMatrices(int m1[][], int r1, int c1, int m2[][], int r2, int c2)
    {
        if(r1==r2 && c1==c2)
        {
            int ans[][] = new int[r1][c1];
            for(int i=0; i<m1.length; i++)
            {
                for(int j=0; j<m1[i].length; j++)
                {
                    ans[i][j] = m1[i][j] + m2[i][j];
                }
            }
            print2DArray(ans);
        }
        else
        {
            System.out.println("Addition is not possible.., Matrice's dimensions are not equal..");
        }
    }
    static int[][] TakingInputs(int r, int c)
    {
        int arr[][] = new int[r][c];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<r; i++)
        {
            System.out.println("Enter the value for row " + i);
            for(int j=0; j<c; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        // sc.close();
        return arr;
    }
    public static void main(String[] args) {
        Scanner scc = new Scanner(System.in);

        System.out.println("Enter no of row for matrix 1 :-");
        int r1 = scc.nextInt();
        System.out.println("Enter not of column for matrix 1 :-");
        int c1 = scc.nextInt();
        int m1[][] = TakingInputs(r1,c1);
        
        System.out.println("Enter no of row for matrix 2 :-");
        int r2 = scc.nextInt();
        System.out.println("Enter not of column for matrix 2 :-");
        int c2 = scc.nextInt();
        int m2[][] = TakingInputs(r2,c2);

        
        System.out.println("Matrix 1");
        print2DArray(m1);
        System.out.println("Matrix 2");
        print2DArray(m2);
        System.out.println();

        addTwoMatrices(m1, r1, c1, m2, r2, c2);
    }
}
