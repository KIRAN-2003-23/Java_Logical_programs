import java.util.Scanner;
public class WhileAlphabet
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
char ch;
ch=s.next().charAt(0);
while(ch<='z')
{
System.out.println(ch);
ch++;
}
}
}

