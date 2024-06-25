public class Bikes{
 public static void main(String args[]){
 String[] bike_names = {"Honda","Activa","Bajaj","TVS","Olo"};
 int[] price = {90000,60000,70000,80000,45000};
 System.out.println("List of Bikes and Prices are:");
int val;
 for( val=0;val<bike_names.length;val++){
	 for(val=0; val<price.length;val++){
  System.out.println("The Bike lists are:"+bike_names[val]+":"+price[val]);
 }
 }
 }
}