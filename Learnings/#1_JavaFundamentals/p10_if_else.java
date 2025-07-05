public class p10_if_else {
    public static void main(String[] args) {
        int age = 26;

        if(age<12)
        {
            System.out.println("Child");
        }
        else if(age>=12 && age<18)
        {
            System.out.println("Teenager");
        }
        else if(age>=18)
        {
            System.out.println("Adult");
        }
    }
}
