public class p19_p3 {
    static int singleElement(int ar[])
    {
        int ans=-1;
        int arr[] = ar.clone();
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i] == arr[j])
                {
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]!=-1)
            {
                ans = arr[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,2,1,3};
        System.out.println(singleElement(arr));
        
    }    
}
