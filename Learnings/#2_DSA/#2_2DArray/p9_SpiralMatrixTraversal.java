import java.util.Scanner;

public class p9_SpiralMatrixTraversal {
    static void display2DArray(int arr[][])
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
    static void display1DArray(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    static int[][] make2DArray()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows :-");
        int row = sc.nextInt();
        System.out.println("Enter the no of columns :-");
        int col = sc.nextInt();
        int ans[][] = new int[row][col];
        for(int i=0; i<row; i++)
        {
            System.out.println("Enter the value for row " + i);
            for(int j=0; j<col; j++)
            {
                ans[i][j] = sc.nextInt();
            }
        }
        return ans;
    }


    static int[] spiralMatrixTraversal(int arr[][])
    {
        int row = arr.length, col = arr[0].length, totalElementsTraversed = 0, ansPointer=0;
        int ans[] = new int[(row*col)];
        int topRow=0, bottomRow=row-1, leftCol=0, rightCol=col-1;

        while(totalElementsTraversed<(row*col))
        {
            // top row
            for(int j=leftCol; j<=rightCol && totalElementsTraversed<(row*col); j++)
            {
                ans[ansPointer++] = arr[topRow][j];
                totalElementsTraversed++;
            }
            topRow++;
            
            // right col
            for(int i=topRow; i<=bottomRow && totalElementsTraversed<(row*col); i++)
            {
                ans[ansPointer++] = arr[i][rightCol];
                totalElementsTraversed++;
            }
            rightCol--;
            
            // bottom row
            for(int j=rightCol; j>=leftCol && totalElementsTraversed<(row*col); j--)
            {
                ans[ansPointer++] = arr[bottomRow][j];
                totalElementsTraversed++;
            }
            bottomRow--;
            
            // left col
            for(int i=bottomRow; i>=topRow && totalElementsTraversed<(row*col); i--)
            {
                ans[ansPointer++] = arr[i][leftCol];
                totalElementsTraversed++;
            }
            leftCol++;
        }
        return ans;
    }
    static int[] spiralMatrixTraversalAntiClockWise(int arr[][])
    {
        int row = arr.length, col = arr[0].length, totalElementsTraversed = 0, ansPointer=0;
        int ans[] = new int[(row*col)];
        int topRow=0, bottomRow=row-1, leftCol=0, rightCol=col-1;

        while(totalElementsTraversed<(row*col))
        {
            // top row
            for(int j=rightCol; j>=leftCol && totalElementsTraversed<(row*col); j--)
            {
                ans[ansPointer++] = arr[topRow][j];
                totalElementsTraversed++;
            }
            topRow++;
            
            // left col
            for(int i=topRow; i<=bottomRow && totalElementsTraversed<(row*col); i++)
            {
                ans[ansPointer++] = arr[i][leftCol];
                totalElementsTraversed++;
            }
            leftCol++;

            // bottom row
            for(int j=leftCol; j<=rightCol && totalElementsTraversed<(row*col); j++)
            {
                ans[ansPointer++] = arr[bottomRow][j];
                totalElementsTraversed++;
            }
            bottomRow--;

            // right col
            for(int i=bottomRow; i>=topRow && totalElementsTraversed<(row*col); i--)
            {
                ans[ansPointer++] = arr[i][rightCol];
                totalElementsTraversed++;
            }
            rightCol--;
        }
        return ans;
    }
    
    // given a positive integer n, generate an n*n matrix filled
    // with elements from 1 to n^2 in spiral order.
    static int[][] spiralMatrixGeneration(int n)
    {
        int arr[][] = new int[n][n];
        int row = arr.length, col = arr[0].length, totalElementsTraversed = 0, ele=1;
        int topRow=0, bottomRow=row-1, leftCol=0, rightCol=col-1;
    
        while(totalElementsTraversed<(row*col))
        {
            // top row
            for(int j=leftCol; j<=rightCol && totalElementsTraversed<(row*col); j++)
            {
                arr[topRow][j] = ele++;
                totalElementsTraversed++;
            }
            topRow++;
            
            // right col
            for(int i=topRow; i<=bottomRow && totalElementsTraversed<(row*col); i++)
            {
                arr[i][rightCol] = ele++;
                totalElementsTraversed++;
            }
            rightCol--;
            
            // bottom row
            for(int j=rightCol; j>=leftCol && totalElementsTraversed<(row*col); j--)
            {
                arr[bottomRow][j] = ele++;
                totalElementsTraversed++;
            }
            bottomRow--;
            
            // left col
            for(int i=bottomRow; i>=topRow && totalElementsTraversed<(row*col); i--)
            {
                arr[i][leftCol] = ele++;
                totalElementsTraversed++;
            }
            leftCol++;
        }
        return arr;
    }


    public static void main(String[] args) {
        int arr[][] = make2DArray();
        System.out.println();
        display2DArray(arr);

        System.out.println();
        int arr2[] = spiralMatrixTraversalAntiClockWise(arr);
        display1DArray(arr2);

        // int arr[][] = spiralMatrixGeneration(3);
        // display2DArray(arr);
    }
}
