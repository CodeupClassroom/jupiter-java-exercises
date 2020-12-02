public class SyntaxLecture {

    public static void main(String[] args) {


        // ================== STATEMENTS (s-3)

        // Statements may be...
        // Declarations
//                 int x; // primitive
//                 String y; // reference type

        // Assignment expressions
//                 x = 3;

//                 String x;
//                 x = "bob";

//                 System.out.println(x);
//                 x = 4;
//                 System.out.println(x);


        // Any use of ++ or --

//        int x = 5;
//        System.out.println(++x); // 6
//        System.out.println(x++); // 6
//        System.out.println(x); // 7

        // Method invocations
//                 Math.random();

        // Object creation expressions
//                 SomeObject = new SomeObject();

        // ================== COMMENTS (s-4)

        // single line comment

        /*

            multi-line comment

         */

        /**
         * Comment block
         */

//        System.out.println("test");


        // ================== DATA TYPES (s-5, 6, 7)



//            int primitiveExample = 3;
//            System.out.println(primitiveExample);


//            Student referenceExample = new Student();


        // use the smallest type needed for the job


        // primitive types...

//            byte age = -32;
//            short minimumAnnualSalary = 15080;
//            int distanceToSaturnInKm = 1200000000;
//            long numberOfHumanCells = 3000000000L; // L needed for compiler


//            byte s = -128;
//            --s;
//            System.out.println(s);


//            System.out.println(numberOfHumanCells);
//            float lengthOfBacteriaInInches = 0.00004F; // F needed for compiler
//            System.out.println(lengthOfBacteriaInInches);
//            double widthOfAtomInMeters = .00000000001;
//            char seatingSection = 'M'; // must wrap in single quotes
//            boolean everythingIsAwesome = false;

//            String bool = "false";
//            boolean bool2 = Boolean.parseBoolean(bool);
//            System.out.println(bool2);

        // strings (not a primitive type)

                 String thisIsAString = "Hello";



//              like in JS, strings must escape certain characters like quotes and use it to inject newline characters and other formatting

//        System.out.println("Hello\nWorld");
//        System.out.print("Hello");
//        System.out.print("World");

//        System.out.println("He said \"Hi\"");
//
//        String hello = "Hello";
//        char someLetter = hello.charAt(0);
//        System.out.println(someLetter);


        // ================== VARIABLES (s-8)

        // declaration separate from initialization

//             int seven;
//             seven = 7;
//            System.out.println(seven);

        // declaration and initialization

//             int eight = 8;
//        System.out.println(eight);


        // ================== IDENTIFIERS AND KEYWORDS (s-9)

        // see curriculum



        // ================== CONSTANTS (s-10)

        // see curriculum

//        final int SIDES_OF_A_DICE = 6;


        // ================== EXPRESSIONS (s-11)

        // basically the same as JS


        // ================== OPERATORS (s-12)

        // basically the same as JS


        // ================== ASSIGNMENT STATEMENTS (s-13)

        // basically the same as JS


        // ================== CASTING (s-14)

        // Link on casting... http://www.javainterviewpoint.com/type-casting-java-implicit-explicit-casting/


        // IMPLICIT
//            short x = 4;
//            int y = x;
//        System.out.println(x);
//        System.out.println(y);


        // EXPLICIT
//            int a = 2000001;
//            byte b = (byte) a;
//        System.out.println(a);
//        System.out.println(b);






        // implicit casting - less to more precise (widening)

//                 float num1 = 2.22F;
//                 double num2 = num1;



        // explicit casting - more to less explicit casting (narrowing)

//                 double num3 = 3.1;
//                 float num4 = (float) num3;
//
//                System.out.println(num4);


//        int num = 3000;
//        byte num2 = (byte) num;
//        System.out.println(num2);


    }

}
