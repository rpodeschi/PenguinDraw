/*
 * Author:      RJ Podeschi
 * Date:        3-27-14
 * Program:     RandomWinners.java
 * 
 * Purpose:     To generate a set of randcom bib numbers to be used
 *              for prizes at Penguin in the Park. 
 */
// Values for 2014. Prizes 49, start 7925, end 8905

import java.util.*;

public class RandomWinners
{

    public static void main(String[] args) {

        ProgramInfo header = new ProgramInfo();
        header.printHeader();

        Scanner keyboard = new Scanner(System.in);

        Prizes award = new Prizes();
        award.inputPrizeValues();

        System.out.println("Prize Table\nWinning Numbers");
        System.out.println("----------------------------");
//        System.out.println("Total Prizes: " + totalPrizes);
//        System.out.println("Random Numbers between Bib No."
//                + startBibNo + " and " + endBibNo);
//        System.out.println("----------------------------");
        int[] firstArray;
        int totalPrizes = award.getTotalPrizes();
        int startBibNo = award.getStartBibNum();
        int endBibNo = award.getEndBibNum();
        firstArray = new int[totalPrizes];

        for (int i = 1; i < totalPrizes; i++) {
            firstArray[i] = (int) (Math.random() *
                    (endBibNo - startBibNo)) + (startBibNo - 1);
        }
        Arrays.sort(firstArray);

        for (int j = 1; j < firstArray.length; j++) {
            if(firstArray[j] == firstArray[j - 1]) {
                firstArray[j] = (int) (Math.random() *
                        (endBibNo - startBibNo)) + (startBibNo - 1);
            }
        }

        for (int k = 1; k < firstArray.length; k++) {
            System.out.println(firstArray[k]);
        }
    }

}