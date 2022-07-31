package testPackage;

public class LoopEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num =2;
		
		while(num<=10) {
			if(num==6) {
				num = num+2;
				continue;
			}				
			System.out.println(num);
			num=num+2;
			//num++;
		}
			//num=num+2;
	
	
	// for loop
	
	for(int i=1;i<=10;i++) {
		if(i==6) {
			continue;
		}
System.out.println(i);
}
	int[] array1 = {10,20,30,40,50};
	
	for(int num1:array1) {   //for each loop can be used for array or list
		System.out.println(num1);
	}
	
}
	}


