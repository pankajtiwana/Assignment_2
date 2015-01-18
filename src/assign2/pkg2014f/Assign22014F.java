/* The following exercises are adapted from:
 * Gaddis, T. (2013). Starting Out with Java: From Control Structures through 
 * Objects. (5th ed.). Upper Saddle River, NJ: Pearson Education.
 * ISBN: 978-0-13-285583-9
 */
package assign2.pkg2014f;

import java.util.Scanner;

/**
 * @author Pankaj
 */
public class Assign22014F {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* =============================== *
         * DO NOT CHANGE THIS METHOD       *
         * Make changes in the sub-methods *
         * named for each exercise.        *
         * =============================== */
        int choice;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Which exercise would you like to run? [4,9,10,12,16] (0 to Exit)");
            choice = in.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("Okay, goodbye!");
                    break;
                case 4:
                    doExercise4();
                    break;
                case 9:
                    doExercise9();
                    break;
                case 10:
                    doExercise10();
                    break;
                case 12:
                    doExercise12();
                    break;
                case 16:
                    doExercise16();
                    break;
                default:
                    System.out.println("That is not a valid choice.");
                    break;
            }
        } while (choice != 0);
    }

    /* Exercise #4
     * Write a program that displays the following pattern:
     *     *
     *    ***
     *   *****
     *  *******
     *   *****
     *    ***
     *     *
     *
     * - Gaddis pg. 106
     */
    public static void doExercise4() {
        System.out.println("   *");
        System.out.println("  ***");
        System.out.println(" *****");
        System.out.println("*******");
        System.out.println(" *****");
        System.out.println("  ***");
        System.out.println("   *");
        // TODO: Complete Exercise #4 Below

    }

    /* Exercise #9
     * A car's miles-per-gallon (MPG) can be calculated 
     * with the following formula:
     *   MPG = Miles Driven / Gallons of Gas Used
     * Write a program that asks the user for the number 
     * of miles driven and the gallons of gas used. It 
     * should calculate the car's miles-per-gallon and 
     * display the result on the screen.
     *
     * - Gaddis pg. 106-7
     */
    public static void doExercise9() {
        Scanner info = new Scanner(System.in);
        System.out.println("Enter the toatal numbers of miles driven");
        double total_miles = info.nextDouble();

        System.out.println("Enter the gallon of gas used");
        double gallon_gas = info.nextDouble();
        double MPG = total_miles / gallon_gas;

        System.out.println("the car's miles per gallon is: " + MPG);

      // TODO: Complete Exercise #9 Below
    }

    /* Exercise #10
     * Write a program that asks the user to enter three 
     * test scores. The program should display each test 
     * score, as well as the average of the scores.
     *
     * - Gaddis pg. 107
     */
    public static void doExercise10() {
        Scanner info = new Scanner(System.in);
        System.out.println("Enter your test scores");
        double score1 = info.nextDouble();
        double score2 = info.nextDouble();
        double score3 = info.nextDouble();
        System.out.println("you entered: " + score1 + '\n' + score2 + '\n' + score3);
        double avg = (score1 + score2 + score3) / 3;
        System.out.println("the average is: " + avg);

        // TODO: Complete Exercise #10 Below
    }

    /* Exercise #12
     * Write a program that asks the user to enter the name 
     * of his or her favourite city. Use a String variable 
     * to store the input. The program should display the 
     * following:
     * - The number of characters in the city name
     * - The name of the city in all uppercase letters
     * - The name of the city in all lowercase letters
     * - The first character in the name of the city
     *
     * - Gaddis pg. 107
     */
    public static void doExercise12() {

        Scanner info = new Scanner(System.in);

        System.out.println("Enter the name of your favourite city");

        // String city=new String();
        String city = info.nextLine();
        int length = city.length();

        // String upper=new String();
        String upper = city.toUpperCase();
         //String lower=new String();

        String lower = city.toLowerCase();
        // String first=new String();

        String first = String.valueOf(city.charAt(0));
        
        System.out.println("the number of character in your city are: " + length);
        System.out.println(" Your city name in upper case is: " + upper);
        System.out.println("Your city name in lower case is: " + lower );
        System.out.println("the first letter of your city is: " +first);

        // TODO: Complete Exercise #12 Below
    }

    /* Exercise #16
     * Write a program that plays a word game with the 
     * user. The program should ask the user to enter 
     * the following:
     * - His or her name
     * - His or her age
     * - The name of a city
     * - The name of a college
     * - A profession
     * - A type of animal
     * - A pet's name
     * After the user has entered these items, the program 
     * should display the following story, inserting the 
     * user's input into appropriate locations:
     *
     * There once was a person named NAME who lived in CITY. At the age of AGE,
     * NAME went to college at COLLEGE. NAME graduated and went to work as a
     * PROFESSION. Then, NAME adopted a(n) ANIMAL named PETNAME. They both
     * lived happily ever after.
     *
     * - Gaddis pg. 108
     */
    public static void doExercise16() {
        Scanner info = new Scanner(System.in);
        System.out.println("Enter your name.");
        String name = info.nextLine();
        
        
        
        System.out.println("Enter your city.");
        String city  = info.nextLine();
        
        System.out.println("Enter your age.");
        String age = info.nextLine();
      
        System.out.println("Enter your college name.");
        String colg = info.nextLine();
         
        System.out.println("Enter your profession.");
        String prof  = info.nextLine();
        
        System.out.println("Enter an animal name.");
        String animal = info.nextLine();
        
        System.out.println("Enter a pet name.");
        String pet = info.nextLine();
        
        System.out.println("There once was a person named " + name + " who lived in " + city + ". At the age of " + age +", " + name + " went to college at " + colg + ". " + name + " graduated and went to work as a "
                + prof + ". Then, " + name + " adopted a(n) " + animal + " named " + pet + ". They both lived happily ever after.");

        // TODO: Complete Exercise #16 Below
    }
}
