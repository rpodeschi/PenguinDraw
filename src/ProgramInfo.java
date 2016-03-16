/**
 * Class:       ProgramInfo
 * Purpose:     Helper class for program information
 * Author:      RJ Podeschi
 * Date:        4/9/14
 *
 * Audit Trail: 15-MAR-16, RJ: Code clean up.
 */
public class ProgramInfo {

    private final static String PROG_NAME = "Penguin Draw";
    private final static String AUTHOR = "RJ Podeschi";
    private final static String VERSION = "1.1.2";
    private final static String LAST_MOD_DATE = "15-MAR-2016";

    /**
     * printHeader displays general program information.

     */
    public void printHeader() {
        System.out.println(PROG_NAME);
        System.out.println("Version: " + VERSION);
        System.out.println("Last Release: " + LAST_MOD_DATE);
        System.out.println("Author: " + AUTHOR);
        System.out.println();
        System.out.println("-------------------------------------------");
    }
}