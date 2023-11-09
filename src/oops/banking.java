package oops;

class Account{
    int acc_no;
    String name;
    float amounts;

    // method initialize object

    void insert(int a, String n, float amt){
        acc_no = a;
        name = n;
        amounts = amt;

    }
    // deposite method
    void deposit(float amt){
        amounts = amounts+amt;
        System.out.println(amt + "deposited");
    }
    // withdrawal method
    void  withdraw(float amt){
        if (amounts < amt){
            System.out.println("insufficient Balance");
        }
        else {
            amounts = amounts-amt;
            System.out.println(amt + "withdrawan");
        }
    }

    void  checkBalance(){
        System.out.println("Balancen is " + amounts);
    }
    void display(){
        System.out.println(acc_no +" " + name + " " + amounts);
    }

}

public class banking {
    public static void main(String[] args) {
        Account bank = new Account();
        bank.insert(5555, "Shaikh",4500);
        bank.display();
        bank.checkBalance();
        bank.deposit(1000);
        bank.checkBalance();
        bank.withdraw(2000);
        bank.checkBalance();

    }
}
