//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package app;

import java.util.Scanner;

public class Main {
    static double balance = 1000.0;;

    public Main() {
    }

    public static void main(String[] args) {
        balance = validateAmount(balance, getAmount());
    }


    private static double getAmount() {
        System.out.printf("Balance is USD %.2f %nEnter purchase amount, USD: ", balance);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    private static double validateAmount(double balance, double withdrawal) {
        if (withdrawal > balance) {
            try {
                throw new FundsException("Insufficient funds!");
            } catch (FundsException ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            balance = getBalance(balance, withdrawal);
            System.out.printf("Funds are OK. Purchase paid.%nBalance is USD %f", balance);
        }

        return balance;
    }

    private static double getBalance(double balance, double withdrawal) {
        return balance - withdrawal;
    }
}