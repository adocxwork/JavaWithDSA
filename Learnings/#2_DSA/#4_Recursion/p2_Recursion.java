public class p2_Recursion {
    static int factRecursion(int n)
    {
        if(n==1 || n==0) return 1; //base case
        return n * factRecursion(n-1); //recursive work + self work
    }
    public static void main(String[] args) {
        System.out.println(factRecursion(5));
    }
}