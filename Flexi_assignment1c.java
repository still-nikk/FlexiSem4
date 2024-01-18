// Account class representing bank accounts
class Account {
    private int accountNumber;
    private double balance;

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds!");
        }
    }
}

// Customer1 class representing bank customers
class Customer1 {
    private String name;
    private int customerId;
    private Account account;

    public Customer1(String name, int customerId, Account account) {
        this.name = name;
        this.customerId = customerId;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public int getCustomer1Id() {
        return customerId;
    }

    public Account getAccount() {
        return account;
    }
}

// Transaction class representing financial transactions
class Transaction {
    private String description;
    private double amount;

    public Transaction(String description, double amount) {
        this.description = description;
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }
}
