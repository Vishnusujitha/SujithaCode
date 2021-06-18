package bank.deposit;

public abstract class Parents
{
int salary=1000;
final int savings=500;
private int balance=50000;
public Parents()
{
System.out.println("Parent constructor");
}
public int getBalance()
{
return this.balance;
}
public void setBalance(int childMoney)
{
this.balance=this.balance;
}
public abstract void studyWell();
public void work()
{
System.out.println("Working");
}
}