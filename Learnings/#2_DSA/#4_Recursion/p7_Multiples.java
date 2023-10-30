public class p7_Multiples {
    static void multiples(int num, int k)
    {
        if(k==0) return; //base case
        multiples(num, k-1); //sub problem
        System.out.println(num*k); //self work
    }
    public static void main(String[] args) {
        multiples(5, 4);
    }
}
