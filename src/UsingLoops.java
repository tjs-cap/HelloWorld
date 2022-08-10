import java.util.Scanner;

public class UsingLoops {
    public static void main(String[] args) {
        //using a for loop
//        for (int i = 0; i < 3; i++)
//        {
//            System.out.println("value of i = " + i);
//            // enter password
//        }

//        String username = "Admin";
//        //using a while loop
//        Scanner reader = new Scanner(System.in);
//        System.out.print("Enter username: ");
//        String usernameEntered = reader.nextLine();
//        while(usernameEntered.equals("")){
//            //when something happens
//            System.out.print("Enter username: ");
//            usernameEntered = reader.nextLine();
//        }

        String usernameEntered;
        String username = "Admin";
        //using a do while loop
        do {
            Scanner reader = new Scanner(System.in);
            System.out.print("Enter username: ");
            usernameEntered = reader.nextLine();
        } while (usernameEntered.equals(""));
    }
}
