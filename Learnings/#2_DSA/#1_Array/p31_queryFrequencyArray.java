// given Q queries, check if the given number is present
// in the array or not. value of all the elements in
// the array is less than 10 to the power 5


public class p31_queryFrequencyArray {
    static void frequencyArrayQueryCheck(int arr[], int query[], int maxValueOfElement)
    {
        int frequencyArray[] = new int[maxValueOfElement+10];
        for(int i=0; i<arr.length; i++)
        {
            frequencyArray[arr[i]]++;
        }
        for(int i=0; i<query.length; i++)
        {
            if(frequencyArray[query[i]]>0)
            {
                System.out.println(query[i] + ": Yes");
            }
            else
            {
                System.out.println(query[i] + ": No");
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,6,5,400,560,1000,400};
        int query[] = {5,34,400,10000,560};
        int maxValue = 100000;
        frequencyArrayQueryCheck(arr, query, maxValue);
    }
}
