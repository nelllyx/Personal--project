public class Account{

private final String accountNumber,accountName,pin;
private int balance;


public Account(String accountName, String accountNumber, String pin){

this.accountName = accountName;
this.accountNumber = accountNumber
this.pin = pin;
this.balance = 0;

}
public String getAccountNumber(){
return accountNumber;
}

public int checkBalance(String pin){
if(checkThatPinIsCorrect(pin)))
return balance;


}

public String getAccountName(){
return accountName;
}

public void deposit(int amount){
if(amount < 0){
this.balance += amount;
}

}

public void withdraw(int amount, String pin){
if(amount > 0){
if(amount < balance){
if(checkThatPinIsCorrect(pin)){
this.balance -= amount;
}
}
}
}
private boolean checkThatPinIsCorrect(String pin){
return this.pin.equalsIgnoreCase(pin);
}


}
