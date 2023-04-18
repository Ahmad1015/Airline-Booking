import java.sql.SQLOutput;
import java.util.Scanner;
public class Airline
{
    public static void main(String[]args)
    {
        boolean [] seats = new boolean[10];

        int counter1 = 0;
        int counter2 = 5;
        int choice;

        System.out.println("Booking your seat");
        do {
            System.out.println("Type 1 for First Class or Type 2 for Economy class");

            Scanner input = new Scanner(System.in);
            int flightClass = input.nextInt();

            if (flightClass == 1) {
                if (counter1 < 5) {
                    seats[counter1] = true;

                    System.out.println("\nYour Boarding pass");
                    System.out.println("\nYour seat no is " + (counter1 + 1));
                    System.out.println("\nYou have been booked to First Class");

                    counter1++;


                } else {
                    System.out.println("\nFirst class is full");
                    System.out.println("Type 0 to book to economy class or type 1 if its not acceptable");

                    int answer = input.nextInt();

                    if (answer == 0)
                    {
                        int i;
                        for (i = 0; i < seats.length; i++)
                        {
                            if (seats[i] == false)
                            {
                                seats[i] = true;
                                counter2++;
                                System.out.println("Your Boarding pass");
                                System.out.println("Your seat no is " + (i + 1));
                                System.out.println("You have been booked to Economy Class");
                                break;

                            }


                        }

                        System.out.println("All seats in both classes have been booked. Sorry the next flight is in 3 hours");




                    }
                    else
                        System.out.println("Next flight is in 3 hours");

                }


            }

            if (flightClass == 2) {
                if (counter2 < 10) {
                    seats[counter2] = true;

                    System.out.println("Your Boarding pass");
                    System.out.println("Your seat no is " + (counter2 + 1));
                    System.out.println("You have been booked to Economy Class");

                    counter2++;

                } else {
                    System.out.println("Economy class is full");
                    System.out.println("Type 0 to book to First class or type 1 if its not acceptable");

                    int answer2 = input.nextInt();

                    if (answer2 == 0)
                    {
                        int j;
                        for (j = 0; j < seats.length; j++)
                        {
                            if (!seats[j])
                            {
                                seats[j] = true;
                                counter1++;
                                System.out.println("Your Boarding pass");
                                System.out.println("Your seat no is " + (j + 1));
                                System.out.println("You have been booked to Economy Class");
                                break;
                            }

                        }
                        System.out.println("All seats in both classes have been booked. Sorry the next flight is in 3 hours");



                    } else
                        System.out.println("Next flight is in 3 hours");


                }
            }

            System.out.println("\nEnter 11 to book another seat");
            choice = input.nextInt();


        }while(choice==11);
    }
}