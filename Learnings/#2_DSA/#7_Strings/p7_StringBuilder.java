public class p7_StringBuilder {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder(100);
        StringBuilder s3 = new StringBuilder("Hello");
        System.out.println(s3);
        s3.append(" World");
        System.out.println(s3);
    }
}
