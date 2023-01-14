/*
Test the class:

In the Runner class create an account for "Dave".

Deposit $500 into his account.  Then, using the toString() method print up the account.

Withdraw 150.43 from his account.  Then, using the toString() method print up the account.


Now to use the classes

Heidi notices that her bank has a savings account that has a .35% interest rate that is added in every month.  However
there is a Bond account that has a 2.5% interest rate added yearly.  She has $5000 she wants to deposit and wonders
which account would be better over the next 10 years.  The thing is at the end of every year she will be withdrawing
$200 to cover some expenses.  She will wait till the interest hits the account before removing the money.

Using the classes you just build find out how much Heidi will have in a Savings account and Bond account, to see which
one she should choose.

Just print the totals in each account.
 */

public class AccountRunner {
    public static void main(String[] args) {
        BankAccount daveAccount = new BankAccount("Dave");
        daveAccount.deposit(500.0);
        System.out.println(daveAccount.toString());
        daveAccount.withdraw(150.43);
        System.out.println(daveAccount.toString());

        SavingsAccount option1 = new SavingsAccount("option1", 0.35);
        option1.deposit(5000);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 12; j++) {
                option1.addInterest();
            }
            option1.withdraw(200.0);
        }

        BondAccount option2 = new BondAccount("option2", 2.5, 5000);
        for (int i = 0; i < 10; i++) {
            option2.addInterest();
            option2.withdraw(200.0);
        }

        System.out.println(option1);
        System.out.println(option2);
    }
}
