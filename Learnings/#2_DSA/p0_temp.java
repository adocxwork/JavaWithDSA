public class p0_temp {
    static void displayArray(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {7,8,9,5};
        int arr2[] = arr.clone(); //this becomes separate copy of array
        System.out.println("Before");
        displayArray(arr);
        displayArray(arr2);
        arr2[0] = 0;
        arr2[1] = 0;
        System.out.println("After");
        displayArray(arr);
        displayArray(arr2);

    }
}
