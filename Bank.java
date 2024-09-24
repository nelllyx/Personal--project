public class Bank {

    private final ArrayList<Account> accounts = new ArrayList<>();
    private int noOfCustomers = 0;

    public void addCustomer(String customerName, String pin) {
    Account newAccount = new Account(acctName, acctNumber, pin, generateAcctNumber())
    String accountNumber = String.valueOf(generateAcctNumber())
    System.out.println("Account successfully created");
    accounts.add(newAccount);
    noOfCustomers++;
    }

    public void deposit(String acctNumber, int amount) {
    Account account = findAccountWith(acctNumber);
    if(account != null){
    account.deposit(amount);
    System.out.println("Money deposited successfully");
    }else{
    System.out.println("Invalid account details");
    }

    }

    public void transferFrom(String senderAcctNumber,String receiverAcctNumb,int amount,String pin) {

    Account account = findAccountWith(senderAcctNumber);
    Account account2 = findAccountWith(ReceiverAcctNumb);
    if(acount != null && account2 != null){
    account.withdraw(amount, pin);
    deposit(receiverAcctNumb,smount );
    }else{
    System.out.println("Invalid account details")
    }


        }

    public int checkBalanceFor(String acctNumber, String pin) {

    Acccount account = findAccountWith(acctNumber);
    if(account != null){
    int customerBalance = account.checkBalance(pin);
    System.out.println("Your account balance is " + customerBalance);
    }else{
    System.out.println("Account not found");
    }

    }

    public void withdrawFrom(String acctNumber, int amount, String pin) {

    Account account = findAccountWith(acctNumber);
    if(account != null){
     account.withdraw(amount,pin);
     System.out.println("Withdrawal successful");
    }else{
    System.out.println("Invalid account details");
    }
    }

    public int getNoOfCustomers() {
    return noOfCustomers;
    }

    private int generateAcctNumber() {

    }

    private Account findAccountWith(String accountNumber) {
    for(Account account: accounts){
    if(acccount.getAccountNumber() == accountNumber){
        return account
    }
    }
    return null;
    }
}
