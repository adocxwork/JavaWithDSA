public class p9_DeepCopyArray {

    static void displayArray(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void arrayValueChange2(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = 0;
        }
    }

    public static void main(String[] args) {
        int arr1[] = {5,6,7,8};
        int arr2[] = arr1.clone();
        
        System.out.println("Original Array :-");
        displayArray(arr1);
        System.out.println("Cloned Array :-");
        displayArray(arr2);

        System.out.println("\nAfter changing the values of cloned array :-\n");
        arrayValueChange2(arr2);

        System.out.println("Original Array :-");
        displayArray(arr1);
        System.out.println("Cloned Array :-");
        displayArray(arr2);
    }

}