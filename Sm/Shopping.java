public class Shopping{
	
public static final double gst = 0.18;

public static void shoppingtype(String type){
System.out.println("The type of the Shopping is:"+type);
}

public static void gst(int price){
double total = Shopping.gst*price+price;
System.out.println("total price is:"+total);

}
public static void shoppingItem(String item){
	
	System.out.println("You shopped item is:"+item);
	
}
}