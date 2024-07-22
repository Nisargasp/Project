class Paint
{
public static void nisarga(String brand)
{
System.out.println("wellcom to new paint");
System.out.println("brand"+brand);
}
public static void nisarga(String brand, String colour)
{
System.out.println("wellcom to new paint");
System.out.println("brand"+brand);
System.out.println("colour"+colour);
}
public static void nisarga(String colour,String type, double price)
{
System.out.println("wellcom to new paint");
System.out.println("colour"+colour);
System.out.println("type"+type);
System.out.println("price"+price);
}
public static void main(String []args)
{
	System.out.println("select all deatials");
Paint.nisarga("dulux");
Paint.nisarga("nerolac","blue");
Paint.nisarga("asianpaint","red",250);
}
}
