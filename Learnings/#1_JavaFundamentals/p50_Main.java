class Student{
    int rollNo;
    String name;
}

public class p50_Main { //there will be single public class in a java file
    public static void main(String[] args) {
        Student obj1 = new Student();
        Student obj2 = new Student();

        obj1.rollNo = 1;
        obj1.name = "adi";
        obj2.rollNo = 2;
        obj2.name = "Aditya Gupta";
        
        System.out.println(obj1.rollNo);
        System.out.println(obj1.name);
        
        System.out.println(obj2.rollNo);
        System.out.println(obj2.name);
        
    }
}
