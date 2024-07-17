import java.io.*;
import java.util.Scanner;
class shape
{
int r=5;
void getperimeter()
{
System.out.print("your perimeter");
}
void getarea()
{
System.out.println("your area");
}
}
public class circle extends shape
{
double are,peri;
void getperimeter()
{
peri=2*3.14*r;
System.out.println("your perimeter"+peri);
}
void getarea()
{
are=3.14*r*r;
System.out.println("your area"+are);
}
public static void main(String args[])
{
circle s=new circle();
s.getperimeter();
s.getarea();
}
}