public class p8_SetChar {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello");
        System.out.println(str);
        str.setCharAt(0, 'M');
        System.out.println(str);
        str.append(true);
        System.out.println(str);
    }
}
