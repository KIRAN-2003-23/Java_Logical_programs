import java.util.Scanner;
public class Multiplication
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int mul,i,n,j;
System.out.println(" enter a number");
n=s.nextInt();
for(i=1;i<=10;i++)
{
mul=n*i;
System.out.println(n+"*"+i+"="+mul);
}
}
}

