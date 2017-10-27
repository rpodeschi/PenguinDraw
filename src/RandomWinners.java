/**
 * Author:      RJ Podeschi
 * Date:        3-27-14
 * Class:       RandomWinners.java
 * 
 * Purpose:     To generate a set of randomly generated bib numbers to be used
 *              for prize drawings at Penguin in the Park.
 *
 * Audit Trail: 15-MAR-16, RJ: Remove comments and clean up code.
 *                             Add additional array.sort before printing.
 * Audit Trail: 27-OCT-17, RJ: Resolve duplicate number issue.
 *                               Use Random.ints Stream to pull distinct numbers.
 *                             Add day of registration winners.
 *                             Write winners to winners.csv
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
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class RandomWinners
{
    public static void main(String[] args) {

        ProgramInfo header = new ProgramInfo();
        header.splashDialog();

        Scanner keyboard = new Scanner(System.in);
        Random random = new Random();

        Prizes award = new Prizes();
        award.inputPrizeValues();
        
        System.out.println("Prize Table\nWinning Numbers");
        System.out.println("----------------------------");

        int[] preRegArray = new Random().ints(award.getPreRegStartBibNum(),award.getPreRegEndBibNum()).distinct().limit(award.getPreRegPrizes()).sorted().toArray();
        Arrays.sort(preRegArray);
        int[] dayRegArray = new Random().ints(award.getDayRegStartBibNum(),award.getDayRegEndBibNum()).distinct().limit(award.getDayRegPrizes()).sorted().toArray();
        Arrays.sort(dayRegArray);
        
        // Write the winners to the console and output to file.
        String userDir = "C:\\Users\\rpodeschi\\Documents\\NetBeansProjects\\PenguinDraw\\data\\";
        String outputFile = userDir + "winners.csv";

        PrintWriter outputStream = null;
        try
        {
            outputStream = new PrintWriter(outputFile);
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Error opening the file " + outputFile);
            System.exit(0);
        }
               
        // Print the pre-registration prizes to the console
        for (int i = 1; i < preRegArray.length; i++) {
            System.out.println(preRegArray[i]);
            outputStream.println(preRegArray[i]);
        }
        
        
        for (int j = 1; j < dayRegArray.length; j++) {
            System.out.println(dayRegArray[j]);
            outputStream.println(dayRegArray[j]);
        }
        
        outputStream.close();
        System.out.println("Winning bib numbers were written to " + outputFile);
    }
}