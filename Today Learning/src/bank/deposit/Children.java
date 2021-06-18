package bank.deposit;

public class Children extends Parents
{
int salary=2000;
public Children()
{
System.out.println("Child constructor");
}
public static void main(String[] args)
{
Children child=new Children();
child.work();
System.out.println(child.savings);
System.out.println(child.getBalance());
child.setBalance(20000);
System.out.println(child.getBalance());
}
public void work()
{
super.work();
System.out.println("Working by children");
}
public void studyWell()
{
System.out.println("Study well");
}
}