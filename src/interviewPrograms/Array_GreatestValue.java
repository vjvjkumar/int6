package interviewPrograms;

public class Array_GreatestValue 
{
	public static void main (String[] args) 
{
		int numArray[] = new int[] {13, 14, 16, 26, 97, 47, 86, 64, 32};
		
		int high = numArray[0];
		
		for (int i=0; i<=8; i++)
		{
			if (high<numArray[i])
			{
			high = numArray[i];
			}
		}		
		System.out.println("The Greatest value of the Array is: "+high);
}
}
	
	

