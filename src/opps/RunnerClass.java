package opps;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Employee E1 = new Employee();
			
			E1.Name = "Mike";
			E1.EmpId = 1000;
			E1.Department = "HR";
			E1.Display();
			
			//System.out.println(E1.Name);
			//System.out.println(E1.EmpId);
			//System.out.println(E1.Department);
			
			Employee E2 = new Employee("Jack", 1001, "Finance");
			
//			E2.Name = "Jack";
//			E2.EmpId = 1001;
//			E2.Department = "Finance";
			E2.Display();
			
			Bank B = new Bank();
			B.DisplayBalance();
			
			int Bal = B.GetBalance();
			System.out.println("The Balance is " +Bal);
			System.out.println("The Balance is " +B.GetBalance());
			
			BOABank B1 = new BOABank();
			B1.CCBalance();
			B1.DisplayBalance();
			B1.AccountNum = 100;
			
			OverloadingExam obj = new OverloadingExam();
			int RecArea = obj.GetArea(3,4);
			int SqArea = obj.GetArea(4);
			System.out.println(RecArea);
			System.out.println(SqArea);
			
			B1.CloseAccount(123456);
			B.CloseAccount(123456);
			
			Chrome ch = new Chrome();
			ch.OpenBrowser();
			
			Browser Br = new Chrome(); // to create object for abstract class
			
			Br.OpenBrowser();
			Br.CloseBrowser();
			Br.DisplayName();
			
			HondaCar car1 = new HondaCar();
			
			CarInterface car2 = new HondaCar();
			
			EncapsulationEx En = new EncapsulationEx();
			
			En.setBalance(3000);
			System.out.println(En.getBalance());
		}
        
	}

