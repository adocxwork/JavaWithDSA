public class hi{
    public static void quickSort(int[][] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static int partition(int[][] arr, int low, int high) {
        int pivot = arr[high][1];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j][1] > pivot) {
                i++;
                int[] temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int[] temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
    public static void main(String[] args) {
        int arr[][] = {
            {3,1},
            {1,3},
            {3,2}
        };
        quickSort(arr, 0, 2);
        for(int i=0; i<3; i++){
            for(int j=0; j<2; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}