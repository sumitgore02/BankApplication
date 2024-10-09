import java.util.*;
class BankApp
{
	static String username;
	static int pin;
	static long mobileno;
	static long adharno;
	static String address;
	static String panno;
	static double bal;
	final static long accountno = 72210015;
	final static String ifsccode = "BKID000720";
	static ArrayList<String> statement = new ArrayList<>();
	
	
	public static void welcome(Scanner sc)
	{
		for( ; ; ){
			System.out.println("***** WELCOME IN KING BANK*****");
			System.out.println();
			System.out.println("1. Existing Account");
			System.out.println("2. Create New Account");
			System.out.println();
			System.out.println("Enter A Option: ");
			int opt=sc.nextInt();
			
			switch(opt)
			{
				case 1:{
					login(sc);
					break;
				}
				case 2:{
					createAccount(sc);
					break;
				}
				default :{
					System.out.println("Enter A Valid Option!!!");
				}
				
			}
		}
	}
	
	public static void createAccount(Scanner sc)
	{		
		System.out.println();
		System.out.println("***** Welcome In Account Creation Module*****");
		System.out.println(" ");
		
		System.out.println("Enter A User Name: ");
		username = sc.next();
		System.out.println(" ");
		
		System.out.println("Enter A Mobile Number: ");
		mobileno = sc.nextLong();
		System.out.println(" ");
		
		System.out.println("Enter A Adhar Number: ");
		adharno = sc.nextLong();
		System.out.println(" ");
		
		System.out.println("Enter A Pan Card Number: ");
		panno = sc.next();
		System.out.println(" ");
		
		System.out.println("Enter A Residental Address: ");
		address = sc.next();
		System.out.println(" ");
		
		System.out.println("Enter A Pin: ");
		pin = sc.nextInt();
		System.out.println(" ");
	
		System.out.println("Enter A Amount Which You Want To Deposit In Bank Account: ");
		bal = sc.nextInt();
		statement.add("Deposit: "+bal);
		
		System.out.println();
		System.out.println("Account Created Sucessfully!!!");
		System.out.println();
	}
	
	public static void login(Scanner sc)
	{		
			if(username!=null)
			{
				for(int i=1;i<=3;i++){
				System.out.println();
				System.out.println("*****Welcome In Login Module*****");
				System.out.println();
				
				System.out.println("Enter A Mobile Number: ");
				long mobile = sc.nextLong();
				
				System.out.println("Enter A Pin: ");
				int pin1 = sc.nextInt();
				
				if((mobileno==mobile)&&(pin==pin1))
				{
					homepage(sc);
				}
				else
				{
					System.out.println("Enter A Valid Credential!!!");
				}
			}
			System.exit(0);
		}
		else
		{
			System.out.println();
			System.out.println("Create Account First!!!");
			System.out.println();
		}

	}
	
	public static void homepage(Scanner sc)
	{		
		for( ; ; )
		{			
			System.out.println();
			System.out.println("*****Welcome In Home Page Module*****");
			System.out.println(" ");
			
			System.out.println("1. Deposit Amount");
			System.out.println("2. Withdraw Amount");
			System.out.println("3. Check Balance");
			System.out.println("4. Statement");
			System.out.println("5. Edit Profile");
			System.out.println("6. logout");
			System.out.println();
			System.out.println("Enter A Option: ");
			int opt=sc.nextInt();
			
			switch(opt)
			{				
				case 1:{
					deposit(sc);
					break;
				}
				case 2:{
					withdraw(sc);
					break;
				}
				case 3:{
					checkbalance(sc);
					break;
				}
				case 4:{
					statement();
					break;
				}
				case 5:{
					editprofile(sc);
					break;
				}
				case 6: {
					System.out.println("*******Thank You For Visting King Bank*******");
					System.exit(0);
				}
				default:{
					System.out.println("Enter Valid Option!!!");
				}
			}
		}
	}
	
	public static void deposit(Scanner sc)
	{
		System.out.println("*****Deposit Amount*****");
		System.out.println();
		
		System.out.println("Enter A Amount: ");
		double depositAmount=sc.nextDouble();
		
		bal +=depositAmount;
		statement.add("Deposit: "+depositAmount);
		
		System.out.println(" ");
		System.out.println("Amount Deposited Sucessfully!!!");
	}
	
	public static void withdraw(Scanner sc)
	{		
		for(int i=1;i<=3;i++)
		{			
			System.out.println();
			System.out.println("*****Withdraw Amount*****");
			System.out.println(" ");
			
			System.out.println("Enter A Amount: ");
			double withamount=sc.nextDouble();
			
			System.out.println("Enter A Pin: ");
			int pin1=sc.nextInt();
			
			if(pin==pin1)
			{
				if(withamount<=bal)
				{
					bal-=withamount;
					statement.add("Amount Withdraw: "+withamount);
					System.out.println("Amount Withdraw Sucessfully!!!");
				}
				else
				{
					System.out.println("Insufficient Funds!!!");
				}
				return ;
			}
			else
			{
				System.out.println();
				System.out.println("Enter A Valid Pin!!!");
			}	
		}
		System.out.println();
		System.out.println("Your Account Is Deactivated For 24 Hours!!!");
		System.exit(0);
	}
	
	public static void checkbalance(Scanner sc)
	{
		for(int i=1;i<=3;i++)
		{
			System.out.println();
			System.out.println("*****Check Balance*****");
			System.out.println();
			
			System.out.println("Enter A Pin: ");
			int pin1=sc.nextInt();
			
			if(pin==pin1)
			{
				System.out.println();
				System.out.println("Your Account Balance Is "+bal+"rs ");
				return;
			}
			else
			{
				System.out.println();
				System.out.println("Enter Valid Pin!!!");
			}
		}	
		System.out.println();
		System.out.println("Your Account Deactivated For 24 Hours!!!");
		System.exit(0);
	}
	
	public static void statement()
	{
		System.out.println("*****Bank Statement*****");
		System.out.println();
		System.out.println(statement);
		
	}
	
	public static void editprofile(Scanner sc)
	{		
		System.out.println();
		System.out.println("*****Edit Profile*****");
		System.out.println();
		
		System.out.println("1. User Name");
		System.out.println("2. Mobile Number ");
		System.out.println("3. Adhar Number ");
		System.out.println("4. Pan Card Number ");
		System.out.println("5. Residental Address ");		
		System.out.println("6. Pin ");
		System.out.println("7. Back To Home Page ");
	
		System.out.println();
		System.out.println("Enter A Option Which You Want To Update: ");
		int opt = sc.nextInt();
		
		switch(opt)
		{			
				case 1: {
					System.out.println("Enter A New User Name: ");
					String username1=sc.next();
					System.out.println("Enter A Pin: ");
					int pin1=sc.nextInt();
					
					if(pin==pin1)
					{
						username=username1;
						System.out.println("User Name Updated Sucessfully!!!");
					}
					else
					{
						System.out.println();
						System.out.println("Enter A Valid Pin!!!");
					}
					break;
				}
				case 2: {
					System.out.println("Enter A New Mobile Number: ");
					long mobile=sc.nextLong();
					System.out.println("Enter A Pin: ");
					int pin1=sc.nextInt();
					
					if(pin==pin1)
					{
						mobileno=mobile;
						System.out.println("Mobile Number Updated Sucessfully!!!");
					}
					else
					{
						System.out.println();
						System.out.println("Enter A Valid Pin!!!");
					}
					break;
				}
				case 3: {
					System.out.println("Enter A New Adhar Number: ");
					long adhar=sc.nextLong();
					System.out.println("Enter A Pin: ");
					int pin1=sc.nextInt();
					
					if(pin==pin1)
					{
						adharno=adhar;
						System.out.println("Adhar Number Updated Sucessfully!!!");						
					}
					else
					{
						System.out.println();
						System.out.println("Enter A Valid Pin!!!");
					}
					break;
				}
				case 4: {
					System.out.println("Enter A New Pan Number: ");
					String pan=sc.next();
					System.out.println("Enter A Pin: ");
					int pin1=sc.nextInt();
					
					if(pin==pin1){
						panno=pan;
						System.out.println("Pan Number Updated Sucessfully!!!");						
					}
					else
					{
						System.out.println();
						System.out.println("Enter A Valid Pin!!!");
					}
					break;
				}
				case 5: {
					System.out.println("Enter A New Residental Address: ");
					String address1=sc.next();
					System.out.println("Enter A Pin: ");
					int pin1=sc.nextInt();
					
					if(pin==pin1){
						address=address1;
						System.out.println("Residental Address Updated Sucessfully!!!");						
					}
					else
					{
						System.out.println();
						System.out.println("Enter A Valid Pin!!!");
					}
					break;
				}
				case 6: {
					System.out.println("Enter A New Pin: ");
					int pin1=sc.nextInt();
					System.out.println("Enter A Mobile Number: ");
					long mobile =sc.nextLong();
					
					if(mobile==mobileno){
						pin=pin1;
						System.out.println("Pin Updated Sucessfully!!!");						
					}
					else
					{
						System.out.println();
						System.out.println("Enter A Valid Mobile Number!!!");
					}
					break;
				}
				case 7: {
					return;
				}
				default:{
					System.out.println("Enter A Valid Option!!!");
				}
		}
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
			welcome(sc);
	}
}
