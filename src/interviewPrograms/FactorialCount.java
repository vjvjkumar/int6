package interviewPrograms;
//Print or calculate the count total of Factorial? 5!=5*4*3*2*1=120
public class FactorialCount {
	public static void main(String[] args) {
		int f=5;
		int total=1;
		
		for(int i=f;i>=1;i--){
			total=total*i;
		}
		System.out.println(total);
	}
}
