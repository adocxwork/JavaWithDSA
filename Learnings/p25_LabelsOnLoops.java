public class p25_LabelsOnLoops {
    public static void main(String[] args) {
        first: for(int j=0; j<3; j++)
        {
            second: for(int i=0; i<3; i++)
            {
                if(i==1 && j==1)
                {
                    break second;
                }
                System.out.println(j + " " + i);
            }
        }
    }
}
