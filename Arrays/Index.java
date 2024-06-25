public class Index{
 public static void main(String args[]){
 String[] fruits = {"Apple","Grapes","Mango","Banana","Orange"};
 short[] price = {90,100,60,50,40};
 System.out.println("List of Fruits and Prices are:");
int val;
 for( val=0;val<fruits.length;val++){
	 for(val=0; val<price.length;val++){
  System.out.println("The fruit lists are:"+fruits[val]+":"+price[val]);
 }
 }
 }

}