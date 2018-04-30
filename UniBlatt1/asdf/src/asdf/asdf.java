package asdf;

public class asdf {
	private int bankCode;
	private int[] accounts = new int[8];
	
	public asdf(int bankCode){
		this.bankCode = bankCode;
	}
	
	public int getBankCode(){
		return bankCode;
	}
	
	public int createAccount(int accountNumber){ 
		
		if(accountNumber==0){
			return accountNumber;
		}
		
		if(getIndexOfAccount(accountNumber)!=-1){
			return accountNumber;
		}
		
		for(int i = 0; i < accounts.length; i++){
			if(accounts[i]==0){
				accounts[i] = accountNumber;
				return i;
			}
		}
		
		return -1;
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
