public class a3 {
    static int Trains(int arr[], int dep[])
    {
        int noOfPlatforms=1;
        int arrivalTime = arr[0];
        int departureTime = dep[0];
        int noOfTrains = 1;
        int noOfGaps = 0;
        for(int i=1; i<arr.length; i++)
        {
            if(dep[i-1]<=arr[i])
            {
                noOfGaps++;
            }
            if(dep[i-1]>arr[i])
            {
                noOfTrains++;
                arrivalTime = arr[i];
                if(dep[i]>dep[i-1])
                departureTime = dep[i];
                if(dep[i]<dep[i-1])
                departureTime = dep[i-1];
            }
            noOfPlatforms = noOfTrains-noOfGaps+1;
        }
        return noOfPlatforms;
    }
    public static void main(String[] args) {
        int arr[] = {900,940,950,1100,1500,1800};
        int dep[] = {910,1200,1120,1130,1900,2000};
        int noOfPlatforms = Trains(arr, dep);
        System.out.println(noOfPlatforms);
    }
}
