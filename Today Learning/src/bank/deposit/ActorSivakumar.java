package bank.deposit;

public class ActorSivakumar implements Actor
{
static String address="Coimbatore";
int age;
String name;
public ActorSivakumar(int age, String name) {
this.age = age;
this.name = name;
System.out.println(age+" "+name);
}
public ActorSivakumar() {
System.out.println(address);
}
void speaking()
{
System.out.println("Speak");
}
public static void main(String[] args)
{
ActorSivakumar as=new ActorSivakumar(65,"Audi Car");
System.out.println(address);
as.speaking();
Actor ac= new ActorSivakumar();
ac.act();
ac.dance();
ac.sing();
}
public void act()
{
System.out.println("Good Actor");
}
public void dance()
{
System.out.println("Good Dancer");
}
public void sing()
{
System.out.println("Good Singer");
}
}