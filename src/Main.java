import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContactRepository repository = new ContactRepository();
        ContactService service = new ContactService(repository);

        int choice;

        do {
            System.out.println("\n--- Contact Manager ---");
            System.out.println("1. Add Contact");
            System.out.println("2. View All Contacts");
            System.out.println("3. Search Contact by ID");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Phone: ");
                    String phone = sc.nextLine();
                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();
                    service.addContact(name, phone, email);
                    break;

                case 2:
                    service.viewAllContacts();
                    break;

                case 3:
                    System.out.print("Enter Contact ID: ");
                    int id = sc.nextInt();
                    service.searchContact(id);
                    break;

                case 4:
                    System.out.print("Enter Contact ID: ");
                    int delId = sc.nextInt();
                    service.deleteContact(delId);
                    break;

                case 5:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);
    }
}
