import java.util.Scanner;
class AtmManagementSystem{
	static int pin=8674;
	public static void main(String[] args) {
		int amount=5000,dpt,amt;
		Scanner sc=new Scanner(System.in);
		System.out.println("                           ___________________________________ATM Management System________________________________");
		System.out.print("Enter First Four Digit of Your Card: ");
		int cdn=sc.nextInt();
		while(cdn>6){
			cdn=cdn/10;
		}
		if(cdn!=1 || cdn!=2 || cdn==3 || cdn!=7 || cdn!=8 || cdn!=9 || cdn!=0){
			if(cdn==4)
			System.out.print("This is a VISA Debit Card\n");
		else if(cdn==5)
			System.out.print("This is a Mastercard Debit Card\n");
		else 
			System.out.print("This is a RuPay Debit Card\n");
		// else
		// 	System.out.print("This is other type of Debit Card\n");
		System.out.print("Enter PIN: ");
		pin=sc.nextInt();
		if(pin==8674){
			loop:while(true){
				System.out.println("\n                           *******************************Choose an Option to Continue******************************");
				System.out.println("1. Withdrawal");
				System.out.println("2. Deposit");
				System.out.println("3. Balance Inquiry");
				System.out.println("4. Exit");
				System.out.print("Choice The Option You Want to Perform: ");
				int ch=sc.nextInt();
				switch(ch){
				case 1:
					System.out.print("Enter Amount: ");
						amt=sc.nextInt();
						if(amount>=amt){
							amount=amount-amt;
							System.out.println("Please Collect Your Money");
						}
						else
							System.out.println("You don't have Enough Money in Your Account.");
					break;
				case 2:
					System.out.print("How much Money do you want to Deposit in the Account: ");
					dpt=sc.nextInt();
					System.out.println("Your money has been deposited successfully");
					amount=amount+dpt;
					break;
				case 3:
					System.out.print("Available Balance: "+amount);
					break;
				case 4:
					break loop;
				default :
					System.out.println("Invalid Input");
				}
			}
		}
		else
			System.out.println("Invalid PIN");		
		}
		// else
		// 	System.out.print("Reenter\n");
	}
}



// System.out.print("Enter PIN: ");
// 			pin=sc.nextInt();
// 			if(pin==8674){
				
// 			}
// 			else
// 				System.out.println("Invalid Input");