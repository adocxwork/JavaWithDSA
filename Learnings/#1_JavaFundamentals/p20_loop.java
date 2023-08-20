public class p20_loop {
    public static void main(String[] args) {
        int i=1;
        while(true)
        {
            if(i%5==0 && i%7==0 && i!=1)
            {
                System.out.println(i);
                break;
            }
            i++;
        }
    }
}
