import java.util.Scanner;
public class Palindrome
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String str=s.next();
str.reverse();
if(str==str.reverse())
{
System.out.println(str);
}
else
{
System.out.println("the given is not a palindrome");
}
}
}
