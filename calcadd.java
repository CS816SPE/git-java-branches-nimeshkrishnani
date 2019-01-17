import java.util.Scanner;
public class calcadd
{
	public static void main(String args[])
	{
		float a, b, res;
		char choice, ch;
		Scanner scan = new Scanner(System.in);
		
		do
		{
			System.out.println("1.Add Two Numbers");
			System.out.println("2.Multiply two numbers");
			System.out.println("3.Exit");		
			System.out.print("Enter your choice:");
			choice = scan.next().charAt(0);
			switch(choice)
			{
				case '1' : System.out.println("Enter Two numbers:");
						a = scan.nextFloat();
						b = scan.nextFloat();
						res = a+b;
						System.out.println("Your result is:"+res);
						break;
				case '2' :
						a = scan.nextFloat();
						b = scan.nextFloat();
						res = a*b;
						System.out.println("Your result is : "+res);
				case '3' : System.exit(0);
					break;
				default : System.out.println("INVALID CHOICE");
			}
			System.out.print("\n---------------------------------------\n");
		}
		while(choice!='2');
	}
}
