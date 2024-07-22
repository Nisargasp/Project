class JuiceRunner
{
public static void main(String[] juiceInfo)
{
if(juiceInfo.length==5)
{
String name=juiceInfo[0];
String brand=juiceInfo[1];
String flavour=juiceInfo[2];
String price=juiceInfo[3];
String quantity=juiceInfo[4];
int convertedPrice=Integer.parseInt(price);
float convertedBrand=Float.parseFloat(brand);
Juice1.info(name,convertedBrand,flavour,convertedPrice,quantity);
}
else{
 System.out.println("the details");
}
}
}