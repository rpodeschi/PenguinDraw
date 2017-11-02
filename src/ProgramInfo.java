/**
 * Class:       ProgramInfo
 * Purpose:     Helper class for program information
 * Author:      RJ Podeschi
 * Date:        4/9/14
 *
 * Audit Trail: 15-MAR-16, RJ: Code clean up.
 *              27-OCT-17, RJ: Update version information.
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
**/

public class ProgramInfo {

    private final static String PROG_NAME = "Penguin Draw";
    private final static String AUTHOR = "RJ Podeschi";
    private final static String VERSION = "1.2.1";
    private final static String LAST_MOD_DATE = "27-OCT-2017";

    /**
     * splashDialog displays general program information.
     */
    public void splashDialog() {
        
        System.out.println("Program: " + PROG_NAME);
        System.out.println("Author: " + AUTHOR);
        System.out.println("Version: " + VERSION);
        System.out.println("Last Release Date: " + LAST_MOD_DATE);

    }
}