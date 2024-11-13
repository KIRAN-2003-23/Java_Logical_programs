import java.util.Scanner;
public class SumOfEven
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int i,sum=0;
System.out.println("enter n natural numbers");
int n=s.nextInt();
for(i=1;i<=n;i++)
{
if(i%2==0)
{
sum=sum+i;
}
}
System.out.println(sum);
}
}


