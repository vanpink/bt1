public class Account {
    private String id;
    private String name;
    private int balance;
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    public void Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    public  Account(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void credit(int amount) {
        balance= balance + amount;
    }
    public void debit(int amount) {
        if (amount <=balance)
            balance= balance - amount;
        else
            System.out.println("Amount exceeded balance");

    }
    public void  transferTo( Account another, int amount) {
        balance = balance - amount;
        another.credit(amount);

    }
    public String toString(){
        return "Account[id=" + id + ", name=" + name + ", balance=" + balance + "]";
    }
}
