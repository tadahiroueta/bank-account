/* First you going to create a BankAccount Class

It will have two PIV's

A String to store the name of the account owner.
A double to store the dollar amount of the account.
Constructor:

The constructor will only receive the name of the account owner and set the amount in the account to 0.

Methods:

getName() - will return the name of the account owner

getAmount() - will return the amount in the account.

withdraw(double num) - will subtract the parameter num from the amount in the account. Will not return anything.

deposit(double num) - will add this parameter num to the amount in the account. Will not return anything.

toString() - will return a string representation of the amount in the account.  We are going to use the NumberFormat class to format out total
correctly to a actual dollar figure.  I have already imported the NumberFormat Class in for you. Just add the two lines of code to the method
and it will work.

NumberFormat formatter = NumberFormat.getCurrencyInstance();

return formatter.format(amount);
 */

import java.text.*;

public class BankAccount {
    final private String name;
    private double amount;


    public BankAccount(String name) {
        this.name = name;
        this.amount = 0.0;
    }


    public String getName() {
        return name;
    }

    public double getAmount() {
        return amount;
    }

    public void withdraw(double num) {
        amount -= num;
    }

    public void deposit(double num) {
        amount += num;
    }

    public String toString() {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        return formatter.format(amount);
    }
}
