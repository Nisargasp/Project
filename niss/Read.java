class Read
{
public static void write(String action)
{
System.out.println("read something");
System.out.println("action"+action);
}
public static void write(String bookName, int bookNo)
{
System.out.println("read something");
System.out.println("bookName"+bookName);
System.out.println("bookNo"+bookNo);
}
public static void write(String colour, double price)
{
System.out.println("wellcom to new paint");
System.out.println("colour"+colour);
System.out.println("price"+price);
}
public static void write(double cost)
{
System.out.println("read something");
System.out.println("cost"+cost);
}
public static void write(String source, String destination)
{
System.out.println("read something");
System.out.println("source"+source);
System.out.println("destination"+destination);
}
public static void main(String []args)
{
	System.out.println("read all books");
	Read.write("do");
	Read.write("java",22);
	Read.write("red",20);
	Read.write("ramayana");
	Read.write("shivmogga","chitradurga");
	}
}