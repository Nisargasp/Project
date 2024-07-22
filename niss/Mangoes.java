class Mangoes
{
public static void sweetness()
{
	System.out.println("mango is sweetness");
	sour();
	size();
}
public static void sour(){
	System.out.println("mango is sour");
	size();
	type();
}
public static void size(){
	System.out.println("mango is big");
	sour();
	type();
}
public static void type(){
	System.out.println("mango is Indian ");
}
public static void origin(){
	System.out.println("mango is western Ghat");
}
 public static void main(String[]args){
	 Mangoes.sour();
}
}