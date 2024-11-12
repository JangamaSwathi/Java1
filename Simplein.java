import java.util.*;
class Simplein
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
float ra,s;
int pa,t;
System.out.println("principal");
pa=sc.nextInt();
System.out.println("rate");
ra=sc.nextFloat();
System.out.println("time");
t=sc.nextInt();
s=(pa*t*ra)/100;
System.out.println("simple="+s);
}
}

