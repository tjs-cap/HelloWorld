import java.util.Scanner;

public class AddingTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number value: ");
        int num1 = Integer.parseInt(reader.nextLine());
        System.out.print("Enter another number value: ");
        int num2 = reader.nextInt();
        int total = num1 + num2;
        System.out.println("Total = " + total);
    }
}
