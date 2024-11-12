import java.util.*;
class Swap
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b,c;
System.out.println("Enter a value");
a=sc.nextInt();
System.out.println("Enter b value");
b=sc.nextInt();
c=a;
a=b;
b=c;
System.out.println("After swap="+a+"b="+b);
}
}