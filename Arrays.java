public class Arrays
{
public static void main(String[] args)
	{
	byte[] val= {1,2,3};
	int[] numbers = {1,2,3,4,5,6};
	short[] even_numbers = {10,20,40,60};
	long[] size = {100,200,300,400};
	float[] inches = {1.1f,1.2f,1.3f,1.4f,1.5f,1.6f,1.7f,1.8f};
	double[] square = {1.11,1.22,1.33,1.44,1.55,1.66};
	boolean[] correction = {true, false};
	char[] consonents = {'B','C','D','F','G','H'};
	String[] names = {"Nithin","Santhosh","Rajesh","Gowtham","Vinay"};
	
	
	System.out.println("The for loop values are:");
	for(int num=0 ; num<val.length ; num++)
		{
		System.out.println("The values are :"+num+":"+val[num]);
		} 
		for(int valu=0 ; valu<numbers.length ; valu++)
			{
			System.out.println("The numbers are :"+valu+":"+numbers[valu]);
			}
			for(int i=0 ; i<even_numbers.length ; i++)
				{
			    System.out.println("The even_numbers are :"+i+":"+even_numbers[i]);
				}
				for(int d=0 ; d<size.length ; d++)
					{
					System.out.println("The sizes are :"+d+":"+size[d]);
					}
					for(int e=0 ; e<inches.length ; e++)
						{
						System.out.println("The Inches are :"+e+":"+inches[e]);
						}
						for(int f=0 ; f<square.length ; f++)
							{
							System.out.println("The Square vales are :"+f+":"+square[f]);
							}
							for(int g=0 ; g<correction.length ; g++)
								{
								System.out.println("The Statement is either  :"+g+":"+correction[g]);
								}
								for(int h=0 ; h<consonents.length ; h++)
									{
									System.out.println("The Consonents are :"+h+":"+consonents[h]);
									}
									for(int j=0 ; j<names.length ; j++)
										{
										System.out.println("The names are :"+j+":"+names[j]);
										}
	}
}