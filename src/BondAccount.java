/*
Create the BondAccount class.  The BondAccount class is a subclass of the SavingsAccount class.

The bond account works like a SavingsAccount class but has a 5 year maturity date.  It will have a larger interest rate
but will only be applied once a year. Also it must start with an amount.

PIV's

It will have one additional PIV int that tracks the years.
Constructor

The constructor should receive the name, interest rate and an amount to start the account off with.  You will need to
call the deposit method from the constructor to add the money in.  It should also set the PIV for years to 5.

Method

getTimeLeft() - will return the PIV that represents years left of the account

addInterest() - will override the method the method and subtract one year off when the method is called.

withdraw() - will override the method with will deduct a penalty amount for withdrawing before the end of the 5 years.
If they withdraw when it still has 5 years left it should take out and additional 25% of how much they are withdrawing.
So if they withdraw $100 it would take out $125.  Every year it will have a 5% smaller penalty till the number of years
reaches 0. So 4 years would be 20%, 3 years 15%, 2 years 10% and 1 year 5%. It is possible for years to be negative with
the way the program is written, so make sure anything smaller then zero no penalty is applied but the money is still
withdrawn.
 */

public class BondAccount extends SavingsAccount {
    private int yearsLeft;

    public BondAccount(String name, double interestRate, int amount) {
        super(name, interestRate);
        deposit(amount);
        yearsLeft = 5;
    }

    public int getTimeLeft() {
        return yearsLeft;
    }

    public void addInterest() {
        super.addInterest();
        yearsLeft--;
    }

    public void withdraw(double num) {
        if (yearsLeft <= 0) {
            super.withdraw(num);
        } else {
            super.withdraw(num * (1 + yearsLeft * 0.05));
        }
    }
}
