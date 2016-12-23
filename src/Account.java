/**
 * Created by Yunus Emre on 25.11.2016.
 */
public class Account implements Cloneable {

    private int id; // refer to the account number
    private double balance; // refer to the amount of money in the account


    // constructor method of Class initiliaze id and balance
    public Account(int accountId,double accountBalance){
        setId(accountId);
        setBalance(accountBalance);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void depositMoney(double deposit) throws NegativeAmountException{

        if(deposit <= 0){

            throw new NegativeAmountException();

        }else{

            this.balance += deposit;

        }
    }
    public void withdrawMoney(double withDraw) throws NegativeAmountException,InsufficientFundException{

        if(this.balance <= withDraw)
            throw new InsufficientFundException();
        else if(withDraw <= 0){
            throw new NegativeAmountException();
        }else {

            balance -= withDraw;

        }

    }

    @Override
    public String toString() {
        return String.format("\n%s: %d \n%s: %.2f","Account ID",this.id,
                "Balance:",this.balance);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }


}
