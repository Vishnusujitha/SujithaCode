package bank.deposit;

class Library
{
int price;
public static void main(String[] args)
{
Library aptitude=new Library();
Library gk=new Library();
Library english=new Library();
aptitude.price=100;
gk.price=150;
english.price=130;
System.out.println(aptitude.price);
System.out.println(gk.price);
System.out.println(english.price);
aptitude.lend();
}
public void lend()
{
System.out.println("Lend aptitude");
}
}
