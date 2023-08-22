public class p8_ReferenceVariableConcepts {
    static void intValueChange(int a)
    {
        a = 0;
    }
    static void arrayValueChange(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = 0;
        }
    }
    static void arrayPrinting(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int a = 7;
        int intArray[] = {7,4,1,0,9};
        System.out.println("Values before changing :-");
        System.out.println(a);
        arrayPrinting(intArray);
        System.out.println();
        
        intValueChange(a);
        arrayValueChange(intArray);
        System.out.println("Values after changing :-");
        System.out.println(a);
        arrayPrinting(intArray);
    }
}
