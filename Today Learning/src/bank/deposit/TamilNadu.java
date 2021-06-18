package bank.deposit;

public class TamilNadu extends SouthIndia {
public TamilNadu(String primeMinister) {
super(primeMinister);
}
static String capital="Chennai";
public static void main(String[] args)
{
India in= new TamilNadu("Modi");
System.out.println(in.capital);
SouthIndia si= new TamilNadu("Modi");
System.out.println(TamilNadu.capital);
si.eat();
si.speakLanguage();
si.dress();
si.cultivate();
si.livingStyle();
}
public void speakLanguage()
{
System.out.println("Speaking language");
}
public void eat()
{
System.out.println("Eating habit");
}
void dress()
{
System.out.println("Dressing good");
}
@Override
public void cultivate()
{
System.out.println("Rice and Sugar cane cultivation");
}
public void livingStyle()
{
System.out.println("Above Average development");
}
}