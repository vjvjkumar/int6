package interviewPrograms;

import java.util.Scanner;

//Print or calculate the count total of Factorial? 5!=5*4*3*2*1=120
public class Scannerruntimefactorial {
	public static void main(String[] args) {
		
		System.out.println("Please enter a number: ");
		//scanner function will scan the input value
		
		Scanner in=new Scanner(System.in);
		int f=in.nextInt();
		int total=1;
		
		for(int i=f;i>=1;i--){
			total=total*i;
		}
		System.out.println(total);
	}
}
