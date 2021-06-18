package bank.deposit;

public class Calculator2
{
public static void main(String[] args)
{
	Calculator2 calc=new Calculator2();
	int value =calc.add();
//	double val=calc.subtract(value);
	System.out.println(calc.subtract(value));
}
public double subtract(int result)
{
	//System.out.println(result-20);
	return result-20.0;
}
public int add()
{
	int no1=123, no2=234;
	//System.out.println(no1+no2);
	return no1+no2;//last line return 
}
}