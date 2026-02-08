import java.util.ArrayList;
import java.util.Scanner;
class Data{
    static String contactName;
    static long contactNumber;
    String  data(String contactName){
        this.contactName =contactName;
        return contactName ;
   }
   long data(long contactNumber){
       this.contactNumber =contactNumber;
       return contactNumber;
   }
}
class Homepage{
   void   Homepage(){
       System.out.println("Enter your choice");
       System.out.println("1) create new contact number");
       System.out.println("2) find contact number");
       System.out.println("3) delete contact number");
       System.out.println("4) exit");
    }
}
public class Main extends Data {
    static void main(String[] args) {
        System.out.println("***********wel-come to Contact Manager*********");
        Scanner input =new Scanner(System.in);
        ArrayList<String> contact=new ArrayList<>();
        Homepage homepage = new Homepage();
        while (true) {
            homepage.Homepage();
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the name of contact");
                    input.nextLine();
                     contactName = input.nextLine();
                     contact.add(contactName);
                    System.out.println("Enter Contact Number");
                     contactNumber = input.nextInt();
                    System.out.println("Contact Number added successfully");
                    break;
                case 2:
                    System.out.println("Enter the contact name");
                    input.nextLine();
                  String  Name = input.nextLine();
                    if (Name.equals(contactName)) {
                        System.out.println("contact number exits");
                        System.out.println(contactName);
                        System.out.println(contactNumber);
                    } else {
                        System.out.println("contact number not found");
                    }
                    break;
                case 3:
                    System.out.println("enter contact name");
                    input.nextLine();
                    contactName =input.nextLine();
                    if (contactName.isEmpty()){
                        System.out.println("contact list is empty");
                    }else {
                         contact.remove(contactName);
                    }
                    break;
                case 4:
                    System.out.println("thank you for using contact manager");
                    System.exit(0);
            }
        }
    }
}