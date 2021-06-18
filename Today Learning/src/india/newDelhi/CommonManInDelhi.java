package india.newDelhi;
import tamilnadu.chennai.CommonManInChennai;
public class CommonManInDelhi implements TrafficRulesDelhi
//public class CommonManInDelhi implements TrafficRulesDelhi,TrafficRules error 
{
public static void main(String[] args) {
CommonManInDelhi cmid=new CommonManInDelhi();
cmid.dontGoByDieselVehicle();
cmid.goByBicycle();
CommonManInChennai cmic=new CommonManInChennai();
cmic.goByDieselVehicle();
cmic.goByBicycle();
}
public void dontGoByDieselVehicle()
{
System.out.println("Don't go to diesel vechicle");
}
@Override
public void goByBicycle()
{
System.out.println("Going bicycle");
}
}