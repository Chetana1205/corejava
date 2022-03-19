package controlStatement;

public class ArrayFindVowel {
public static void main(String[] args) {
	char[] chArray= {'a','b','c','d','e','f','g','h','i'};

	for(int i=0;i<=chArray.length;i++)
	{
	
	/*f(chArray[i]=='a'||chArray[i]=='e'||chArray[i]=='i'||chArray[i]=='o'||chArray[i]=='u')
	{
		System.out.println(chArray[i]);
	}*/
	if(i%2==0) {
		System.out.println(chArray[i]);
	}
}
}
}
