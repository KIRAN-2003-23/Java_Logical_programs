import java.util.Scanner;
public class Sum
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int i,sum=0;
System.out.println("enter n natural numbers");
int n=s.nextInt();
for(i=1;i<=n;i++)
{
sum=sum+i;
}
System.out.println(sum);
}
}


