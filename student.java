import java.util.Scanner; 
interface sports
{
public void sportsGetData();
public void sportsDisData();
public void display();
}

 
interface student { 
    String name; 
    int s1; 
    int s2; 
    int rollno; 
    string sub1,sub2;
 
    student(string name,int s1,int s2,int rollno,string sub1,string sub2) { 
       this.name=name;
       this.s1=s1;
       this.s2=s2;
       this.rollno=rollno;
       this.sub1=sub1;
       this.sub2=sub2;
    } 
}
class result extends student implements sports 
 { 
	 int rank;
	 string item;
	 Scanner x = new Scanner(System.in);
 		 result(string name,int rollno,string sub1,string sub2,int s1,int s2)
 		 {
 		super(name,rollno,sub1,sub2,s1,s2);
  }
 }
 void accademic()
 {	
 	int percentage=(s1+s2)*100/200;
 	System.out.println("total percentage:"+percentage);
 }
 public void sportsGetData()
 {
 System.out.print("enter the item name");
 item=in.nextLine();
 System.out.print(enter the rank");
 rank=in.nextInt();
 }
 public void sportsDisData()
  {
 System.out.print("sports item:"+item);
 System.out.print("rank:"+rank);
 }
 public void display()
 {
 System.out.print("first subject was:"+sub1);
 System.out.print("second subject was:"+sub2);
 }
 }
 class studentresult
 {
 public static void main(String args[])
 {
 Scanner in=new Scanner(System.in);
 System.out.print("enter the name");
 string name= in.nextLine();
  System.out.print("enter the rollno");
 int rollno= in.nextInt();
 System.out.print("enter the subject name");
 string s1= in.nextLine();
  System.out.print("enter the subject name");
 string s2= in.nextLine();
  System.out.print("enter the mark in first subject");
 string s1= in.nextInt();
  System.out.print("enter the mark in second subject");
 string s2= in.nextInt();
 result r=new result(name,rollno,sub1,sub2,s1,s2);
 r.sportsGetData();
 r.accademic();
 System.out.println();
 r.sportsDisData();
 r.display();
 }
 }
