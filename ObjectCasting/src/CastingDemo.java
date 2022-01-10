
public class CastingDemo {

	private static void impicitCasting(){
		NRIAccount O1=new NRIAccount();
		BankAccount V1;
		V1=O1;
		V1.applyFixedDeposit();
	}
	
	private static void explicitCasting(){
		BankAccount O1=new NRIAccount();
		NRIAccount V1;
		O1.depositAmount=3500;
		V1=(NRIAccount) O1;
		V1.depositMoney();
	}
	
	private static void tryInstaceOf(){
		BankAccount O1 = new NRIAccount();
		BankAccount O2 = new NRIAccount();
		BankAccount O3 = new SeniorCitizenAccount();
		if(O1 instanceof NRIAccount){
			System.out.println("Can typecast O1 to NRIAccount");
			O1=O2;
		}else{
			System.out.println("Cannot typecast O1 to NRIAccount");
		}
		if(O3 instanceof NRIAccount){
			System.out.println("Can typecast O3 to NRIAccount");
			O3=O2;
		}else{
			System.out.println("Cannot typecast O3 to NRIAccount");
		}
	}
		
	public static void main(String[] args) {
		implicitCasting();
		explicitasting();
		tryInstanceOf();

	}

}
