public class a2 {
    static int product(int x, int y)
    {
        if(y==1) return x;
        return x + product(x, y-1);
    }
    public static void main(String[] args) {
        System.out.println(product(11, 5));
    }
}
