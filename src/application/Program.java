package Application;

import entites.Client;
import entites.Order;
import entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter cliente data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());
        Client client = new Client(name, email, birthDate);

        System.out.println("Enter order data:");
        OrderStatus orderStatus = OrderStatus.valueOf(sc.next());
        Order order = new Order(orderStatus, client);

        System.out.print("How many items to this order? ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            System.out.print("Enter #" + (1+i) + " item data:");
            System.out.print("Enter #\" + (1+i) + \" item data:");
        }







        sc.close();
    }
}
