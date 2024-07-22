class Bloodd
{
public static boolean group()
{
boolean group=true;
return group;

}
public static String personName()
{
String personName="Nisarga";
return personName;
}
public static int cost()
{
int cost=300;
return cost;
}
public static String hospitalTested()
{
String hospitalTested= "pals";
return hospitalTested;
}
public static boolean sicknessOrNot()
{
boolean sicknessOrNot=true;
return sicknessOrNot;
}
public static boolean donateOrNot()
{
boolean donateOrNot=false;
return donateOrNot;
}
public static void main(String[] args)
{
	System.out.println("enter a blood details");
	boolean group=Bloodd.group();
	System.out.println("personname runs in the group:"+group);
	String name=Bloodd.personName();
	System.out.println("personName runs in the group:"+name);
	int price=Bloodd.cost();
	System.out.println("cost runs in the group:"+price);
	String value=Bloodd.hospitalTested();
	System.out.println("hospitalTested in the group:"+value);
	boolean skin=Bloodd.sicknessOrNot();
	System.out.println("sicknessOrNot in the group:"+skin);
	boolean cells=Bloodd.donateOrNot();
	System.out.println("donateOrNot in the group:"+cells);
	
}
}