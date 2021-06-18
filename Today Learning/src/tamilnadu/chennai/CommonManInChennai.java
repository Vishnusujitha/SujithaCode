package tamilnadu.chennai;

public class CommonManInChennai implements TrafficRules
{
public static void main(String[] args)
{
CommonManInChennai cmic=new CommonManInChennai();
cmic.goByDieselVehicle();
cmic.goByBicycle();
}
public void goByDieselVehicle()
{
System.out.println("Going diesel vechicle");
}
public void goByBicycle()
{
System.out.println("Going bicycle");
}
}