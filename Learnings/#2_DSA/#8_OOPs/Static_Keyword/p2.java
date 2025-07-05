public class p2 {
    int rno;
    String name;
    private static int count;
    public p2(int rno, String name){
        this.rno = rno;
        this.name = name;
        count++;
    }
    public static int getCount(){
        return count;
    }
}
