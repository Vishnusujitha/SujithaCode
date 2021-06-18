package bank.deposit;

public class Trainer
{
String dept="Java";
String institute="Payilagam";
private int salary=10000;
public static void main(String[] args) {
Trainer trainerkumar=new Trainer("CSE", "payilagam");
trainerkumar.training();
}
public Trainer(String dept, String institute)
{
this.dept = dept;
this.institute = institute;
}
public int getSalary()
{
return this.salary;
}
public void training()
{
System.out.println("Training "+dept+" in "+institute);
}
}