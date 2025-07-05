import java.util.Scanner;

class p6_TakingCharInputs {
    public static void main(String[] args) {
        // scanner class does not have the method to take inputs for char data type
        // we will be chopping the string inputs

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the character : -");
        char data = sc.next().charAt(0); //taking char inputs
        System.out.println("Char : " + data);
    }
    
}
