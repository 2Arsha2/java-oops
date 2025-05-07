import java.util.*;
class shape
{
 	void area(int l,int b)
 	{
 		int ar=l*b;
 		System.out.println("area="+ar);
 	}
 void area(float r)
 {
 	float radius=3.14f*r*r;
 	System.out.println("area of a circle:"+radius);
 }
 void area(double s)
 {	
 	double square=s*s;
 	System.out.println("area:"+square);
 }
}
class overloading
{
public static void main(String args[])
{
int l,b;
float r;
double s;
Scanner Sc= new Scanner(System.in);
System.out.println("enter the length:");
l=Sc.nextInt();
System.out.println("enter the breadth:");
b=Sc.nextInt();
 		int ar=l*b;
System.out.println("area of a rectangle"+ar);
System.out.println("enter the length:");
r=Sc.nextFloat();
 	float radius=3.14f*r*r;
System.out.println("area of circle:"+radius);
System.out.println("enter the value of side:");
s=Sc.nextDouble();
 	double square=s*s;
System.out.println("area of a square"+square);
}
}
