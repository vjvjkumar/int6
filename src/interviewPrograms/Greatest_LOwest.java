package interviewPrograms;
//Find out the greatest and lowest value in an array?
public class Greatest_LOwest {
	public static void main(String[] args) {
		
		int num[] = new int[]{12,32,53,90,67,100,47,78};
		
		int high=num[0];
		int low=num[0];
		
		for(int i=0;i<=7;i++){
			if(high<num[i]){
				high=num[i];
		
			}else if(low>num[i]){
				low=num[i];
			}
		}
		System.out.println("Greatest value: "+high);
		System.out.println("Lowest value: "+low);		
	}

}
