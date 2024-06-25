public class Color{

public static void main(String args[]){

String color[] = {"Red","Black","Blue","Yellow","Green"};
long code_decimal[] = {255,0,255,255,255};
int cut;
for(cut=0;cut<color.length;cut++){
 for(cut=0;cut<code_decimal.length;cut++)
 System.out.println("The color is:"+color[cut]+"code is:"+code_decimal[cut]);

}

}

}