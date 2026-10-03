// . Bank Account Management System
// Create a class BankAccount with accountNo, holderName, and balance. Use a constructor to initialize the account. Provide instance methods deposit(amount), withdraw(amount), and displayBalance(). Withdrawal should not be allowed when the requested amount is greater than the available balance. Create a static method bankInfo() that displays the bank name and general banking information. Create two account objects and perform different transactions on them.
// Concepts Covered: Constructor, Objects, Instance Methods, Static Method, Object State
class BankAccount {
    constructor(accountNo, holderName, balance) {
        this.accountNo = accountNo;
        this.holderName = holderName;
        this.balance = balance;
    }
    deposit(amount) {
        this.balance = amount;
    }
    withdraw(amount) {
        if (amount <= this.balance)
            this.balance -= amount;
        else
            console.log("Insufficient balance");
    }
    displayBalance() {
        console.log(this.holderName + " Balance: ₹" + this.balance);
    }
    static bankInfo() {
        console.log("Bank: ABC Bank | Safe and Secure Banking");
    }
}
let a1 = new BankAccount(101, "Anurag", 5000);
let a2 = new BankAccount(102, "sujal", 3000);
BankAccount.bankInfo();
a1.deposit(1000);
a1.withdraw(2000);
a1.displayBalance();
a2.deposit(500);
a2.withdraw(4000);
a2.displayBalance();