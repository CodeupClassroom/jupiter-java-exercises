package exceptionsLecture;

import java.util.ArrayList;
import java.util.Scanner;

public class ExceptionsLec {
    public static void main(String[] args) throws Exception {
//        https://stackoverflow.com/questions/18679090/when-to-catch-the-exception-vs-when-to-throw-the-exceptions

        System.out.println("Our program is running.");


        /* ******************************************************** */
        /* ********************* Try Catch ************************ */
        /* ******************************************************** */


//        String[] days = {"Monday", "Tuesday", "Wednesday"};
//        System.out.println(days[4]); //ArrayIndexOutOfBoundsException






        // TODO: Try/Catch with days array

//        try{
//            //try this code
//            String[] days = {"Monday", "Tuesday", "Wednesday"};
//            System.out.println(days[0]); //ArrayIndexOutOfBoundsException
//
//        } catch (ArrayIndexOutOfBoundsException e){
//            //if that code throws an error, catch it here, and do something!
////            System.out.println("There is an out of bounds exception with our days array!");
//            e.printStackTrace();
//
//        } catch (Exception e){
//            System.out.println("General Exception");
//            e.printStackTrace();
//
//        }






//        int[] numbers = null;
//        System.out.println(numbers[0]); //NullPointerException


        /*
         *
         * Note that only the most specific catch block executes.
         * In the example below, we never reach the catch block for Exception because a more specific catch block was invoked.
         *
         */

        //TODO: Try/catch with numbers array
//        try {
//            int[] numbers = null;
//            System.out.println(numbers[0]);
//        }catch (NullPointerException e){
//            System.out.println("Null pointer exception");
//            e.printStackTrace(System.out);
//        }catch (Exception e){
//            System.out.println("Try again!");
//            e.printStackTrace(System.out);
//        }





        try {
//            throw new Exception("Something went wrong! Oh no!!!!!"); // Generally wrong - last catch

//            throw new NullPointerException(); // Something went wrong message

//            throw new ArrayIndexOutOfBoundsException(); //Runtime exception happened


        } catch(NullPointerException e) {
            System.out.println(e.getMessage()); //This gets the message passed when the exception is thrown
            e.printStackTrace();
        } catch(RuntimeException e) {
            System.out.println("Runtime exception happened!!! HI JUpiter!!");
            e.printStackTrace();
        } catch(Exception e) {
            System.out.println("Something went wrong generally");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }







        /* ******************************************************** */
        /* ********************** Finally Block ******************* */
        /* ******************************************************** */

//        int[] numbers = {1, 2, 3};
//        int x = 5;
//
//        try {
////            x = numbers[1];
//
//            //TODO: Change the index to 5
//            x = numbers[5];
//
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Exception caught!");
//            x = 0;
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            System.out.println("This will always run.");
//            // normally used for "clean up" like closing file streams or DB connections
//        }
//
//        System.out.println("The value of x: " + x);

//
//        System.out.println("Yay our code keeps running!");


        /* ******************************************************** */
        /* ******************* CALLING A METHOD ******************* */
        /* ******************************************************** */
//        thisHandlesAnException();






        /* ******************************************************** */
        /* *********** TRY/CATCH VS METHOD SIGNATURE ************** */
        /* ******************************************************** */

        String indentationPreference;

        try {
            indentationPreference = getIndentationPreference();
            System.out.println("Okay, " + indentationPreference + " is a great choice.");
        } catch (Exception e) {
            System.out.println("Uh oh, something went wrong: " + e.getMessage());
            System.out.println("Here is some more detail:");
            e.printStackTrace();
        }

//        String indentationPreference = getIndentationPreference();
//        System.out.println("Okay, " + indentationPreference + " is a great choice.");
    }





    public static void thisHandlesAnException() {
        try {
            throw new Exception("Yep, an exception again :(");
        } catch (Exception e) {
            System.out.println("EXCEPTION!!!");
            System.out.println(e.getMessage());
            e.printStackTrace(System.out);
        }
    }





    public static String getIndentationPreference() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("What type of indentation do you prefer?");
        String indentationPreference = sc.nextLine();

        if (indentationPreference.equals("tabs")) {
            throw new Exception("Spaces are superior!");
        }

        return indentationPreference;
    }
}
