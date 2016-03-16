/**
 * Author:      RJ Podeschi
 * Date:        3-27-14
 * Class:       Prizes.java
 *
 * Purpose:     Class handles all prize logic including number of prizes,
 *              awarding of prizes, and separating prizes out for different
 *              groups of bib numbers.
 *
 * Audit Trail: 15-MAR-16, RJ: Remove old comments and clean up code.
 *
 */

import java.util.*;

public class Prizes {

    private int preRegPrizes;
    private int dayRegPrizes;
    private int preRegStartBib;
    private int preRegEndBib;
    private int dayRegStartBib;
    private int dayRegEndBib;

    /**
     * Collects number of prizes for both pre-registrants and day of
     * registrants. Also collects starting and ending bib numbers for both
     * sets.
     */

    public void inputPrizeValues() {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter how many prizes you will award to "
                + "pre-registrants:");
        preRegPrizes = keyboard.nextInt();


        System.out.println("Enter how many prizes you will award to "
                + "Day of Race resistrants:");
        dayRegPrizes = keyboard.nextInt();

        if (preRegPrizes == 0) {
            System.out.println("No Prizes will be awarded to "
                    + "race Pre-Registrants.");
        }
        else {
            System.out.println("Bib Numbers for Pre-Registrants:");
            System.out.println("--------------------------------");
            System.out.println("Enter the first bib number for race "
                    + "Pre-Registrants:");
            preRegStartBib = keyboard.nextInt();
            System.out.println("Enter the last bib number for race "
                    + "Pre-Registrants:");
            preRegEndBib = keyboard.nextInt();
        }

//        if (dayRegPrizes == 0) {
//            System.out.println("No Prizes will be awarded to "
//                    + "race Pre-Registrants.");
//        }
//        else {
//        System.out.println("Bib Numbers for Pre-Registrants:");
//        System.out.println("--------------------------------");
//        System.out.println("Enter the first bib number for race "
//                + "Pre-Registrants:");
//        dayRegStartBib = keyboard.nextInt();
//        System.out.println("Enter the last bib number for race " 
//                + "Pre-Registrants:");
//        dayRegEndBib = keyboard.nextInt();

        System.out.println("\nPlease confirm your settings:");
        System.out.println("Total Prizes for Pre-Registrants: "
                + preRegPrizes);
//        System.out.println("Total Prizes for Day of Registrants: "
//                + dayRegPrizes);
        System.out.println("Total Prizes to be awarded: "
                + (/*preRegPrizes + */dayRegPrizes));
        System.out.println("Bib Number Ranges for Pre-Registrants");
        System.out.println("Starting Bib Number: " + preRegStartBib);
        System.out.println("Ending Bib Number: " + preRegEndBib);
//        System.out.println("Bib Number Ranges for Day of Registrants");
//        System.out.println("Starting Bib Number: " + dayRegStartBib);
//        System.out.println("Ending Bib Number: " + dayRegEndBib);

        System.out.println("\nAre these values correct? Enter Y or N");
        String correctValues = keyboard.next();
        if (correctValues.equals("N")) {
            System.out.println("Exiting Program. Please Re-Start.");
            System.exit(0);
        }

    }

    public int getTotalPrizes() {
        return preRegPrizes;
    }

    public int getStartBibNum() {
        return preRegStartBib;
    }

    public int getEndBibNum() {
        return preRegEndBib;
    }

}