// Convert the list of Strings
// {"ab", "bc", "cd", "de", "ef", "fg", "gh"}
// into an array of strings and print all
// strings stored on odd indices of the array
class ArrayThings2{
    void oddIndices(String arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            if(i%2!=0)
            {
                System.out.println(arr[i]);
            }
        }
    }
}
public class a2 {
    public static void main(String[] args) {
        String arr[] = {"ab", "bc", "cd", "de", "ef", "fg", "gh"};
        ArrayThings2 obj = new ArrayThings2();
        obj.oddIndices(arr);
    }
}
