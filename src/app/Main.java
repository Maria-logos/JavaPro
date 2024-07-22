package app;

import java.util.Scanner;

// Виправте цей клас
public class Main {

    public static void main(String[] args) {
        Customer customer = getCustomer(getData());
        String output = "Customer: " + customer.getName() +
                ", phone " + customer.getPhone();
        getOutput(output);
    }

    public static String[] getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter customer name: ");
        String custName = sc.nextLine().trim();
        System.out.print("Enter customer phone: ");
        String custPhone = sc.nextLine().trim();
        return new String[]{custName, custPhone};
    }

    public static Customer getCustomer(String[] data) {
        return new Customer(data[0], data[1]);
    }

    public static void getOutput(String output) {
        System.out.println(output);
    }
}
