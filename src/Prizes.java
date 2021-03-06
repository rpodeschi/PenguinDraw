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
 *                             Include Day-of registrations in prize draw
 *              27-OCT-17, RJ: Add helper methods to return day of registration
 *                              bib numbers and total prizes.
 *
 * Copyright (C) 2017 RJ Podeschi
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 *
 * Millikin University and Penguin in the Park, NFP, hereby disclaims 
 * all copyright interest in the program Penguin Draw 
 * (which makes passes at compilers) written by RJ Podeschi.
 *
 * signature of RJ Podeschi, October 27, 2017
 * Millikin University
 * Penguin in the Park, NFP
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
                + "Day of Race registrants:");
        dayRegPrizes = keyboard.nextInt();

        if (preRegPrizes == 0) {
            System.out.println("No Prizes will be awarded to "
                    + "race Pre-Registrants.");
        }
        else {
            System.out.println("All of the Bib Numbers for Pre-Registrants:");
            System.out.println("--------------------------------");
            System.out.println("Enter the first bib number for race Pre-Registrants:");
            preRegStartBib = keyboard.nextInt();
            System.out.println("Enter the last bib number for race Pre-Registrants:");
            preRegEndBib = keyboard.nextInt();
            System.out.println("--------------------------------");
            System.out.println("Bib Numbers for Day-of Registrations");
            System.out.println("--------------------------------");
            System.out.println("Enter the first bib number for Day-of Registrations");
            dayRegStartBib = keyboard.nextInt();
            System.out.println("Enter the lasb bib number for Day-of Registrations");
            dayRegEndBib = keyboard.nextInt();
        }

        System.out.println("\nPlease confirm your settings:");
        System.out.println("Total Prizes for Pre-Registrants: "
                + preRegPrizes);
        System.out.println("Total Prizes for Day of Registrants: "
                + dayRegPrizes);
        System.out.println("Total Prizes to be awarded: "
                + (preRegPrizes + dayRegPrizes));
        System.out.println("Bib Number Ranges for Pre-Registrants");
        System.out.println("Starting Bib Number: " + preRegStartBib);
        System.out.println("Ending Bib Number: " + preRegEndBib);
        System.out.println("Bib Number Ranges for Day of Registrants");
        System.out.println("Starting Bib Number: " + dayRegStartBib);
        System.out.println("Ending Bib Number: " + dayRegEndBib);

        System.out.println("\nAre these values correct? Enter Y or N");
        String correctValues = keyboard.next();
        if (correctValues.equals("N")) {
            System.out.println("Exiting Program. Please Re-Start Process.");
            System.exit(0);
        }
    }

    public int getPreRegPrizes() {
        return preRegPrizes;
    }
    
    public int getDayRegPrizes() {
        return dayRegPrizes;
    }

    public int getPreRegStartBibNum() {
        return preRegStartBib;
    }

    public int getPreRegEndBibNum() {
        return preRegEndBib;
    }
    
    public int getDayRegStartBibNum() {
        return dayRegStartBib;
    }
    
    public int getDayRegEndBibNum() {
        return dayRegEndBib;
    }
}