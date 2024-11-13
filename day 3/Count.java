import java.util.Scanner;
public class Count
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int num,count;
System.out.println("enter a number:");
num=s.nextInt();
if(num==0)
{
count=1;
}
else
{
while(num!=0)
{
num/=10;
count++;
}
}
System.out.println("the count of a number is:"+count);
s.close();
}
}


