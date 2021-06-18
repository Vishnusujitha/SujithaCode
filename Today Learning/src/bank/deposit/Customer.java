package bank.deposit;

public class Customer
{
public static void main(String[] args)
{
Bank rep=new Bank();//Memory reference of a class
//rep.openAccount();
rep.calculateInterest();
rep.getLoan();
System.out.println(rep.interest);
//rep.training();
//System.out.println(rep.salary);
}
}