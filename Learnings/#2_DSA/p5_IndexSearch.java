// search the given element x in the array.
// if present then retunr the index else
// return -1


// linear search
class ArrayThings2{
    int indexSearch(int x, int arr[])
    {
        int index=-1;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==x)
            {
                index=i;
                break;
            }
        }
        return index;
    }
}


public class p5_IndexSearch {
    public static void main(String[] args) {
        ArrayThings2 obj = new ArrayThings2();
        int arr[] = {1,5,3,7,13,11,2};
        System.out.println(obj.indexSearch(3,arr));
    }
}
