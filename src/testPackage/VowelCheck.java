package testPackage;

public class VowelCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Clean World Green World ";
		int count =0;
		for(int i=0;i<str.length();i++) {
			
			char ch = str.charAt(i);
			//System.out.println(ch);
			if(ch=='a' || ch=='e' || ch=='i'||ch=='o'||ch=='u') {
				count++;
			}
		}
		
		System.out.println("Vowel count is " + count);
	}
	}


