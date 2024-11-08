import java.util.Scanner;
class Mpc
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int sno,maths,physics,chemistry,total;
String sname;
float savg;
System.out.println("enter student number:");
sno=s.nextInt();
System.out.println("enter student name:");
sname=s.next();
System.out.println("enter maths marks:");
maths=s.nextInt();
System.out.println("enter physics marks:");
physics=s.nextInt();
System.out.println("enter chemistry marks:");
chemistry=s.nextInt();
total=maths+physics+chemistry;
savg=total/3;
 System.out.println("student number is:"+sno);
 System.out.println("student name is:"+sname);
 System.out.println(" marks scored in maths:"+maths);
 System.out.println(" marks scored in physics:"+physics);
 System.out.println(" marks scored in chemistry:"+chemistry);
 System.out.println("total marks:"+total);
 System.out.println("average of marks:"+savg);
}
}

 


