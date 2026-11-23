
package velasquez;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class W3E1Velasquez_javaCarljustin {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int choice;

        while (true) {

            System.out.println("\n===== STUDENT RECORD SYSTEM =====");
            System.out.println("1. Input New Student Record");
            System.out.println("2. View Student Records");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:
                    System.out.println("\n===== INPUT STUDENT RECORD =====");

                    System.out.print("Enter Student Number: ");
                    String studentNumber = input.nextLine();

                    System.out.print("Enter Last Name: ");
                    String lastname = input.nextLine();

                    System.out.print("Enter First Name: ");
                    String firstname = input.nextLine();

                    System.out.print("Enter Course: ");
                    String course = input.nextLine();

                    try (FileWriter writer = new FileWriter("E1firstname.txt", true)) {

                        writer.write(studentNumber + ", "
                                + lastname + ", "
                                + firstname + ", "
                                + course + "\n");

                        System.out.println("\nStudent record successfully saved!");

                    } catch (IOException e) {

                        System.out.println("Error writing to file.");

                    }

                    break;

                case 2:
                    System.out.println("\n===== STUDENT RECORDS =====");

                    try (FileReader reader = new FileReader("E1firstname.txt")) {

                        int ch;

                        while ((ch = reader.read()) != -1) {

                            System.out.print((char) ch);

                        }

                    } catch (IOException e) {

                        System.out.println("No records found or error reading file.");

                    }

                    break;

                case 3:
                    System.out.println("\nThank you for using Student Record System!");

                    input.close();
                    return;

                default:
                    System.out.println("\nInvalid choice! Please select 1, 2, or 3.");

                    break;
            }
        }
    }
}

		

