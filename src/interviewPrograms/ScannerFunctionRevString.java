package interviewPrograms;

import java.util.Scanner;

//PRint a string in the reverse order? Ex: selenium  output: muineles

public class ScannerFunctionRevString {
	public static void main(String[] args) {
		
		System.out.println("Please enter a string: "); //scanner function will scan the input String
		
		Scanner in=new Scanner(System.in);
		String str = in.next();
		
		System.out.println("Total chars: "+str.length());
		
		for(int i=str.length()-1;i>=0;i--){
			System.out.print(str.charAt(i));
		}		
	}

}
