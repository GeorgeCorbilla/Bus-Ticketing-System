package busticketingsystem;

// importing these packages to be used in the program. Arrays for array manipulation and scanner for 
// scanning inputs from the user
import java.util.Arrays;
import java.util.Scanner;

public class BusTicketingSystem {

    public static void main(String[] args) {

        // declaring the scanner object to be used in the program
        Scanner scan = new Scanner(System.in);

        // declaring variables that will hold the values within the program
        String yn, search, again, choice;
        int to = 0, y = 1, z = 0, end = 0, r = 1;
        
        // these are the array variables used
        String payment_method[] = new String[50]; // holds the payment method chosen by the user such as gcash, maya, or cash
        double pay[] = new double[20];           // holds the paid amount of the user
        double change[] = new double[20];         // holds the change from the payment of user
        int available[] = new int[12];          // holds the available seats 
        
        // holds the tickets
        int ticketI[][] = new int[100][3];      // holds the number of passengers
        String ticketS[][] = new String[100][3];   // holds the destination
        double ticketD[][] = new double[100][3];  // holds the fare

        // fills the array "available" with the values of 20 using the fill method. 
        Arrays.fill(available, 20);

        // for loop is used to print the main menu of the program
        // this loop will execute unless the user enters "5"
        for (int x = 1; x == 1;) {  // x is initialized with the value of 1 and it is used as the checker
                                    // to check if the loop will continue or not
                                    
            // prints the MAIN MENU
            System.out.println("============================================");
            System.out.println("   BATAAN TRANSIT BUS TICKETING SYSTEM      ");
            System.out.println("============================================");
            System.out.println("\t[1] Show Destinations                     ");
            System.out.println("\t[2] Reserve Seat(s)                       ");
            System.out.println("\t[3] Pay Ticket(s)                         ");
            System.out.println("\t[4] Search Passenger Transaction          ");
            System.out.println("\t[5] Exit                                  ");
            System.out.println("============================================");

            // for loop to check user input
            for (x = 1; x == 1;) {
                
                System.out.print("SELECT : ");  //prompts the user to select an operation from the main menu
                choice = scan.nextLine(); // scans what the user enters and stores it to the "choice" variable

                // using if else condition to check the value of "choice"
                
                // if the user enters 1, this menu will be displayed. SHOW DESTINATION
                if (choice.equals("1")) {

                    // destination menu will be printed
                    // the destination, price, and available seats will be printed.
                    
                    System.out.println("\n============================================");
                    System.out.println("       DESTINATION          | PRICE | SEAT ");
                    System.out.println("============================================");
                    System.out.println("  1.)Balanga to Orion       |  P30  |   " + available[1]); // for priting the available seats
                    System.out.println("  2.)Orion to Limay         |  P40  |   " + available[2]); // the array "available" index value will be used
                    System.out.println("  3.)Limay to Mariveles     |  P50  |   " + available[3]); 
                    System.out.println("  4.)Mariveles to Bagac     |  P50  |   " + available[4]);
                    System.out.println("  5.)Bagac to Morong        |  P50  |   " + available[5]);
                    System.out.println("  6.)Morong to Dinalupihan  |  P50  |   " + available[6]);
                    System.out.println("  7.)Dinalupihan to Hermosa |  P50  |   " + available[7]);
                    System.out.println("  8.)Hermosa to Orani       |  P40  |   " + available[8]);
                    System.out.println("  9.)Orani to Samal         |  P50  |   " + available[9]);
                    System.out.println("  10.)Samal to Abucay       |  P40  |   " + available[10]);
                    System.out.println("  11.)Abucay to Balanga     |  P40  |   " + available[11]);
                    System.out.println("============================================\n");
                    x = 0;  // 0 will be assigned to x to end the loop. Since the for loop checks whether x is equal to 1, it will not continue since the value of x will be 0

                } else if (choice.equals("2")) {  // if the user enters 2, this menu will be displayed
                    
                    int print = 1; // assigning 1 to print so that it will print the passengers detail after a few processe
                    
                    // the destination, price, and available seats will be printed to inform the user destinations to choose from 

                    System.out.println("============================================");
                    System.out.println("       DESTINATION          | PRICE | SEAT ");
                    System.out.println("============================================");
                    System.out.println("  1.)Balanga to Orion       |  P30  |   " + available[1]);
                    System.out.println("  2.)Orion to Limay         |  P40  |   " + available[2]);
                    System.out.println("  3.)Limay to Mariveles     |  P50  |   " + available[3]);
                    System.out.println("  4.)Mariveles to Bagac     |  P50  |   " + available[4]);
                    System.out.println("  5.)Bagac to Morong        |  P50  |   " + available[5]);
                    System.out.println("  6.)Morong to Dinalupihan  |  P50  |   " + available[6]);
                    System.out.println("  7.)Dinalupihan to Hermosa |  P50  |   " + available[7]);
                    System.out.println("  8.)Hermosa to Orani       |  P40  |   " + available[8]);
                    System.out.println("  9.)Orani to Samal         |  P50  |   " + available[9]);
                    System.out.println("  10.)Samal to Abucay       |  P40  |   " + available[10]);
                    System.out.println("  11.)Abucay to Balanga     |  P40  |   " + available[11]);
                    System.out.println("============================================\n");

                    // checking if there are available seats for each destination
                    if ((available[1] == 0) && (available[2] == 0) && (available[3] == 0) && (available[4] == 0) && (available[5] == 0) && (available[6] == 0) && (available[7] == 0) && (available[8] == 0) && (available[9] == 0) && (available[10] == 0) && (available[11] == 0) && (available[12] == 0)) {
                        
                        // if there are no available seats, the message below will be printed
                        System.out.println("Sorry, We don't have available seats for all Destination!");
                        x = 0; 

                    } else {  // if there are available seats
                        
                        // using a for loop to get the passengers name
                        for (x = 1; x == 1;) {      
                            System.out.print("\nPassenger's Name: ");
                            ticketS[z][0] = scan.nextLine();  // scanning the passenger's name and assigning it to the ticketS array
                            x = 0;
                               
                            // loop to check if the passengers name is already existing
                            for (int l = 0; l < z; l++) {
                                // check if the passengers name is already used using equalsIgnoreCase 
                                if (ticketS[l][0].equalsIgnoreCase(ticketS[z][0])) {
                                    // if the name is existing, the message below will be printed
                                    System.out.println("ERROR: Existing Passenger Name! Please try Again!");
                                    x = 1;  // 1 is assigned to x so that the loop will execute again 
                                }
                            }
                        }

                        // using a for loop to choose destination
                        for (x = 1; x == 1;) {
                            System.out.print("CHOOSE DESTINATION: ");   // prompt the user to choose destination
                            to = Integer.parseInt(scan.nextLine());     // scan for the users input and assign it to variable "to". It scans as integer and parse it as an integer before assigning to variable "to"

                            // checking if the destination is valid
                            if (to < 1 || to > 11) {
                                // if the value of "to" is less than 1 or greater than 11, invalid input will be printed
                                System.out.println("Invalid Input!");
                                x = 1; // 1 is assigned to x so that the loop will execute again 
                            }

                            // checking if the destination have available seats
                            for (int d = 1; d <= 11; d++) {
                                if (to == d) {
                                    if (available[to] == 0) { // if there are no available seats for the chosen destination
                                        System.out.println("Sorry, We don't have available seat!"); // this message will be printed
                                        x = 1; // 1 is assigned to x so that the user will be prompted again to choose a destination
                                    }
                                    x = 0; // 0 is assigned to x so that the user will not be prompted again to choose a destination
                                }
                            }
                        }
                        
                        // variables to hold the destination and their respective prices
                        String dest[] = {" ", "Balanga to Orion", "Orion to Limay", "Limay to Mariveles", "Mariveles to Bagac", "Bagac to Morong", "Morong to Dinalupihan", "Dinalupihan to Hermosa", "Hermosa to Orani", "Orani to Samal", "Samal to Abucay", "Abucay to Balanga"};
                        double fare[] = {0, 30, 40, 50, 50, 50, 50, 50, 40, 50, 40, 40};

                        // assigning the destination and fare to the respective arrays
                        ticketS[z][1] = dest[to];
                        ticketD[z][0] = fare[to];

                        // getting the number of passengers
                        for (x = 1; x == 1;) {
                            System.out.print("HOW MANY PASSENGERS ARE YOU?: ");  // prompts the user to enter the number of passengers
                            ticketI[z][0] = Integer.parseInt(scan.nextLine());  // scanning for user input and asigning it to ticketI array

                            //loop to subtract the available seat by the the number inputed
                            for (int p = 1; p <= 11; p++) {
                                if (to == p) { // checking if to is equal to 1
                                    
                                    print = 1;
                                    available[to] = available[to] - ticketI[z][0]; // subtracting the number of passengers to the available seats

                                    if (available[to] < 0) {    // if there are no available seats, print the message below
                                        System.out.print("Sorry, We don't have seat available for " + ticketI[z][0] + " person\n");
                                        
                                        available[to] = available[to] + ticketI[z][0];  // add again what is being subtracted. The available seat and number of passengers
                                        System.out.print("We only have " + available[to] + " seat available\n"); // then output the available seats
                                        x = 1;  // 1 is assigned to x so that the user will be prompted again to enter the number of passengers
                                        print = 0;
                                    } else {
                                        x = 0;  // 0 is assigned to x to not prompt again the user and end the current loop
                                    }
                                }
                            }

                        }

                        System.out.println("\n20% discount for PWD, Students, and Senior Citizen");

                        // for loop to check the number of passengers with discount
                        for (x = 1; x == 1;) {
                            System.out.print("HOW MANY PASSENGERS HAVE DISCOUNT?: "); // prompting the user to enter the number of passengers with discount
                            ticketI[z][1] = Integer.parseInt(scan.nextLine());  // scanning the user input and assigning it to the array ticketI

                            if (ticketI[z][1] > ticketI[z][0]) {  // if the number of passengers with discount is greater than the total number of passengers, print the message below

                                System.out.println("Invalid Input!");
                                System.out.println("No. of Passengers are only " + ticketI[z][0] + "!");
                                x = 1;   // 1 is assigned to x so that the user will be prompted again to enter the number of passengers that have discount
                            } else {  // if not, break the loop
                                break;
                            }
                        }

                        // if print is equal to 1, print the passenger details
                        if (print == 1) {
                            System.out.println("\n============================================");
                            System.out.println("            PASSENGER DETAILS                 ");
                            System.out.println("============================================");
                            System.out.println("  NAME: " + ticketS[z][0]);
                            System.out.println("  DESTINATION : " + ticketS[z][1]);
                            System.out.println("  PRICE: P" + ticketD[z][0]);
                            System.out.println("  PASSENGERS: " + ticketI[z][0]);
                            System.out.println("  PASSENGERS WITH DISCOUNT: " + ticketI[z][1]);
                            System.out.println("============================================");
                            System.out.println("============================================");
                            ticketS[z][2] = "0";
                            double discount = (ticketD[z][0] - (ticketD[z][0] * 0.2)) * ticketI[z][1];  // calculate for the discount based on the number of passengers with discount
                            ticketD[z][2] = ((ticketI[z][0] - ticketI[z][1]) * ticketD[z][0]) + discount; // assign the total price for the passengers
                            x = 0;
                        }
                        
                        z++;
                    }
                    
                
                } else if (choice.equals("3")) { //  if the user enters 3

                    // for loop will be used to check and pay for tickets of a passenger
                    for (x = 1; x == 1;) {

                        System.out.print("ENTER PASSENGER'S NAME: ");   // prompting the user to enter the passengers name
                        search = scan.nextLine();   // scanning the passenger name and assigning it to the search variable

                        int s = 1;
                        for (int b = 0; b < z; b++) { // for loop used in displaying the passenger details
                            
                            if (search.equalsIgnoreCase(ticketS[b][0])) {  // if the passenger name is present
                                // display the passenger details
                                System.out.println("\n============================================");
                                System.out.println("            PASSENGER DETAILS                 ");
                                System.out.println("============================================");
                                System.out.println("  NAME: " + ticketS[b][0]);         // display the passenger name
                                System.out.println("  DESTINATION : " + ticketS[b][1]); // display the destination
                                System.out.println("  PRICE: P" + ticketD[b][0]);       // display the price
                                System.out.println("  PASSENGERS: " + ticketI[b][0]);    // display the number of passengers
                                System.out.println("  PASSENGERS WITH DISCOUNT: " + ticketI[b][1]);     // display the number of passengers with discount
                                System.out.println("============================================");
                                System.out.println("============================================");
                                s = 0; //assigning 0 to indicate that the passenger is found
                                x = 0;

                                if (ticketS[b][2].equals("x")) {   // if the destinations value is equal to x, meaning, the passenger is already paid.
                                    System.out.println("Passenger's Already Paid!");
                                    x = 0;
                                } else { // if not paid
                                    
                                    ticketS[b][2] = "x";
                                    
                                    // for loop for paying the ticket
                                    for (x = 1; x == 1;) {
                                        System.out.println("\nPASSENGER'S TOTAL FARE: P" + ticketD[b][2]);  // display the total fare
                                        System.out.print("Pay Using: Cash / Gcash / Maya: ");       // display the payment methods available
                                        payment_method[b] = scan.nextLine();                // scan for user input and assign it to payment method array

                                        // if the value of index of payment method is equal to gcash or maya, the payment will be automatically processed
                                        if (payment_method[b].equalsIgnoreCase("gcash") || payment_method[b].equalsIgnoreCase("maya")) {
                                            pay[b] = ticketD[b][2]; // assign to the variable "pay" the total fare
                                        } else { // if the user enters cash
                                            System.out.print("ENTER AMOUNT TO PAY: ");  // prompt the user to enter the amount to pay
                                            pay[b] = Double.parseDouble(scan.nextLine());       // scan for the value of amount to pay and store it to the array pay
                                            change[b] = pay[b] - ticketD[b][2];     // compute for the change

                                            // checking if the amount entered is valid
                                            if (change[b] < 0) { // if the amount entered is less than 0
                                                System.out.println("Invalid Input!"); // print invalid input if yes, since the amount entered is not enough for payment
                                                x = 1; // 1 is assigned to x so that the user will be prompted again to enter the amount to pay
                                            } else {    // if valid
                                                System.out.println("CHANGE: P" + change[b]);    // print the change
                                                System.out.println("");

                                            }
                                        }
                                        x = 0;  // 0 is assigned to x to end the current loop
                                        System.out.println("PAYMENT RECEIVED! THANK YOU!");

                                    }
                                }
                            }
                        }
                        if (s == 1) { // if the passenger is not found, print the message below
                            System.out.println("\nPASSENGER'S NAME NOT FOUND!\n");
                            
                            // loop to check if the user wants to continue with the transaction
                            for (int q = 1; q == 1;) {

                                System.out.print("Do you wish to continue with this transaction? [Y/N]: ");
                                again = scan.nextLine();  // scanning for user input and assigning it to the variable again

                                // using equals ignore case to ignore the cases of user input
                                if (again.equalsIgnoreCase("y")) {  // if yes
                                    q = 0; // assigning 0 to q to end the loop
                                } else if (again.equalsIgnoreCase("n")) {  // if no
                                    q = 0;
                                    x = 0;
                                } else {
                                    System.out.println("\nInvalid input!\n");
                                }

                            }
                        }
                    }

                } else if (choice.equals("4")) {  // if the user chooses 4 from the main menu

                    // using for loop in searching the passengers name
                    for (int sx = 1; sx <= 3;) {  // this loop will execute 3 times when the passengers name is not found. After it, the user will have to select again an option from the main menu
                        System.out.print("SEARCH PASSENGER'S NAME: ");  // prompting the user to enter the passengers name
                        search = scan.nextLine();   // scanning for user input

                        int s = 1;
                        for (x = 0; x <= z; x++) {
                            if (search.equalsIgnoreCase(ticketS[x][0])) {  // if the passenger's name is found
                                // print passengers detail
                                System.out.println("\n============================================");
                                System.out.println("            PASSENGER DETAILS                 ");
                                System.out.println("============================================");
                                System.out.println("  NAME: " + ticketS[x][0]);
                                System.out.println("  DESTINATION : " + ticketS[x][1]);
                                System.out.println("  PRICE: P" + ticketD[x][0]);
                                System.out.println("  PASSENGERS: " + ticketI[x][0]);
                                System.out.println("  PASSENGERS WITH DISCOUNT: " + ticketI[x][1]);
                                System.out.println("============================================");
                                System.out.println("============================================");
                                if (ticketS[x][2].equals("x")) {  // checking if the ticket is already paid
                                    System.out.println("  PAYMENT METHOD: " + payment_method[x].toUpperCase());
                                    System.out.println("  PAY: P" + pay[x]);
                                    System.out.println("  CHANGE: P" + change[x]);
                                    System.out.println("  STATUS: PAID");
                                } else {  // if the ticket payment is pending
                                    System.out.println("  STATUS: PENDING");
                                }
                                System.out.println("============================================");
                                System.out.println("============================================");
                                s = 0;
                                sx = 4; // assigning 4 to sx so that the outer loop next to this will terminate
                            }
                        }

                        if (s == 1) {  // if the passengers name is not found, print the message below
                            System.out.println("Passenger's Name not found!");
                            sx++; // incrementing the value of sx
                        }

                    }
                } else if (choice.equals("5")) {  // if the user enters 5 from the main menu
                    // terminate the program and print thank you
                    end = 1;
                    x = 0;
                    System.out.println("Thank You!");
                } else { // when the input is not from the choices, print the output below
                    System.out.println("Invalid Input!");
                    x = 1; // 1 is assigned to x so that the user will be prompted again to enter the choice from the main menu
                }
            }
            
            // this loop will handle the next process after the user performs an action and so on
            for (y = 1; y == 1;) {
                if (end == 1) { // checking if the program has end. If yes, this loop will be broken
                    break;
                }
                
                System.out.print("Do you want another transaction? [Y/N]: ");  // prompting the user if they want another transaction
                yn = scan.nextLine();  // scanning for input and assigning it to yn variable

                if (yn.equalsIgnoreCase("y")) {     // if y is entered, display the main menu
                    x = 1;
                    y = 0;
                } else if (yn.equalsIgnoreCase("n")) {  // if n is entered, terminate the program
                    System.out.println("\nTHANK YOU! COME AGAIN!");
                    break;
                } else { // if the input is invalid
                    System.out.println("Invalid Input!");
                    y = 1;  // 1 is assigned to 1 so that the user will be asked again if they want another transaction
                }
            }
        }

    }
}
