package BankAccount;
import java.util.ArrayList;


public class BankAccount {

    public String userName;
    public String userPassword;
    public Double userBalance;
    ArrayList<Double> transactionList = new ArrayList<Double>();



    public BankAccount(String userName, String userPassword  ) {

        this.userName = userName;
        this.userPassword = userPassword;

        //Upon creation of new BankAccount Money = 0
        userBalance = 0.0;


    }


    //Setters and Getters for Name, Password, and Balance ...
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Double getBalance() {

        return userBalance;
    }


    //Deposit and Withdrawl

    public Double depositMoney(Double depositAmount) {

        userBalance = userBalance + depositAmount;
        transactionList.add(depositAmount);
        return userBalance;
    }

    public Double withdrawlMoney(Double withdrawlAmount) {

        userBalance = userBalance - withdrawlAmount;
        transactionList.add(-withdrawlAmount);

        return userBalance;

    }


    //Generates report on object of bank account class

    public String report() {

    System.out.println("User Name: " + this.getUserName());
    System.out.println("Password Name:  " + this.getUserPassword());
    System.out.println("Balance:  " + this.getBalance());
    System.out.println("History: " + this.transactionList);


    return userName;
    }


}
