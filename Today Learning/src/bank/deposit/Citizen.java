package bank.deposit;

public class Citizen extends Father implements ElectionRules, CityTrafficRules, TrafficRules
{
public static void main(String[] args)
{
TrafficRules off=new Citizen();
off.wearHelamt();
off.bringLicense();
ElectionRules officer=new Citizen();
officer.takeIDCard();
officer.wearMask();
Citizen c=new Citizen();
c.wearMask();
}
public void oneway()
{
}
public void noBullockCarts()
{
}
public void work()
{
System.out.println("Going to work");
}
public void wearMask()
{
System.out.println("Wearing Mask");
}
public void takeIDCard()
{
System.out.println("Show ID Card");
}
public void wearHelamt()
{
System.out.println("Wear helmat properly");
}
public void bringLicense()
{
System.out.println("Bring License");
}
}