class Fruitjuice
{
public static double price(String name)
{
System.out.println("enter the juice details");
System.out.println("name is:"+name);
if (name=="applejuice")
{
return 10;
}
if(name=="orangejuice")
{
return 20;
}
if(name=="papayajuice")
{
return 30;
}
if(name=="watermillonjuice")
{
return 15;
}
return 0;
}
public static void main(String[] args)
{
System.out.println("enter all type of juice");
double price=Fruitjuice.price("applejuice");
System.out.println("juice price is:"+price);
}
}