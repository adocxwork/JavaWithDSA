public class p24_labelsOnLoops {
    public static void main(String[] args) {
        first: for(int j=0; j<3; j++)
        {
            for(int i=0; i<3; i++)
            {
                if(i==1 && j==1)
                {
                    continue first;
                }
                System.out.println(j + " " + i);
            }
        }
    }
}
