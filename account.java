//IMPORT LIBRARIES TO USE FOR MATHAMETICAL FUNCTIONS
import java.util.*;
import java.lang.*;

	class Account{
		public String customer_name;
		public double account_number;
		public int account_type;
		public double balance;
		
		public void getdata(String name, double no, int type, double bal){
			customer_name = name;
 			account_number = no;
 			account_type = type;
 			balance = bal;
 		}
	}
	
	//CREATE A SAV_ACCT CLASS
	class Sav_acct extends Account{
		//CREATE A METHOD OR FUNCTION TO CALCULATE COMPOUND INTEREST USING THE MATH.POW FUNCTION
		public void interest(int t, double r, int n){
			double intrst = balance * Math.pow(1 + (r / n), n * t);
			System.out.println("Compound Interest: " + intrst);
			balance = balance + intrst;
			System.out.println("New Balance: " + balance);
		}
		//CREATE A METHOD OR FUNCTION TO CALCULATE BALANCE AFTER WITHDRAWAL 
		public void withdraw(double amount){
			balance = balance - amount;
			System.out.println("New Balance: " + balance);
		}
		//CREATE A METHOD OR FUNCTION TO CALCULATE BALANCE AFTER DEPOSIT 
		public void deposit(double amount){
			balance = balance + amount;
			System.out.println("New Balance: " + balance);
		}		
 	}
 	//CREATE A CURR_ACCT CLASS
 	class Curr_acct extends Account{
 		//CREATE A METHOD OR FUNCTION TO CALCULATE BALANCE AFTER DEPOSIT
		public void deposit(double amount){
			balance = balance + amount;
			System.out.println("New Balance: " + balance);
		}
		//CREATE A METHOD OR FUNCTION TO CALCULATE BALANCE AFTER WITHDRAWAL
		public void withdraw(double amount){
			balance = balance - amount;
			System.out.println("New Balance: " + balance);
		} 
	}
	//CREATE THE MAIN CLASS WHERE ALL OUTTER CLASS FUNCTIONS CAN BE EXECUTED
	class Main{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			double amount = 0;

			//REQUEST FOR USER DETAILS
			System.out.print("Enter Customer Name: ");
			sc.next();
			String name = sc.nextLine();
			
			System.out.print("Enter Account Number: ");
			double no = sc.nextDouble();
			
			System.out.println("0: Savings");
			System.out.println("1: Current\n");
			System.out.print("Select Account Type: ");

			int type = sc.nextInt();
			//REQUEST FOR A PRINCIPAL VALUE REQUIRED FOR COMPOUND INTEREST CALCULATION (IN THE FORM OF CUSTOMER ACCOUNT BALANCE)
			do{
				System.out.print("Enter Balance: ");
				amount = sc.nextDouble();
			}
			while(type == 0 && type == 1 && amount < 10000);
			//EXECUTE THIS CODE IF USER SELECTS 0 FOR SAVINGS ACCOUNT
			if(type == 0){
				Sav_acct s = new Sav_acct();
				s.getdata(name, no, type, amount);
				
				System.out.println("1. Deposit");
				System.out.println("2. Withdraw");
				System.out.println("3. Interest");
					
				int temp3 = sc.nextInt();

				//CONDITION MET IF USER SELECTS 2 FOR BALANCE AFTER WITHDRAWAL
				if(temp3 == 1){
					System.out.print("Enter Amoumt: ");
					double amount1 = sc.nextDouble();
					s.deposit(amount1);
				}
				//CONDITION MET IF USER SELECTS 2 FOR BALANCE AFTER WITHDRAWAL			
				else if(temp3 == 2){
					System.out.print("Enter Amoumt: ");
					double amount1 = sc.nextDouble();
					s.withdraw(amount1);
				}
				//CONDITION MET IF USER SELECTS 3 FOR COMPUND INTEREST CALCULATION			
				else if(temp3 == 3){
					System.out.print("Enter Interest Time Period (in years): ");
					int tp = sc.nextInt();
					System.out.print("Enter Interest Rate (in decimal): ");
					double inr = sc.nextDouble();
					System.out.print("Enter Number of Compounds: ");
					int nof = sc.nextInt();
					s.interest(tp, inr, nof);
				}
			}
			//EXECUTE THIS CODE IF USER SELECTS 1 FOR CURRENT ACCOUNT
			else if(type == 1){
				Curr_acct c = new Curr_acct();
				c.getdata(name, no, type, amount);

				System.out.println("1. Deposit");
				System.out.println("2. Withdraw");
				int temp3 = sc.nextInt();
				//CONDITION IF USER USER SELECTS 1 FOR DEPOSIT
				if(temp3 == 1){
					System.out.print("Enter Amoumt: ");
					double amount1 = sc.nextDouble();
					c.deposit(amount1);
				}
				//CONDTION IF USER SELECTS 2 FOR WITHDRAWAL
				else if(temp3 == 2){
					System.out.print("Enter Amoumt: ");
					double amount1 = sc.nextDouble();
					c.withdraw(amount1);
				}
			}
	}
}