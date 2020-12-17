package grades;

import collections.HashMaps;
import util.Input;

import java.util.HashMap;
import java.util.Map;

public class GradesApplication {
    public static void main(String[] args) {
        initialize();
    }

    public static void initialize(){
        Map<String, Student> students = getStudents();
        System.out.println("Welcome!");
        Input in = new Input();

        do {
            // this should be broken into multiple method calls
            System.out.println("\nHere are the GitHub usernames of our students:\n");
            System.out.println(listStudents(students) + "\n");
            String userChoice = in.getString("What student would you like to see more information on?\n");
            System.out.println();
            if (students.containsKey(userChoice)) {
                System.out.println(listStudentInfo(students.get(userChoice), userChoice));
            } else {
                System.out.println("Sorry, no student found with the GitHub username of " + userChoice + ".");
            }
            System.out.println();
        } while(in.yesNo("Would you like to see another student (type yes or no)?\n"));
    }

    public static String listStudentInfo(Student s, String key) {
        return String.format("Name: %s - GitHub UserName: %s%nCurrentAverage: %.2f", s.getName(), key, s.getGradeAverage());
    }

    public static String listStudents(Map<String, Student> mapOfStudents) {
        String output = "";
        // .keySet will return a list of keys from students
        for (String key : mapOfStudents.keySet()) {
            output += String.format("|%s| ", key);
        }
        return output.trim();
    }

    public static Map<String, Student> getStudents(){
        Map<String, Student> students = new HashMap<>();

        Student s1 = new Student("Fred");
        s1.addGrade(80);
        s1.addGrade(100);
        s1.addGrade(90);

        Student s2 = new Student("Sally");
        s2.addGrade(100);
        s2.addGrade(95);
        s2.addGrade(100);

        Student s3 = new Student("George");
        s3.addGrade(50);
        s3.addGrade(100);
        s3.addGrade(75);

        Student s4 = new Student("Kyle");
        s4.addGrade(0);
        s4.addGrade(50);
        s4.addGrade(25);

        students.put("fred5", s1);
        students.put("sally5", s2);
        students.put("george5", s3);
        students.put("kyle5", s4);

        return students;
    }
}
