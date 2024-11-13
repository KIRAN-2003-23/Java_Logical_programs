import java.util.Scanner;
public class SumOfFirstAndLast
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int num=s.nextInt();
int LastDigit=num%10;
int FirstDigit=num;
while(FirstDigit>=10)
{
FirstDigit=FirstDigit/10;
}
 int sum=FirstDigit+LastDigit;
System.out.println("the sum of FisrtDigit and LastDigit "+sum);
}
}




