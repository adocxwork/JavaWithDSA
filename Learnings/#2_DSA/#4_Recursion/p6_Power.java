public class p6_Power {
    static int powOf(int x, int y) //better approach
    {
        if(y==0) return 1;
        int smallAns = powOf(x, y/2);
        if(y%2==0) return smallAns * smallAns;
        return x * smallAns * smallAns;
    }
    // static int powerOf(int x, int y)
    // {
    //     if(y==0) return 1; //base case
    //     return x * powerOf(x, y-1); //sub problem + self work
    // }
    public static void main(String[] args) {
        // System.out.println(powerOf(2, 4));
        System.out.println(powOf(3, 3));
    }
}