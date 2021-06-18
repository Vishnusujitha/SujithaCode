package bank.deposit;

public class Calculator
{
public static void main(String[] args)
{
//Creating object
Calculator myCalculator=new Calculator();
//Method calling (add)
//Method -Input -->
//Method Overloading:
//Same method name with different number of arguments
//Same method name with different type of arguments
//It is known as complile time polymorphism
//Scope of variables in Java
myCalculator.add(100);//100 - parameter
myCalculator.add(100,200);
myCalculator.add(12.34f);
}
//Method Definition
public void add(float no) //formal
{
	System.out.println(no+12.3);
}
public void add(int no) //formal
{
	System.out.println(no+123);
}
public void add(int no,int no2) //formal
{
	System.out.println(no+no2);
}
}