public class a6 {
    public static void main(String[] args) {
        int n = 11; //odd number only

        for(int i=1; i<=((n/2)+1); i++)
        {
            // space
            for(int j=1; j<=((n/2)+1-i); j++)
            {
                System.out.print(" ");
            }
            // alphabets
            for(int k=1; k<=(2*i-1); k++)
            {
                System.out.print((char)(k+64));
            }
            System.out.println();
        }

        for(int z=(n/2); z>=1; z--)
        {
            // space
            for(int y=1; y<=(n/2)-z+1; y++)
            {
                System.out.print(" ");
            }

            // alphabets
            for(int x=1; x<=(z*2-1); x++)
            {
                System.out.print((char)(x+64));
            }
            System.out.println();
        }
    }
}
