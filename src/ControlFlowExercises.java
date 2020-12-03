import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        int i = 5;

        while(i <= 15) {
            System.out.print(i);
            System.out.print(" ");
            i += 1;
        }

//        int counter = 0;
//
//        do{
//            System.out.println(counter);
//            counter += 2;
//        }while(counter <= 100);

//        int counter = 100;
//
//        do{
//            System.out.println(counter);
//            counter -= 5;
//        }while(counter >= -10);

        long start = 2L;
        do{
            System.out.println(start);
            start *= start;
        }while(start < 1000000L);

        //        for (int i = 100; i >= 0; i -= 2) {
//            System.out.println(i);
//        }

//        long i;
//
//        for (i = 2L; i < 1000000L; i *= i) {
//            System.out.println(i);
//        }


//        Fizz - 3
//        Buzz - 5
//        FizzBuzz = 15
//        for(i = 0; i <= 100; i += 1){
//            if(i % 15 == 0){
//                System.out.println("FizzBuzz");
//            } else if(i % 5 == 0){
//                System.out.println("Buzz");
//            } else if(i % 3 == 0){
//                System.out.println("Fizz");
//            } else {
//                System.out.println(i);
//            }
//        }

        Scanner sc = new Scanner(System.in);

            boolean userContinues = true;

            do {
                System.out.print("What number would you like to go up to? ");
                int userInt = sc.nextInt();
                System.out.println();
                System.out.println("Here is your table!");
                System.out.println();
                System.out.println("number | squared | cubed");
                System.out.println("------ | ------- | -----");
                for (i = 1; i <= userInt; i += 1) {
                    System.out.format("%-7d", i);
                    System.out.print("|");
                    System.out.format(" %-8d", i * i);
                    System.out.print("|");
                    System.out.format(" %-9d", i * i * i);
                    System.out.println();
                }
                System.out.print("Would you like to enter another number (y/n)? ");
                String userResponse = sc.next();
                if (!userResponse.equalsIgnoreCase("y")) {
                    userContinues = false;
                }
            } while (userContinues);

            boolean anotherGrade = true;
            do {
                System.out.print("Please enter a numerical grade from 0 to 100 ");

                int numericGrade = sc.nextInt();

                if (numericGrade >= 88) {
                    System.out.println("A");
                } else if (numericGrade >= 80) {
                    System.out.println("B");
                } else if (numericGrade >= 67) {
                    System.out.println("C");
                } else if (numericGrade >= 60) {
                    System.out.println("D");
                } else {
                    System.out.println("F");
                }
                System.out.print("Do you wish to enter a new grade? (y/n) ");
                String userResponse = sc.next();
                if (!userResponse.equalsIgnoreCase("y")) {
                    anotherGrade = false;
                }
            } while (anotherGrade);

    }
}
