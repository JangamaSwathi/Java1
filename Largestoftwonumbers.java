import java.io.*;
class Largestoftwonumbers
{
public static void main(String args[])
{
int a=53,b=97,c=23,result;
result=((a>b)&&(a>c))?a:((b>c)?b:c);
System.out.println("largest of two numbers="+result);
}
}