package vdxfgs;

public class Bank {
    private int bankCode;
    public Account[] accounts = new Account[8];

    public Bank(int bankCode) {
        this.bankCode = bankCode;
    }

    public void printAllAccounts() {
        System.out.println("Länge: " + accounts.length + " Bankleitzahl: " + bankCode);
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                System.out.println(i + ":    empty");
                continue;
            }
            System.out.println(i + ":    " + accounts[i].getAccountNumber() + "    |    " + accounts[i].getBalance() + "€");
        }
    }

    public int createAccount(int accountNumber) {
        /*
         * int isInUse = getIndexOfAccountNumber(accountNumber);
         * if(isInUse!=-1){ accounts[isInUse] = new Account(accountNumber,
         * bankCode); return isInUse; }
         */
        int index = makeAccount(accountNumber);
        if (index != -1) {
            return index;
        }
        resizeAccounts(1);
        return makeAccount(accountNumber);
    }

    private int makeAccount(int accountNumber) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                accounts[i] = new Account(accountNumber, bankCode);
                return i;
            }
        }
        return -1;
    }

    private int getIndexOfAccountNumber(int accountNumber) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] != null && accounts[i].getAccountNumber() == accountNumber) {
                return i;
            }
        }
        return -1;
    }

    public boolean removeAccount(int accountNumber) {
        int index = getIndexOfAccountNumber(accountNumber);
        if (index != -1) {
            accounts[index] = null;
            resizeAccounts(0);
            return true;
        }
        return false;
    }

    private void resizeAccounts(int additionalSlots) {
        int slotsInUse = additionalSlots;
        int newArraySize = 8;
        Account[] accountsCache = new Account[accounts.length];
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] != null) {
                slotsInUse++;
            }
        }

        while (slotsInUse > newArraySize) {
            newArraySize *= 2;
        }

        int ii = 0;
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] != null) {
                accountsCache[ii] = accounts[i];
                ii++;
            }
        }

        accounts = new Account[newArraySize];
        
        for (int i = 0; i < accountsCache.length; i++) {
            accounts[i] = accountsCache[i];
        }
    }

    public boolean containsAccount(int accountNumber) {
        if(getIndexOfAccountNumber(accountNumber)==-1){
            return false;
        }
        return true;
    }

    public boolean internalBankTransfer(int fromAccountNumber, int toAccountNumber, int amount) {
        int fromAccountNumberIndex = getIndexOfAccountNumber(fromAccountNumber);
        int toAccountNumberIndex = getIndexOfAccountNumber(toAccountNumber);
        
        if(    accounts[fromAccountNumberIndex].getBankCode() != this.bankCode || 
            accounts[toAccountNumberIndex].getBankCode() != this.bankCode ){
            return false;
        }
        
        if(!accounts[fromAccountNumberIndex].withdraw(amount)){
            return false;
        }
        
        accounts[toAccountNumberIndex].deposit(amount);
        
        return true;
    }
    
    public int length(){
        return this.accounts.length;
    }
    
    public int size(){
        int counter = 0;
        for(int i = 0; i < accounts.length; i++){
            if(accounts[i]!=null){
                counter++;
            }
        }
        return counter;
    }
    public Account getAccount(int index){
        if(index > accounts.length - 1){
            return null;
        }
        return accounts[index];
    }
}