package annotationsLecture;

import java.util.ArrayList;
import java.util.List;

public class AnnotationsLecture {
    public static int someNum = 3;

    public static void main(String[] args) {

//        https://javarevisited.blogspot.com/2015/09/what-is-suppresswarnings-annotation-in-java-unchecked-raw-serial.html#axzz6goBrQ6Sy

        Child child1 = new Child();

        //TODO TOGETHER: Call deprecated method & no comment
        //TODO TOGETHER: Call deprecated method with comment
//        child1.sayHello();




        //TODO TOGETHER:Call sayHello without @Override
        //TODO TOGETHER: Comment out annotation and change Parent sayHello no sayHelloParent (Notice there is no error!)
//        child1.deprecatedMethod();


//        doRiskyThings();

    }

    //TODO Together: explore analyze > inspect code



    //TODO Together: Use @SuppressWarnings
//    @SuppressWarnings("deprecation rawtypes unused unchecked")
//    @SuppressWarnings("all")
    public static void doRiskyThings(){
        Child riskyChild = new Child();
        riskyChild.oldMethod(); //static access & deprecation

        List l = new ArrayList(); // raw use warning
        l.add("test"); // unchecked warning
        int three = 3; // unused warning

        System.out.println(l);
        AnnotationsLecture al = new AnnotationsLecture();
        System.out.println(al.someNum); // static-access warning

        String someName = "Fred"; // unused


        // Notice these warnings are still present!
        if (true) {
            ;
        }

        Boolean test = true; //
        if (test) {
            System.out.println("TRUE!");
        }
    }

}