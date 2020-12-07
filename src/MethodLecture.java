public class MethodLecture {

    /*

        Lecture Outline:

            - Defining Methods (parts of a method)
            - Method Parameters
            - Calling methods
            Method Overloading
            Recursion
     */


//    public static void printCohortName(String name) {
//        System.out.println(name);
//    }

//    public static void main(String[] args) {

//        printCohortName("Luna");
//        printCohortName("Jupiter");
//        printCohortName("Apex");
//

//        // ------ DEFINING AND CALLING METHODS WITH VARIOUS INPUTS
//        sayGreeting();
//        sayInput("Howdy");
//        int x = returnSeven() + returnSeven();
//        System.out.println(returnSeven() + returnSeven());

//        System.out.println(returnInt(3));

//        System.out.println(returnAge(3));


//        returnProductOfThreeNums(2.4, 8.7, 9);
//
//
//        // ------ OVERLOADING
//        sayHello();
//        sayHello(10);
//        sayHello("John");
//        sayHello("Salutations", "Kevin");
//
//
//
//        // ------ RECURSION

//        countTo100Loop(1);
//        countTo100(1);
//        soutHello();

//    }

    // ----------- DEFINING AND CALLING METHODS WITH VARIOUS INPUTS (examples)

    // no input or returned output
//            public static void sayGreeting() {
//                System.out.println("Hello");
//            }

    // no returned output with input
//            public static void sayInput(String input) {
//                System.out.println(input);
//            }

    // returned output without input
//            public static int returnSeven() {
//                return 7;
//            }

    // return output given an input
//            public static int returnInt(int someInt) {
//                return someInt;
//            }

//            public static String returnAge(int age) {
//                return "The user age is: " + (age * 2);
//            }

    // return type based on multiple inputs
//            public static double returnProductOfThreeNums(double num1, double num2, double num3) {
//                int x = 5;
//                int y = 6;
//                String z = "bob";
//                return num1 * num2 * num3;
//            }


    // ----------- OVERLOADING


//        public static String sayHello() {
//            return "hello";
//        }
//
//        public static void sayHello() {
//            System.out.println("hello");
//        }

//        public static void sayHello(int times) {
//            for (int i = 0; i < times; i += 1) {
//                sayHello();
//            }
//        }
//            public static void sayHello() {
//                sayHello("Hello", "World");
//            }
//        public static void sayHello(String greeting) {
//            System.out.println(greeting);
//        }
//            public static void sayHello(String name) {
//                sayHello("Hello", name);
//            }
//            public static void sayHello(String greeting, String name) {
//                System.out.println(greeting + ", " + name + "!");
//            }



        //    public static double sayHello(double x) {
        //        return x;
        //    }

    // ----------- RECURSION - where a method invokes itself

//    public static void soutHello(int num) {
//        if (num > 10) {
//            return;
//        }
//        System.out.println("hello");
//        soutHello(num + 1);
//    }
//
//    public static void helloLoop() {
//        for (int i = 0; i < 10; i += 1) {
//            System.out.println("hello");
//        }
//    }
//
//    public static void main(String[] args) {
//        soutHello(1);
////        helloLoop();
//    }



        //    public static void countTo100Loop(int num) {
        //        for (int i = num; i <= 100; i += 1) {
        //            System.out.println(i);
        //        }
        //    }
        //
        //    public static int countTo100(int num) {
        //        System.out.println(num);
        //        return num == 100 ? num : countTo100(++num);
        //    }
        //
        //    public static int powerOf10(int n) {
        //        if (n == 0) {
        //            return 1;
        //        }
        //        return powerOf10(n-1) * 10;
        //    }
        //


}

