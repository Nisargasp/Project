class Speaker
{
int cost;
String brand;
char size;
boolean output=true;
public Speaker(char size)
{
this.size=size;
}

public void setCost(int cost)
{
this.cost=cost;
}
public void display()
{
System.out.println("the cost is:"+this.cost);
System.out.println("the size is:"+this.size);
System.out.println("the brand is:"+this.brand);
System.out.println("the output is:"+this.output);

}
}