package application;

import entities.Account;
import exceptions.RulesWithdraw;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("Enter account data: ");
            System.out.print("Number: ");
            Integer number = sc.nextInt();
            sc.nextLine();
            System.out.print("Holder: ");
            String name = sc.nextLine();
            System.out.print("Initial balance: ");
            Double balance = sc.nextDouble();
            System.out.print("Whitdraw limit: ");
            Double withdrawLimit = sc.nextDouble();
            Account acc1 = new Account(number,name,balance,withdrawLimit);

            System.out.println();
            System.out.print("Enter amount for withdraw: ");
            Double amount = sc.nextDouble();
            acc1.withdraw(amount);
            System.out.println("New balance: " + acc1.getBalance());

        }
        catch (RulesWithdraw e){
            System.out.println("Withdraw error: " + e.getMessage());
        }

    }

}