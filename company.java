import java.io.*;
import java.util.Scanner;
class company
{
String name,address,jobtitle;
int salary;
}
class manager extends company
{
void fuc()
{
System.out.println("MANAGER  : -");
name="SUNIHITH";
address="KADAPA";
salary=500000;
jobtitle="EXECUTIVE MANAGER";
System.out.println("NAME:-"+name);
System.out.println("ADRESS:-"+address);
System.out.println("SALARY:-"+salary);
System.out.println("JOB_TITLE:-"+jobtitle);
}
}
class developper extends company
{
void fuc1()
{
System.out.println("DVELOPPER  : -");
name="SHEKER";
address="NELLORE";
salary=300000;
jobtitle="PROJECT DEVELOPPER";
System.out.println("NAME:-"+name);
System.out.println("ADRESS:-"+address);
System.out.println("SALARY:-"+salary);
System.out.println("JOB_TITLE:-"+jobtitle);
}
}
class programer extends company
{
void fuc2()
{
System.out.println("PROGRAMMER  : -");
name="KRISHNA";
address="vizag";
salary=200000;
jobtitle="PROGRAM MANAGER";
System.out.println("NAME:-"+name);
System.out.println("ADRESS:-"+address);
System.out.println("SALARY:-"+salary);
System.out.println("JOB_TITLE:-"+jobtitle);
}
}
class employe extends company
{
void fuc3()
{
System.out.println("EMPLOYEE : -");
name="PAVAN";
address="ANANTHAPUR";
salary=100000;
jobtitle="EMPLOYEE`HEAD";
System.out.println("NAME:-"+name);
System.out.println("ADRESS:-"+address);
System.out.println("SALARY:-"+salary);
System.out.println("JOB_TITLE:-"+jobtitle);
}

public static void main(String args[])
{
manager  a=new manager();
developper   b=new developper ();
programer  c=new programer ();
employe  d=new employe();
a.fuc();
b.fuc1();
c.fuc2();
d.fuc3();
}
}