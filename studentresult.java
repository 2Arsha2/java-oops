import java.util.Scanner; 
interface sports
{
public void sportsGetData();
public void sportsDisData();
} 
class student
{ 
    String name; 
    int s1; 
    int s2; 
    int rollno; 
   

 student(String name,int rollno,int s1,int s2)
  { 
       this.name=name;
       this.s1=s1;
       this.s2=s2;
       this.rollno=rollno;
}
}
class result extends student implements sports 
 { 
	 int rank;
	 String item;
	 Scanner sc = new Scanner(System.in);
 		 result(String name,int rollno,int s1,int s2)
 {
 		super(name,rollno,s1,s2);
  }
 
 void accademic()
 {	
 	double percentage=(s1+s2)*100/200;
 	System.out.println("total percentage:"+percentage);
 }
 public void sportsGetData()
 {
 System.out.println("enter the item name:");
 String item= sc.nextLine();
 System.out.println("enter the rank:");
 int rank =sc.nextInt();
 }
 public void sportsDisData()
  {
 System.out.println("sports item:"+item);
 System.out.println("rank:"+rank);
 }
 }
 class studentresult
 {
 public static void main(String args[])
 {
 Scanner in=new Scanner(System.in);
 System.out.print("enter the name");
 String name= in.nextLine();
  System.out.print("enter the rollno");
 int rollno= in.nextInt();
 System.out.print("enter the subject name");
 int s1= in.nextInt();
  System.out.print("enter the subject name");
 int s2= in.nextInt();

 result r=new result(name,rollno,s1,s2);
 r.sportsGetData();
 r.accademic();
 System.out.println();
 r.sportsDisData();
 }
 }
