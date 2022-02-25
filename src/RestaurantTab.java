import java.util.Scanner;
//Created this public class restaurant.java
public class RestaurantTab {
    public static void main(String[] args) {
        final double TAX_PERCENTAGE = 0.075;
        final double TIP_PERCENTAGE = 0.18;
        String firstName;
        String lastName;
        Double meal;
        double tax = 0;
        double subtotal = 0;
        double tip = 0;
        double total = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("What is the first name of the server? ");
        firstName = in.nextLine();
        System.out.print("What is the last name of the server? ");
        lastName = in.nextLine();
        System.out.print("What is the charge for the meal? ");
        meal = Double.parseDouble(in.nextLine());
        tax = meal * TAX_PERCENTAGE;
        subtotal = meal;
        tip = meal * TIP_PERCENTAGE;
        total = subtotal + tip + tax;
        System.out.println("*******Bill*******");
        System.out.println("Name:" + firstName +" "+ lastName);
        System.out.printf("Meal cost : $%.2f\n", meal);
        System.out.printf("Tax : $%.2f\n", tax);
        System.out.printf("Sub-total:$%.2f\n", subtotal);
        System.out.printf("Tip : $%.2f\n", tip);
        System.out.printf("Total cost : $%.2f\n", total);

    }
}