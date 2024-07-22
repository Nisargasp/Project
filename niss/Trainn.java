class Trainn
{
public static void book(String source, String destination)
{
System.out.println("book your train ticket");
System.out.println("source"+source);
System.out.println("destination"+destination);
}
public static void book(String source, String destination, double quantity)
{
System.out.println("book your train ticket");
System.out.println("source"+source);
System.out.println("destination"+destination);
System.out.println("quantity"+quantity);
}
public static void book(String source, String destination, double quantity, double price)
{
System.out.println("book your train ticket");
System.out.println("source"+source);
System.out.println("destination"+destination);
System.out.println("quantity"+quantity);
System.out.println("price"+price);
}
public static void cancel(double ticketNo)
{
System.out.println("cancel your ticket");
System.out.println("ticketNo"+ticketNo);
}
public static void cancel(String source, String destination)
{
System.out.println("cancel your ticket");
System.out.println("source"+source);
System.out.println("destination"+destination);
}
public static void main(String[] ars)
{
  System.out.println("all the result");
Trainn.book("holalkere","shivmogga");
Trainn.book("ramagiri","chitradurga",234);
Trainn.book("hosdurga","chikkamangaluru",324,200);
Trainn.cancel(2002);
Trainn.cancel("holalker","shivmogga");
}
}