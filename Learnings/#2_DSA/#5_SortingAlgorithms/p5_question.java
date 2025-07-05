public class p5_question {
    static void swap(String arr[], int i, int j)
    {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void displayArray(String arr[])
    {
        int n = arr.length;
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void selectionSort(String arr[]) //for strings
    {
        int n = arr.length;
        for(int i=0; i<n-1; i++)
        {
            int minIndex=i;
            for(int j=i+1; j<n; j++)
            {
                if(arr[minIndex].compareTo(arr[j])>0)
                {
                    minIndex=j;
                }
            }
            swap(arr, i, minIndex);
        }
    }
    public static void main(String[] args) {
        String arr[] = {"papaya", "lime", "watermelon", "apple", "mango", "kiwi"};
        displayArray(arr);
        selectionSort(arr);
        displayArray(arr);
    }
}
