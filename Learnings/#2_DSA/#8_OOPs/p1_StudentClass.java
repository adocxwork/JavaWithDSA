public class p1_StudentClass{
    public static void change(Student ob){
        ob.rno++;
    }
    public static void main(String[] args) {

        /*We can create different data type (user defined class)
          As well as their multiple objects too..
        */

        Student x = new Student();
        System.out.println(x.name);
        System.out.println(x.rno);
        System.out.println(x.percent);
        // x.name = "Aditya Gupta";
        // x.rno = 17;
        // x.percent = 7.87;

        // System.out.println(x.rno);
        // change(x);
        // System.out.println(x.rno);
    }
}