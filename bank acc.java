import java.io.*
class bank_acc
{
int balance=500,money=450;
void deposit()
{
balance=balance+money;
System.out.println(balance);
}
void withdraw()
{
balance=balance-money;
System.out.println(balance);
}
}
class savings extends bank_acc
{
void withdraw()
{
if(balance>0)
{
System.out.print("ok");
}
else
{
System.out.print("no");
}
}
public static void main(String args[])
{
savings sa=new savings();
sa.deposit();
sa.withdraw();
}
}