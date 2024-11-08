import java.util.Scanner;
class Circle
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int radius;
float Area;
float pi;
System.out.println("enter the radius:");
radius=s.nextInt();
System.out.println("enter the pi:");
pi=s.nextFloat();
Area=pi*radius*radius;
System.out.println("the area of the circle:"+Area);
}
}