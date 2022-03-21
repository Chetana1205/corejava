package controlStatement;

public class PatternWithNumbersAndAlphabets {

	public static void main(String[] args) 
	{
		for(int i=0;i<5;i++)
		{
			int a=1;
			char c='a';
			for(int j=0;j<5;j++)
			{
				if(i%2==0) {
				System.out.print(c+++" ");
				}
				else
					System.out.print(a+++" ");
			}
			System.out.println();		}
	}

}


