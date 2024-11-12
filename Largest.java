import java.util.*;
class Largest
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b,c,d;
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
d=sc.nextInt();
System.out.println("Enter a value a,b,c");
if(a>b)
{
    if(a>c)
     {
       if(a>d)
         {
          System.out.println("a is largest");
         } 
       else
        {
         System.out.println("d is largest");
         }
     }
     else
     {
        if(c<d)
         {
           System.out.println("c is largest");
         }
        else
         {
          System.out.println("d is largest");
         }
    }
  
}
else
{
   if(b>c)
   {
     if(b>d)
       {
        System.out.println("b is greater");
       }
     else
     { 
       System.out.println("d is greater");
     }
   }
   System.out.println("b is largest");
}
}
} 

   
   
   