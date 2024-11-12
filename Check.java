import java.util.*;
class Check
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
char n;
System.out.println("enter a character n");
n=sc.next().charAt(0);
if(n=='y'||n=='Y')
System.out.println("yes");
else
System.out.println("no");
}
}