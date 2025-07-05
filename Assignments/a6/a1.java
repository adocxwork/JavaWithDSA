class Student{
    String name;
    int roll_no;
}

public class a1{
    public static void main(String[] args) {
        Student john = new Student();
        john.roll_no = 2;
        john.name = "John";

        System.out.println(john.roll_no);
        System.out.println(john.name);
    }
}