package inheritanceLecture;

public class JavaDeveloper extends Developer{
    public JavaDeveloper(){

    }

//    This creates JavaDeveloper's own implementation of the working method and calls on the doWork method from its superclass, Developer.
//    public void working(){
//        super.doWork();
//    }

    public JavaDeveloper(String name){
        super(name);
    }
    public static void main(String[] args) {
        JavaDeveloper Sophie = new JavaDeveloper("Sophie");
        System.out.println(Sophie.name);
        Sophie.doWork();
        Sophie.working();
    }
}
