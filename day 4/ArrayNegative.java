import java.util.Scanner;
public class ArrayNegative
{
public static void main(String args[])
{
int i;
Scanner s=new Scanner(System.in);
System.out.println("Array Size:");
int n=s.nextInt();
int a[]=new int[n];
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
}
for(i=0;i<n;i++)
{
if(a[i]<0)
{
System.out.println("the negatives of array is:"+a[i]);
}
}
}
}
