import java.util.Date;
public class code_9_7 {
    public static void main(String[] args){
        Account a = new Account(1122,20000);
        a.setInterRate(0.045);
        a.withDraw(2500);
        a.deposit(3000);
        System.out.println("the balance are: "+a.getBlance());
        System.out.println("the mothly interest rate is: "+a.getMonthlyInterestRate());
        System.out.println("the date of opening the account is:  "+a.getDate());

    }
}
class Account{
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated = new Date();

    Account(){
        id = 0;
        balance = 0;
        annualInterestRate = 0;
    }
    Account(int newID,double newBalance){
        id = newID;
        balance = newBalance;
        dateCreated.getTime();
    }
    public void setId(int newId){
        id = newId;
    }
    public int setId(){
        return id;
    }
    public void setBalance(double newBlance){
        balance = newBlance;
    }
    public double getBlance(){
        return balance;
    }
    public void setInterRate(double newInterestRate){
        annualInterestRate = newInterestRate;
    }
    public double getInterestRate(){
        return annualInterestRate;
    }
    public String getDate(){
        return dateCreated.toString();
    }
    public double getMonthlyInterestRate(){
        return annualInterestRate / 12.0;
    }
    public void withDraw(double withDraw){
        balance = balance - withDraw;
    }
    public void deposit(double deposit){
        balance = balance +deposit;
    }
}
