import java.util.Scanner;
class matrix
{
public static void main(String args[])
{
int a[][]=new int [50][50];
int c1,r1,i,j;
{
Scanner sc=new Scanner(System.in);
System.out.print("enter the column:");
c1=sc.nextInt();
System.out.println("enter the rows:");
r1=sc.nextInt();
System.out.println("enter the first matrix:");

for(i=0;i<r1;i++){
for(j=0;j<c1;j++){
a[i][j]=sc.nextInt();
}
}
System.out.print("first matrix is:");

for(i=0;i<r1;i++){
for(j=0;j<c1;j++){
System.out.println(a[i][j]+" ");
}
System.out.println(" ");
}
}
int b[][]=new int [50][50];
int c2,r2;
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the column:");
c2=sc.nextInt();
System.out.print("enter the rows:");
r2=sc.nextInt();
System.out.println("enter the first matrix:");

for(i=0;i<r2;i++){
for(j=0;j<c2;j++){
b[i][j]=sc.nextInt();
}
}
System.out.println("second matrix is:");

for(i=0;i<r2;i++){
for(j=0;j<c2;j++){
System.out.print(b[i][j]+" ");
}
System.out.println(" ");
}
}
int c[][]=new int [50][50];

System.out.println("third matrix is:");
for(i=0;i<r2;i++){
for(j=0;j<c2;j++){
System.out.print(a[i][j]+b[i][j]+" ");
}
System.out.println(" ");
}
}
}






