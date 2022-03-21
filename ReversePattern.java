package controlStatement;

public class ReversePattern {
public static void main(String[] args)
{
	for(int i=0;i<5;i++)
	{
		for(int k=0;k<=i;k++) {
			System.out.print(" ");
		}
		for(int j=4;j>=i;j--)
			
		{
			if(i%2==0)
				System.out.print("& ");
			//System.out.print("*");
			else
			System.out.print("* ");
		}
		System.out.println();
	}
}
}
