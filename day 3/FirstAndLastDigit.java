import java.util.Scanner;
public class FirstAndLastDigit
{
public static void main(String args[])
{
int i,count=0;
Scanner s=new Scanner(System.in);
int num=s.nextInt();
while(num!=0)
{
num/=10;
count++;
}
System.out.println(count);
for(i=1;i<=count;i++)
{
if(i==count-1)
{
continue;
}
System.out.println(num);
}
}
}



