class Buy
{
public static void product(String brand, double price)
{
System.out.println("brand:"+brand);
System.out.println("price:"+price);
if(price>30 && price<60){
System.out.println("price is correct");}
else{
System.out.println("price is in-correct");
}
}
 public static void product(String name,int quantity,String quality,double price)
  {
    System.out.println("the product contains the details are");
	System.out.println("Name:"+name);
	System.out.println("Quantity:"+quantity);
	System.out.println("Quality:"+quality);
	System.out.println("Price:"+price);
	if(quantity>1 && quantity<7)
	 { 
	   System.out.println("the quantity is valid");
	 }
	 else
	 {
	   System.out.println("the quantity is invalid");
 }
	if(price>500 && price<2000)
	 { 
	   System.out.println("the price is valid");
	 }
	 else
	 {
	   System.out.println("the price is invalid");
	 }
  }
  
  public static void bookMovieTicket(String name,String theatreName ,int quantity,double price)
  {
    System.out.println("the bookMovieTicket contains the details are");
	System.out.println("Name:"+name);
	System.out.println("TheatreName:"+theatreName);
	System.out.println("Quantity:"+quantity);
	System.out.println("Price:"+price);
	if(quantity>1 && quantity<10)
	 { 
	   System.out.println("the quantity is valid");
	 }
	 else
	 {
	   System.out.println("the quantity is invalid");
	 }
	if(price>500 && price<1000)
	 { 
	   System.out.println("the price is valid");
}
	 else
	 {
	   System.out.println("the price is invalid");
	 }
  }
  
  public static void buyEgg(int total,double pricePerEgg)
  {
    System.out.println("the product contains the details are");
	System.out.println("Total:"+total);
	System.out.println("PricePerEgg:"+pricePerEgg);
	if(total>100 && total<500)
	 { 
	   System.out.println("the price is valid");
	 }
	 else
	 {
	   System.out.println("the price is invalid");
	 }
	 	if(pricePerEgg>4 && pricePerEgg<7)
	 { 
	   System.out.println("the pricePerEgg is valid");
	 }
	 else
	 {
	   System.out.println("the pricePerEgg is invalid");
	 }
  }
  
  public static void buyShampoo(int quantityInMi,double price ,String brand,String manfDate)
  {
    System.out.println("the bookMovieTicket contains the details are");
	System.out.println("QuantityInMi:"+quantityInMi);
	System.out.println("Price:"+price);
System.out.println("Brand:"+brand);
	System.out.println("ManfDate:"+manfDate);
	if(quantityInMi>1 && quantityInMi<10)
	 { 
	   System.out.println("the quantityInMi is valid");
	 }
	 else
	 {
	   System.out.println("the quantityInMi is invalid");
	 }
	if(price>500 && price<1000)
	 { 
	   System.out.println("the price is valid");
	 }
	 else
	 {
	   System.out.println("the price is invalid");
	 }
  }
  
  public static void buyCake(char size,String type,String flavour,double cost,int quantity)
  {
    System.out.println("the bookMovieTicket contains the details are");
	System.out.println("Size:"+size);
	System.out.println("Type:"+type);
	System.out.println("Flavour:"+flavour);
	System.out.println("Cost:"+cost);
	System.out.println("Quantity:"+quantity);
	if(cost>200 && cost<800)
	 { 
	   System.out.println("the cost is valid");
	 }
	 else
	 {
	   System.out.println("the cost is invalid");
 }
	 
  }
  
  public static void buyLaptop(String brand,int serialNo,double price,int batteryCapacity,double screensize,String os,int ramSize,int harddisksize)
  {
	System.out.println("Price:"+price);
	System.out.println("RamSize:"+ramSize);
	System.out.println("Brand:"+brand);
	System.out.println("SerialNo:"+serialNo);
	System.out.println("BatteryCapacity:"+batteryCapacity);
	System.out.println("Screensize:"+screensize);
	System.out.println("Os:"+os);
	System.out.println("RamSize:"+ramSize);
    System.out.println("Harddisksize:"+harddisksize);
    if(price<=40000&&price>0)
	{
    System.out.println("valid price");
	}
    else
	{
    System.out.println("invalid");
	}
	if(serialNo<=20&&serialNo>1)
	{
    System.out.println("valid serialNo");
	}
    else
	{
    System.out.println("invalid");
	}
  }
  
public static void buySmartWatch(String brand,double price,int color,char type,int mode)
 {
	System.out.println("Brand:"+brand);
	System.out.println("Price:"+price);
	System.out.println("Color:"+color);
	System.out.println("Type:"+type);
	System.out.println("Mode"+mode);
	if(price<=40000&&price>0)
	{
    System.out.println("valid price");
    }
	else
	{
      System.out.println("invalid");
    }
	if(color<=1&&color>6)
	{
    System.out.println("valid color");
    }
	else
	{
      System.out.println("invalid");
    }
 }

 
}