public class p9_Insert_delete {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello");
        str.insert(2, 'y');
        System.out.println(str);
        str.deleteCharAt(2);
        System.out.println(str);
    }
}
