package bank.deposit;

class SuperMarket
{
int price;
public static void main(String[] args)
{
SuperMarket rice =new SuperMarket();
SuperMarket bread =new SuperMarket();
SuperMarket soap =new SuperMarket();
//new allocates memory for the object
rice.price = 60;
bread.price = 50;
soap.price = 20;
System.out.println(rice.price);
System.out.println(bread.price);
System.out.println(soap.price);
rice.sell();
}
public void sell()
{
System.out.println("Selling price");
}
}
