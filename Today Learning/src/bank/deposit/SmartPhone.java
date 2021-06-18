package bank.deposit;

public abstract class SmartPhone
{
public abstract int call(int seconds);
public abstract void sendMessage();
public abstract void receiveCall();
void browse()
{
System.out.println("Smartphone browing");
}
public SmartPhone()
{
System.out.println("Smartphone under development");
}
}