/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bikrant bikram
 */
public class Account 
{
   // static int count =0;
    private long accountNumber;
    private String name;
    private long balance;

    public Account(long AccountNumber, String name, long balance) {
        this.accountNumber = AccountNumber;
        this.name = name;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" + "AccountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance + '}';
    }

//    public Account(String name, long balance)
//    {
//        accountNumber =123456789+count;
//        this.name = name;
//        this.balance = balance;
//        count++;
//    }
//    
    
    
}
