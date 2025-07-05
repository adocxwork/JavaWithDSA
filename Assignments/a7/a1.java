import java.util.Scanner;

class a1{

    float avgOfThree(float a, float b, float c)
    {
        float ans = (a+b+c)/3;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers for average :-");
        float x = sc.nextFloat();
        float y = sc.nextFloat();
        float z = sc.nextFloat();

        a1 obj = new a1();
        System.out.println("Average is : " + obj.avgOfThree(x,y,z));
        sc.close();
    }
}