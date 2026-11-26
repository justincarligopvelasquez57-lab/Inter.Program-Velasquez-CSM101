package velasquez;
import java.util.*;
import java.util.Scanner;
public class W4A1Velasquez {

    static void velasquez_menu() {
        System.out.println("Welcome Hombre");
        System.out.println("Please Enter a Number to Select Operation: ");
        System.out.println();
        System.out.println("1 (Add +)");
        System.out.println("2 (Subtract -)");
        System.out.println("3 (Multiply *)");
        System.out.println("4 (Divide /)");
    }

    static void velasquez_add(int i, int j) {
        System.out.print(i + j);
    }

    static void velasquez_sub(int i, int j) {
        System.out.print(i - j);
    }

    static void velasquez_mult(int i, int j) {
        System.out.print(i * j);
    }

    static void velasquez_divide(int i, int j) {
        System.out.print(i / j);
    }

    public static void main(String[] args) {

        Scanner velasquez = new Scanner(System.in);

 
        velasquez_menu();

        System.out.print("Choose an operation: ");
        int velasquez_choice = velasquez.nextInt();

        System.out.print("Choose a number: ");
        int velasquez_ii = velasquez.nextInt();

        System.out.print("Choose another number: ");
        int velasquez_jj = velasquez.nextInt();

        System.out.print("Result: ");

        switch (velasquez_choice) {

            case 1:
                velasquez_add(velasquez_ii, velasquez_jj);
                break;

            case 2:
                velasquez_sub(velasquez_ii, velasquez_jj);
                break;

            case 3:
                velasquez_mult(velasquez_ii, velasquez_jj);
                break;

            case 4:
                if (velasquez_jj != 0) {
                    velasquez_divide(velasquez_ii, velasquez_jj);
                } else {
                    System.out.print("Cannot divide by zero!");
                }
                break;

            default:
                System.out.print("Invalid choice!");
                break;
        }

        velasquez.close();
    }
}
