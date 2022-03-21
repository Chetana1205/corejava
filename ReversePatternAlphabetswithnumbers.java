package controlStatement;

public class ReversePatternAlphabetswithnumbers {
	public static void main(String[] args)
	{
		for(int i=0;i<5;i++)
	
		{
			int a=1;
			char c='a';
			
			for(int k=0;k<=i;k++) {
				System.out.print(" ");
			}
			for(int j=4;j>=i;j--)
				
			{
				if(i%2==0)
					System.out.print(a++ +" ");
				//System.out.print("*");
				else
				System.out.print(c++ +" ");
			}
			System.out.println();
		}
	}
	}


