import java.util.*;
class manipulation
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("eter the string:");
		String a =sc.nextLine();
		System.out.println("enter the second string:");
		String b =sc.nextLine();
		System.out.println("enter the third string:");
		String c=sc.nextLine();
		System.out.println("lowercase of first string:"+a.toLowerCase());
		System.out.println("uppercase of string:"+b.toUpperCase());
		System.out.println("combination of string:"+c.toConCat());
		
	}
}
