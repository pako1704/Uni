package learning;

public class Bank {
	private int bankCode;
	private int[] accounts = new int[8];
	
	public Bank(int bankCode){
		this.bankCode = bankCode;
	}
	
	public int getBankCode(){
		return bankCode;
	}
	
	public boolean createAccount(int accountNumber){ 
		
		if(accountNumber==0){
			return false;
		}
		
		if(getIndexOfAccount(accountNumber)!=-1){
			return false;
		}
		
		for(int i = 0; i < accounts.length; i++){
			if(accounts[i]==0){
				accounts[i] = accountNumber;
				return true;
			}
		}
		
		return false;
	}
	
	public void printAccounts(){
		for(int i = 0; i < accounts.length; i++){
			if(accounts[i]!=0){
				System.out.println(i + ": " + accounts[i]);
			} else {
				System.out.println(i + ": Slot not used");
			}
		}
	}
	
	public boolean deleteAccount(int accountNumber){
		int i = getIndexOfAccount(accountNumber);
		if(i == -1){
			return false;
		}
		accounts[i] = 0;
		return true;
		
	}
	
	private int getIndexOfAccount(int accountNumber){
		for(int i = 0; i < accounts.length; i++){
			if(accounts[i]==accountNumber){
				return i;
			}
		}		
		return -1;
	}
	
	
	
	
	
	
	

}
