package controlStatement;

public class PatternAlphabetwithnumber 
{
	public static void main(String[] args) {
		
	for(int i=0;i<5;i++)
	{
		char c='a';
		int a=1;
		for(int j=5;j>i;j--)
		{
			System.out.print(" ");
			
		}
		for(int k=0;k<=i;k++)
			
		{
			if(i%2==0)
			{
			System.out.print(a++ +" ");
			}
			else
			System.out.print(c++ +" ");
		}
		System.out.println();
	

}
}
}
