class Algebra2{
    void oneDArray2(){
        int arr[] = {7,5,3,8,9,0,1};

        // for loop
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println();
        
        // for each loop
        for(int val : arr) //you can't traverse partial array...
        {
            System.out.print(val + " ");
        }
        System.out.println();
        System.out.println();
        
        // while loop
        int i=0;
        while(i<arr.length)
        {
            System.out.print(arr[i] + " ");
            i++;
        }
        
    }

    void twoDArray(){ //traversing twoD array
        int arr2[][] = {{3,4},
                        {4,7,8},
                        {1,3,2,9,8}};

        for(int i=0; i<arr2.length; i++) //use of lenght property
        {
            for(int j=0; j<arr2[i].length; j++)
            {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }


}


public class p2_TraversingArray {
    public static void main(String[] args) {
        Algebra2 obj = new Algebra2();
        // obj.oneDArray2();
        obj.twoDArray();
    }
}