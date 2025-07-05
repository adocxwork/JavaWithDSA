public class p18_for_loop {
    public static void main(String[] args) {
        for(int i=1; i<=100; i++)
        {
            if(i%3==0 || i%5==0)
            {
                System.out.println((i%3==0 && i%5==0)? "FizzBuzz":((i%3==0)? "Fizz":"Buzz" ) );
                continue;
            }
            System.out.println(i);
        }
    }
}
// page no - 6, try these part..