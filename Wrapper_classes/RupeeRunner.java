class RupeeRunner
{
public static void main(String [] args)
{
Rupee rupee=new Rupee();
int rupee1=rupee.price;
String rupee2=rupee.name;
double rupee3=rupee.amount;
rupee.price=30;
rupee.name="gandinote";
rupee.amount=500;
System.out.println("rupee priceupdate:"+rupee.price);
System.out.println("rupee priceupdate:"+rupee.name);
System.out.println("rupee priceupdate:"+rupee.amount);
System.out.println("rupee price:"+rupee1);
System.out.println("rupee name:"+rupee2);
System.out.println("rupee amount:"+rupee3);
System.out.println("update the rupee");

AirCondition airCondition=new AirCondition();
int airCondition1=airCondition.price;
String airCondition2=airCondition.name;
String airCondition3=airCondition.brand;
airCondition.price=80;
airCondition.name="philips";
airCondition.brand="onlin";
System.out.println("airCondition priceupdate:"+airCondition.price);
System.out.println("airCondition nameupdate:"+airCondition.name);
System.out.println("airCondition brandupdate:"+airCondition.brand);
System.out.println("airCondition price:"+airCondition1);
System.out.println("airCondition name:"+airCondition2);
System.out.println("airCondition amount:"+airCondition3);
System.out.println("update the airCondition");

Autoriksha autoriksha=new Autoriksha();
int autoriksha1=autoriksha.price;
String autoriksha2=autoriksha.name;
String autoriksha3=autoriksha.place;
autoriksha.price=80;
autoriksha.name="auto";
autoriksha.place="shivmogga";
System.out.println("autoriksha priceupdate:"+autoriksha.price);
System.out.println("autoriksha nameupdate:"+autoriksha.name);
System.out.println("autoriksha placeupdate:"+autoriksha.place);
System.out.println("autoriksha price:"+autoriksha1);
System.out.println("autoriksha name:"+autoriksha2);
System.out.println("autoriksha amount:"+autoriksha3);
System.out.println("update the autoriksha");

AutoDriver autoDriver=new AutoDriver();
int autoDriver1=autoDriver.age;
String autoDriver2=autoDriver.name;
double autoDriver3=autoDriver.amount;
System.out.println("autoDriver age:"+autoDriver1);
System.out.println("autoDriver name:"+autoDriver2);
System.out.println("autoDriver amount:"+autoDriver3);
System.out.println("update the autoDriver");

Rapido rapido=new Rapido();
int rapido1=rapido.price;
String rapido2=rapido.name;
double rapido3=rapido.amount;
System.out.println("rapido price:"+rapido1);
System.out.println("rapido name:"+rapido2);
System.out.println("rapido amount:"+rapido3);
System.out.println("update the rapido");

CabCompany cabCompany=new CabCompany();
int cabCompany1=cabCompany.price;
String cabCompany2=cabCompany.name;
String cabCompany3=cabCompany.place;
System.out.println("cabCompany price:"+cabCompany1);
System.out.println("cabCompany name:"+cabCompany2);
System.out.println("cabCompany place:"+cabCompany3);
System.out.println("update the cabCompany");

Bmtc bmtc=new Bmtc();
int bmtc1=bmtc.price;
String bmtc2=bmtc.place;
double bmtc3=bmtc.number;
System.out.println("bmtc price:"+bmtc1);
System.out.println("bmtc place:"+bmtc2);
System.out.println("bmtc number:"+bmtc3);
System.out.println("bmtc the bmtc");

FoodDeliveryCompany foodDeliveryCompany=new FoodDeliveryCompany();
int foodDeliveryCompany1=foodDeliveryCompany.amount;
String foodDeliveryCompany2=foodDeliveryCompany.companyName;
String foodDeliveryCompany3=foodDeliveryCompany.place;
System.out.println("foodDeliveryCompany amount:"+foodDeliveryCompany1);
System.out.println("foodDeliveryCompany companyName:"+foodDeliveryCompany2);
System.out.println("foodDeliveryCompany place:"+foodDeliveryCompany3);
System.out.println("update the foodDeliveryCompany");

}
}