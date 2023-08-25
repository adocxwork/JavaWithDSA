public class a5 {
    public static void main(String[] args) {
        int a1[] = {5,4,7};
        int a2[] = {5,3,7};
        boolean eq = true;
        for(int i=0; i<a1.length; i++)
        {
            if(a1[i]!=a2[i])
            {
                eq=false;
                break;
            }
        }
        System.out.println(eq);
    }
}
