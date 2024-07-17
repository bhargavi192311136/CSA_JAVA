import java.io.*;
import java.util.Scanner;
class person
{
void getfirstname()
{
Scanner a=new Scanner(System.in);
String x=a.next();
System.out.println("FIRST NAME:"+x);
}
void getlastname()
{
Scanner b=new Scanner(System.in);
String y=b.next();
System.out.println("LAST NAME:"+y);
}
}
public class employee extends person
{
void getlastname()
{
Scanner c=new Scanner(System.in);
String z=c.next();
System.out.println("LAST NAME:"+z);
}
public static void main(String args[])
{
employee l=new employee();
l.getfirstname();
l.getlastname();
}
}