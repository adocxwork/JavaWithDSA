// Traverse over the elements of the array
//  {1,2,3,4,5,6,7,8} using for each loop
// and print all even elements. 

public class a3 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        for(int n : arr)
        {
            if(n%2==0)
            {
                System.out.println(n);
            }
        }
    }
}
