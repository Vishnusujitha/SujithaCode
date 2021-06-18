package bank.deposit;

public class SQLTrainer extends Trainer
{
String deptm="SQL";
String instit="Payilagam";
public static void main(String[] args)
{
Trainer ram=new SQLTrainer("CSE", "payilagam");
ram.training();
System.out.println(ram.getSalary());
}
public SQLTrainer(String dept, String institute) {
super(dept, institute);
}
}