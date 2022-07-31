package testPackage;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 987654;
	int res=0;
		while(num>0) {
			
			int rem= num%10;
			res= res*10+rem;
			num= num/10;
		}
		System.out.println("result is " +res);
		
		String str= "I am Happy";
		
		String result="";
		
		for(int index = str.length()-1; index>=0; index--) {
			char ch= str.charAt(index);
			result= result + ch;
		}
		
		System.out.println(result);
	}
	

}

