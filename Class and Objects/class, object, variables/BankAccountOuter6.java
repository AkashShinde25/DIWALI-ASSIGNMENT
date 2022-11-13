import java.lang.*;
import java.util.*;

class BankAccount{
	
	String nameOfAccountHolder;
	long accountNo;
	double balance;
	int interestRate;
	
	BankAccount(){
		
		
	}
	
	BankAccount(String nameOfAccountHolder, long accountNo, double balance, int interestRate){
		
		this.nameOfAccountHolder = nameOfAccountHolder;
		this.accountNo = accountNo;
		this.balance = balance;
		this.interestRate = interestRate;
		
	}
	
	void printAccountDetails(double totInterest){
		
		System.out.println("Name of the account holder is : "+nameOfAccountHolder);
		System.out.println("Account no is : "+accountNo);
		System.out.println("Balance in the account is : "+balance);
		System.out.println("Total interest per year is : "+totInterest);
		
	}
	
	class Interest{
		
		double calInterest(){
			
			double totInterest = ( balance * interestRate )/ 100;
			return totInterest;
			
		}
	}
	
}

class BankAccountOuter6{
	
	public static void main(String args[]){
		
		BankAccount ba1 = new BankAccount("Omkar", 123456, 20000, 7);
		
		BankAccount.Interest bai1 = ba1.new Interest();
		double res = bai1.calInterest();
		
		ba1.printAccountDetails(res);
		
	}
}