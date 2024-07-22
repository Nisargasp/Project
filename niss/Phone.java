class Phone
{
public static void battery()
{
System.out.println("its new phone");
}
public static void sim()
{
System.out.println("its new sim");
battery();
}
public static void number()
{
System.out.println("its new number");
}
public static void charger()
{
System.out.println("its new charger");
number();
}
public static void screen()
{
System.out.println("its new screen");
charger();
}
}