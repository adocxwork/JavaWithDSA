import java.util.Scanner;

class p0_temp
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :-");
		int n = sc.nextInt();
		int new_num = 0;
		while(n>0)
		{
			new_num = new_num + (n%10);
			n = n / 10;
			if(n>0)
			{
				new_num = new_num * 10;
			}
		}
		System.out.println("The Reverse Number is : " + new_num);
	}
}