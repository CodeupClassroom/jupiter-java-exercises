package oopLecture;

public class Person {

//        // SLIDE 3
//        public String firstName;
//        public String lastName = "Smith";
//        public char age;



        // SLIDE 4

//        // instance variables
//        public String firstName;
//        public String lastName;
//
//        // instance method
//        public String sayHello(char punctuation) {
//                return lastName + ", " + firstName + " says hi" + punctuation;
//        }
//
//        public String sayHello() {
//                return lastName + ", " + firstName + " says hi!";
//        }



        // SLIDE 7
        public static long worldPopulation = 7_500_000_000L; // class property
        public String name;                            // instance property

        public void sayName(int length) {
                if (name.length() > length) {
                        System.out.println("My long name is: " + name);
                } else {
                        System.out.println("My name is: " + name);
                }
        }

        public void sayName() {
                System.out.println("My name is: " + name);
        }

        public static String findLongestName(Person p1, Person p2) {
                if (p1.name.length() > p2.name.length()) {
                        return p1.name;
                } else {
                        return p2.name;
                }
        }

        public static void main(String[] args) {

//                System.out.println(Person.worldPopulation);
//                Person.worldPopulation -= 1;
//                System.out.println(worldPopulation);
//
//
                Person theBestDrummerAlive = new Person();
                theBestDrummerAlive.name = "Neil Peart";
                theBestDrummerAlive.sayName();

                Person notADrummer = new Person();
                notADrummer.name = "Justin";

                notADrummer.sayName();

                String longestName = Person.findLongestName(theBestDrummerAlive, notADrummer);
                System.out.println(longestName);

                Person.worldPopulation += 1; // accessing a static property
//                // this also works, but is usually not a good idea
//                System.out.println(theBestDrummerAlive.worldPopulation); // 7500000001
//                // DONT DO THIS, it will not compile
//                 System.out.println(Person.name);
        }

}
