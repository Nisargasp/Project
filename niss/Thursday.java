class Thursday
{
public static String week(String day)
{
System.out.println("select the day");
System.out.println("day:"+day);
if(day=="monday")
{
return "monday";
}
return "not found";
}
public static void main(String[]args)
{
System.out.println("print all days");
String value=Thursday.week("monday");
System.out.println("the day is:"+value);

}
}