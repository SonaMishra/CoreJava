package testPackage;

public class EvenNUmberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 9;
		boolean flag=true;
		
		for(int index=2;index<num;index++) {
			
			int rem = num%index;
			
			if(rem==0) {
				
				System.out.println("Num is not Prime");
				flag = false;
				break;
			}
			
		}
		
		if(flag==true) {
			System.out.println("Num is Prime");
		}
	}

}
