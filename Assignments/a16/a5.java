import java.util.ArrayList;

public class a5 {
    public static void main(String[] args) {
        // int arr[] = {-4};
        int arr[] = {-4,0,8,-3,-2};
        ArrayList<Integer> l = new ArrayList<Integer>();
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>=0)
            l.add(arr[i]);
        }

        if(l.size()>0)
        System.out.println(l);
        else
        System.out.println("NA");
    }
}
