package coe318.lab4;

public class Bank {
   /*instance variables*/
   private String name;
   private Account[] accounts;  //array of accounts managed by this account
   private int numAccounts;   //number of active accounts
   /*constructor*/
   public Bank(String name, int maxNumberAccounts) {
   	this.name=name;
   	accounts=new Account[maxNumberAccounts];
   	numAccounts=0;
   }
   public String getName() {   	//returns name
   	return name;
   }
   public Account[] getAccounts() {   	//returns array of accounts
   	return accounts;
   }
   public int getNumAccounts() {   	//returns number of accounts
   	return numAccounts;
   }
   /*checks whether account number is present or not in Bank*/
   public boolean hasAccountNumber(int accountNumber) {
   	for(int i=0;i<accounts.length;i++) {   	//loop in accounts array to check accountNumber presence
   		if(accounts[i]==null)
   			return false;
   		if(accounts[i].getNumber()==accountNumber) {   	//checks for equal accountNumber
   			return true;   	//accountNumber found
   		}
   	}
   	return false;	//no accountNumber found
   }
   /*adds an account to the Bank*/
   public boolean add(Account account) {
   	if(this.hasAccountNumber(account.getNumber())) {   	//checks whether bank already has that account
   		return false;
   	}
   	for(int i=0;i<accounts.length;i++) {   //loops accounts array to find space and add the account
   		if(accounts[i]==null) {
   			accounts[i]=account;
   			numAccounts++;
   			return true;   //successfully added account
   		}
   	}
   	return false;   //account not added
   }
   @Override
   public String toString() {
   	String s=getName()+": "+getNumAccounts()+" of "+getAccounts().length +" accounts open";
   	for(Account account:getAccounts()) {
   		if(account==null)
   			break;
   		s+="\n "+account;
   	}
   	return s;
   }  

  
}
