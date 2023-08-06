public class a8 {
    public static void main(String[] args) {
        // Write a program to print a triangle of prime numbers upto given number of lines of the trinagle.
        int n = 11;
        for(int i=1; i<=11; i++)
        {
            for(int j=n; j>=1+i; j--)
            {
                System.out.print(" ");
            }
            System.out.print("hi");
            System.out.println();
        }
    }
}
