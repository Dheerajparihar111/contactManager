import java.util.Scanner;
class Homepage{
   void   Homepage(){
       System.out.println("Enter your choice");
       System.out.println("1) create new contact number");
       System.out.println("2) find contact number");
       System.out.println("3) delete contact number");
       System.out.println("4) exit");
    }
}
public class Main {
    static void main(String[] args) {
        System.out.println("***********wel-come to Contact Manager*********");
        Scanner input =new Scanner(System.in);
        Homepage homepage = new Homepage();
        homepage.Homepage();
        int choice = input.nextInt();
        switch (choice){
            case 1:
                System.out.println("Enter the name of contact");
                input.nextLine();
                String contactName =input.nextLine();
                System.out.println("Enter Contact Number");
                long cintactNUmber = input.nextInt();
                System.out.println("Contact Number added successfully");

        }
    }
}