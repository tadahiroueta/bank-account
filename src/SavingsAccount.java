/*
Now complete the SavingsAccount class.  The SavingsAccount class is a subclass of the BankAccount class.

A savings account works like a regular bank account, but earns a small bit of interest every month.

Create the following additional PIV

It should have a double to store the interest rate of the account.
Constructor

Should only have 1 constructor that receives the name of the account owner and the interest rate.

Methods

addInterest() - This method will need to make calls to the super class to figure out how much interest the account
earned, then add it back into the account.
 */

public class SavingsAccount extends BankAccount {
    private final double interestRate;

    public SavingsAccount(String name, double interestRate) {
        super(name);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        deposit(getAmount() * (interestRate / 100));
    }
}
