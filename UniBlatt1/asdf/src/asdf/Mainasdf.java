package asdf;

public class Mainasdf {
	public static void main(String[] args){
		
		asdf sparkasse = new asdf(2145153);
		sparkasse.createAccount(3);
		sparkasse.createAccount(2);
		sparkasse.createAccount(1);
		sparkasse.deleteAccount(4);
		sparkasse.createAccount(1);
		sparkasse.createAccount(2);
		sparkasse.printAccounts();
		
	}

}
