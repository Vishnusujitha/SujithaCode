package bank.deposit;

public class Samsung extends FactoryDemo
{
static int price=500;
public static void main(String[] args)
{
Samsung sam=new Samsung();
sam.browse();
sam.call(price);
sam.sendMessage();
sam.receiveCall();
sam.verifyFingerPrint();
sam.providePattern();
System.out.println(sam.price);
}
public int call(int seconds)
{
System.out.println("Calling in smartphone");
return price;
}
public void sendMessage()
{
System.out.println("Sending message");
}
public void receiveCall()
{
System.out.println("Receiving calls");
}
public void verifyFingerPrint()
{
System.out.println("Verifing finger print");
}
public void providePattern()
{
System.out.println("Please provide pattern");
}
}