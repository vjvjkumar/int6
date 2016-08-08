package interviewPrograms;
//Find out the greatest and lowest value in an array?

public class Greater_LowerVJvalues 
{
	public static void main(String[] args)
{
		int num[] = new int[]{45,67,89,206,56,97,320,10,89,43};
		
		int high=num[0];
		int low=num[0];
		
		for (int i=0; i<=9; i++)
		{
			if(high<num[i])
			{
			high=num[i];
			}else 
			if (low>num[i])
			{		
			low=num[i];
			}
		}
		System.out.println("Greater value is: "+high);
		System.out.println("Lower value is: "+low);
}
}


