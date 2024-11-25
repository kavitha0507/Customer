import java.util.Scanner;
public class CustomerData {
    public static void main(String[] args) {
        inputCustomerData();
    }
public static void inputCustomerData() {
        Scanner scanner = new Scanner(System.in);
        String[] customers = new String[5];
        for (int i=0; i<5; i++) {
            String firstName = "";
            String lastName = "";
        //prompt for firs name and validae
            while(firstName.isEmpty()){
                System.out.println("Enter the first name of customer" +(i+1)+":");
                firstName = scanner.nextLine().trim();
                if (firstName.isEmpty()){
                    System.out.println("Enter the first name cannot be empty. please try again." );

                }
            }
         // prompt for last name
            while (lastName.isEmpty()){
                System.out.println("Enter the last name of customer" +(i+1)+":");
                lastName = scanner.nextLine().trim();
                if (lastName.isEmpty()){
                    System.out.println("Enter the last name cannot be empty. please try again." );
                }
            }
//combine first name and last name
          customers[i] = firstName+" " + "lastName";

        }
        //print combined names
    System.out.println("CustomerNames:");
        for(String customer : customers){
            System.out.println(customer);

        }
          scanner.close();
}


    }

