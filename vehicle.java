import java.io.*;
import java.util.Scanner;
class vehicle
{
String make,model,fueltype;
int year;
}
class truck extends vehicle
{
void fuc()
{
System.out.println("TRUCK  : -");
make="iron";
model="tata";
year=2005;
fueltype="disel";
distance=50;
fuel_efficeincy
System.out.println("MAKE:-"+make);
System.out.println("MODEL:-"+model);
System.out.println("YEAR:-"+year);
System.out.println("FUEL_TYPE:-"+fueltype);
}
}
class car extends vehicle
{
void fuc1()
{
System.out.println("CAR  : -");
make="iron";
model="rollsroyce";
year=2007;
fueltype="disel";
System.out.println("MAKE:-"+make);
System.out.println("MODEL:-"+model);
System.out.println("YEAR:-"+year);
System.out.println("FUEL_TYPE:-"+fueltype);
}
}
public class motorcycle extends vehicle
{
void fuc2()
{
System.out.println("MOTOR  CYCLE  : -");
make="iron";
model="duke";
year=2009;
fueltype="petrol";
System.out.println("MAKE:-"+make);
System.out.println("MODEL:-"+model);
System.out.println("YEAR:-"+year);
System.out.println("FUEL_TYPE:-"+fueltype);
}

public static void main(String args[])
{
truck  a=new truck();
car    b=new car();
motorcycle  c=new motorcycle();
a.fuc();
b.fuc1();
c.fuc2();
}
}