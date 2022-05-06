package aplication;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

import javax.swing.plaf.nimbus.NimbusStyle;

public class Program {
    public static void main(String[] args) {

        Account acc = new Account(1001, "Isadora", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.00);

        //UPCASTING

        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Jane", 0.0, 200.00);
        Account acc3 = new SavingsAccount(1004, "Gui", 0.0, 0.1);


        //DOWNCASTING

        BusinessAccount acc4 = (BusinessAccount)acc2;
        acc4.loan(100.0);

        //
        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount)acc3;
            acc5.loan(200.00);
            System.out.println("Loan!");
        }

        if (acc3 instanceof  SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount)acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }

        Account acc7 = new Account(1007, "Iris", 1000.00);
        acc7.withdraw(200.00);
        System.out.println(acc7.getBalance());

        Account acc8 = new SavingsAccount(1008, "Bárbara", 1000.00, 0.01);
        acc8.withdraw(200.0);
        System.out.println(acc8.getBalance());

        Account acc9 = new BusinessAccount(1009, "Bob", 1000.0, 500.0);
        acc9.withdraw(200.0);
        System.out.println(acc9.getBalance());

    }

}
