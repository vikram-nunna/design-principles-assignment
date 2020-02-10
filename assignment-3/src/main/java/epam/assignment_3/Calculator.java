package epam.assignment_3;
import java.util.*;
public class Calculator {
	public static void main(String[] arr)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numbers:");
		System.out.println();
		System.out.println("Enter First number:");
		int n1=sc.nextInt();
		System.out.println("Enter Second number:");
		int n2=sc.nextInt();
		System.out.println("Enter operator :");
		String op=sc.next();
		Check ch=new Check();
		if(op=="+")
		{
			System.out.println(ch.add(n1,n2));
		}
		else if(op=="-")
		{
			System.out.println(ch.sub(n1,n2));
		}
		else if(op=="*")
		{
			System.out.println(ch.mul(n1,n2));
		}
		else
		{
			System.out.println(ch.div(n1,n2));
		}
	}

}
