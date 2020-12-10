package madlib;

import java.util.Scanner;

class IoUtils {

    private static Scanner sc;
    private static String outputMode = "sout";

    static Scanner getScanner() {
        if (sc == null) {
            sc = new Scanner(System.in);
        }
        return sc;
    }

    static String nullCoalesceStr(String str, String defaultStr) {
        return (str == null) ? defaultStr : str;
    }

    static void output(String str) {
        switch (outputMode) {
            case "sout": {
                System.out.println(str);
                break;
            }
            case "html": {
                // write html
                break;
            }
            case "file": {
                // write to file
                break;
            }
            // additional implementations of output
        }
    }

}
