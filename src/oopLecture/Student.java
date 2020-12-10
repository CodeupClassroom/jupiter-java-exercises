package oopLecture;

class Student {

    // ======================== slide 8 (constructors)

//        public String name;
//        public String cohort;
//
//        public void testMethod() {
//            System.out.println("Will this run?");
//        }
//
//        public Student() {
//            System.out.println("New student created!");
//            testMethod();
//        }
//
//        public Student(String studentName) {
//            this();
//            name = studentName;
//            cohort = "Unassigned";
//        }
//
//        public Student(String studentName, String assignedCohort) {
//            name = studentName;
//            cohort = assignedCohort;
//        }
//

    // ======================== slide 9 (this keyword)

//        public String name;
//        public String cohort;
//
//        public Student(String name) {
//            this(name, "Unassigned");
//        }
//
//        public Student(String name, String cohort) {
//            this.name = name;
//            this.cohort = cohort;
//        }
//
//        public String sayHello() {
//            return "Hello from " + this.name + "!";
//        }


    // ======================== slide 10 (visibility)

        private String name;
        private double grade;

        public Student(String name, double grade) {
            this.name = name;
            this.grade = grade;
        }

        // getter
        public double shareGrade() {
            return grade;
        }

        // setter
        public void changeGrade(double grade) {
            this.grade = grade;
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
