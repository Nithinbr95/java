public class DecrementRunner{

public static void main(String args[]){
byte[] array = {87};
System.out.println("The values before decrement:"+array[0]);
for(int i=0;i<array.length;i--){
	array[i]--;

System.out.println("The value after decrement is:"+array[i]);
}
}

}
