import java.util.*;
class Studentdetails
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int rollno,semester;
String name,branch;
float marks;
System.out.println("ENter a roll number");
rollno=sc.nextInt();
sc.nextLine();
System.out.println("ENter a name");
name=sc.nextLine();
System.out.println("ENter a branch");
branch=sc.nextLine();
System.out.println("ENter a semester");
semester=sc.nextInt();
System.out.println("ENter a marks");
marks=sc.nextFloat();
System.out.println("studet details");
System.out.println("studet roll number:"+rollno);
System.out.println("studet name:"+name);
System.out.println("studet semester:"+semester);
System.out.println("studet branch:"+branch);
System.out.println("studet marks:"+marks);
}
}

