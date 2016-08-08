package interviewPrograms;

// print or calculate the factorial count of 8 numbers 8! =8*7*6*5*4*3*2*1 = 40320

public class FactorialCountVJ {
	public static void main(String[] args){
		
		int f=8;
		int total=1;
		
		for (int i=f; i>=1; i--){
			total=total*i;
		}
			System.out.println("Total of Factorial 8! is: "+total);
		
		}

		
		
}
