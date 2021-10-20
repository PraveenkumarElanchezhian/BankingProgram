package bankingproblem;

import java.util.Scanner;

public class Banking {
    static String Bank_name = "RBL";
	public static void main(String[] args)
	{
		Scanner n = new Scanner(System.in);
		System.out.print("Enter your account number : ");
		long a = n.nextLong();
		System.out.print("Enter your customer name : ");
		String b = n.next();
		System.out.print("Enter your customer age : ");
		int c = n.nextInt();
		display(a,Bank_name,b,c);	
	}
	public static void display(long a,String Bank_name,String b,int c) 
	{
		System.out.println("Account number: "+a);
		System.out.println("Bank name: "+Bank_name);
		System.out.println("Customer name: "+b);
		System.out.println("Customer age: "+c);
	}

}
